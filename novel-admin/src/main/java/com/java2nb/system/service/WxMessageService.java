package com.java2nb.system.service;

import com.java2nb.system.domain.WxMessageDO;

import java.util.List;
import java.util.Map;

/**
 * 微信消息
 * 
 * @author zhuyebai
 * @email 1179705413@qq.com
 * @date 2023-05-09 21:45:44
 */
public interface WxMessageService {
	
	WxMessageDO get(Long id);
	
	List<WxMessageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxMessageDO wxMessage);
	
	int update(WxMessageDO wxMessage);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
