package com.java2nb.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.java2nb.system.dao.WxMessageDao;
import com.java2nb.system.domain.WxMessageDO;
import com.java2nb.system.service.WxMessageService;



@Service
public class WxMessageServiceImpl implements WxMessageService {
	@Autowired
	private WxMessageDao wxMessageDao;
	
	@Override
	public WxMessageDO get(Long id){
		return wxMessageDao.get(id);
	}
	
	@Override
	public List<WxMessageDO> list(Map<String, Object> map){
		return wxMessageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxMessageDao.count(map);
	}
	
	@Override
	public int save(WxMessageDO wxMessage){
		return wxMessageDao.save(wxMessage);
	}
	
	@Override
	public int update(WxMessageDO wxMessage){
		return wxMessageDao.update(wxMessage);
	}
	
	@Override
	public int remove(Long id){
		return wxMessageDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return wxMessageDao.batchRemove(ids);
	}
	
}
