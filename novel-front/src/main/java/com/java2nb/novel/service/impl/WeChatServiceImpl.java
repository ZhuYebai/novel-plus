package com.java2nb.novel.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.XmlUtil;
import com.java2nb.novel.core.except.AesException;
import com.java2nb.novel.core.utils.WXPublicUtils;
import com.java2nb.novel.dto.WxMessageDto;
import com.java2nb.novel.entity.WxMessage;
import com.java2nb.novel.mapper.WxMessageMapper;
import com.java2nb.novel.service.WeChatService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhu
 * @date 2023/5/9
 * @description
 */
@Service
@Slf4j
public class WeChatServiceImpl implements WeChatService {

    @Autowired
    private WxMessageMapper wxMessageMapper;

    @Override
    public String weCheck(HttpServletRequest request) throws AesException {
        String msgSignature = request.getParameter("signature");
        String msgTimestamp = request.getParameter("timestamp");
        String msgNonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        if (WXPublicUtils.verifyUrl(msgSignature, msgTimestamp, msgNonce)) {
            return echostr;
        }
        return null;
    }

    @Override
    public String getMessage(HttpServletRequest request, WxMessageDto dto) {
        String msgSignature = request.getParameter("signature");
        String msgTimestamp = request.getParameter("timestamp");
        String msgNonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        StringBuilder sb = new StringBuilder("<xml>\n" +
                "  <ToUserName><![CDATA[" + dto.getFromUserName() + "]]></ToUserName>\n" +
                "  <FromUserName><![CDATA[" + dto.getToUserName() + "]]></FromUserName>\n" +
                "  <CreateTime>"+dto.getCreateTime()+"</CreateTime>\n");
        switch (dto.getMsgType()) {
            case "text":
                //处理文本消息
                disposeText(sb, dto.getContent());
                break;
            default:
                break;
        }
        sb.append("</xml>");
        return sb.toString();
    }

    private void disposeText(StringBuilder sb, String content) {
        //查询是否存在该返回信息逻辑
        List<WxMessage> select = wxMessageMapper.select(SelectDSLCompleter.allRows());
        List<WxMessage> collect = select.stream().filter(wxMessage -> wxMessage.getMenuNum().equals(Long.parseLong(content))).collect(Collectors.toList());
        if (CollUtil.isNotEmpty(collect)) {
            WxMessage wxMessage = collect.get(0);
            switch (wxMessage.getMsgType()) {
                case "news":
                    sb.append("  <MsgType><![CDATA[" + wxMessage.getMsgType() + "]]></MsgType>\n" +
                            "  <ArticleCount>1</ArticleCount>\n" +
                            "  <Articles>\n" +
                            "    <item>\n" +
                            "      <Title><![CDATA[" + wxMessage.getTitle() + "]]></Title>\n" +
                            "      <Description><![CDATA[" + wxMessage.getDescription() + "]]></Description>\n" +
                            "      <PicUrl><![CDATA[" + wxMessage.getPicurl() + "]]></PicUrl>\n" +
                            "      <Url><![CDATA[" + wxMessage.getUrl() + "]]></Url>\n" +
                            "    </item>\n" +
                            "  </Articles>\n");
                default:
                    break;
            }

            return;
        }
        //无逻辑，返回菜单
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("你发的信息小仙无法识别嗷！\n");
        stringBuilder.append("请回复以下数字：\n");
        for (WxMessage wxMessage : select) {
            stringBuilder.append(wxMessage.getMenuNum() + ". " + wxMessage.getMenuName());
        }
        sb.append("<MsgType><![CDATA[text]]></MsgType>\n");
        sb.append("<Content><![CDATA[" + stringBuilder + "]]></Content>\n");
    }
}
