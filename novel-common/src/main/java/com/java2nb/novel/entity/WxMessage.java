package com.java2nb.novel.entity;

import javax.annotation.Generated;

public class WxMessage {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long menuNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String picurl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String msgType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String menuName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getMenuNum() {
        return menuNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuNum(Long menuNum) {
        this.menuNum = menuNum;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTitle() {
        return title;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPicurl() {
        return picurl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUrl() {
        return url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDescription() {
        return description;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMsgType() {
        return msgType;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMenuName() {
        return menuName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }
}