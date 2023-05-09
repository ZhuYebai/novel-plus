package com.java2nb.system.domain;

import java.io.Serializable;


import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.java2nb.common.jsonserializer.LongToStringSerializer;


import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;



/**
 * 微信消息
 * 
 * @author zhuyebai
 * @email 1179705413@qq.com
 * @date 2023-05-09 21:45:44
 */
public class WxMessageDO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	//主键
		//java中的long能表示的范围比js中number大,也就意味着部分数值在js中存不下(变成不准确的值)
	//所以通过序列化成字符串来解决
	@JsonSerialize(using = LongToStringSerializer.class)
			private Long id;
	//菜单id
		//java中的long能表示的范围比js中number大,也就意味着部分数值在js中存不下(变成不准确的值)
	//所以通过序列化成字符串来解决
	@JsonSerialize(using = LongToStringSerializer.class)
			private Long menuNum;
	//标题
			private String title;
	//图片地址
			private String picurl;
	//跳转地址
			private String url;
	//图文描述
			private String description;
	//消息类型
			private String msgType;
	//菜单名称
			private String menuName;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：菜单id
	 */
	public void setMenuNum(Long menuNum) {
		this.menuNum = menuNum;
	}
	/**
	 * 获取：菜单id
	 */
	public Long getMenuNum() {
		return menuNum;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：图片地址
	 */
	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
	/**
	 * 获取：图片地址
	 */
	public String getPicurl() {
		return picurl;
	}
	/**
	 * 设置：跳转地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：跳转地址
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：图文描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：图文描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：消息类型
	 */
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	/**
	 * 获取：消息类型
	 */
	public String getMsgType() {
		return msgType;
	}
	/**
	 * 设置：菜单名称
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * 获取：菜单名称
	 */
	public String getMenuName() {
		return menuName;
	}
}
