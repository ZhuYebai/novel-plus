package com.java2nb.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.ApiOperation;


import com.java2nb.system.domain.WxMessageDO;
import com.java2nb.system.service.WxMessageService;
import com.java2nb.common.utils.PageBean;
import com.java2nb.common.utils.Query;
import com.java2nb.common.utils.R;

/**
 * 微信消息
 *
 * @author zhuyebai
 * @email 1179705413@qq.com
 * @date 2023-05-09 21:45:44
 */

@Controller
@RequestMapping("/system/wxMessage")
public class WxMessageController {
    @Autowired
    private WxMessageService wxMessageService;

    @GetMapping()
    @RequiresPermissions("system:wxMessage:wxMessage")
    String WxMessage() {
        return "system/wxMessage/wxMessage";
    }

    @ApiOperation(value = "获取微信消息列表", notes = "获取微信消息列表")
    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("system:wxMessage:wxMessage")
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<WxMessageDO> wxMessageList = wxMessageService.list(query);
        int total = wxMessageService.count(query);
        PageBean pageBean = new PageBean(wxMessageList, total);
        return R.ok().put("data", pageBean);
    }

    @ApiOperation(value = "新增微信消息页面", notes = "新增微信消息页面")
    @GetMapping("/add")
    @RequiresPermissions("system:wxMessage:add")
    String add() {
        return "system/wxMessage/add";
    }

    @ApiOperation(value = "修改微信消息页面", notes = "修改微信消息页面")
    @GetMapping("/edit/{id}")
    @RequiresPermissions("system:wxMessage:edit")
    String edit(@PathVariable("id") Long id, Model model) {
            WxMessageDO wxMessage = wxMessageService.get(id);
        model.addAttribute("wxMessage", wxMessage);
        return "system/wxMessage/edit";
    }

    @ApiOperation(value = "查看微信消息页面", notes = "查看微信消息页面")
    @GetMapping("/detail/{id}")
    @RequiresPermissions("system:wxMessage:detail")
    String detail(@PathVariable("id") Long id, Model model) {
			WxMessageDO wxMessage = wxMessageService.get(id);
        model.addAttribute("wxMessage", wxMessage);
        return "system/wxMessage/detail";
    }

    /**
     * 保存
     */
    @ApiOperation(value = "新增微信消息", notes = "新增微信消息")
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("system:wxMessage:add")
    public R save( WxMessageDO wxMessage) {
        if (wxMessageService.save(wxMessage) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ApiOperation(value = "修改微信消息", notes = "修改微信消息")
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("system:wxMessage:edit")
    public R update( WxMessageDO wxMessage) {
            wxMessageService.update(wxMessage);
        return R.ok();
    }

    /**
     * 删除
     */
    @ApiOperation(value = "删除微信消息", notes = "删除微信消息")
    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("system:wxMessage:remove")
    public R remove( Long id) {
        if (wxMessageService.remove(id) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @ApiOperation(value = "批量删除微信消息", notes = "批量删除微信消息")
    @PostMapping("/batchRemove")
    @ResponseBody
    @RequiresPermissions("system:wxMessage:batchRemove")
    public R remove(@RequestParam("ids[]") Long[] ids) {
            wxMessageService.batchRemove(ids);
        return R.ok();
    }

}
