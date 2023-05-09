package com.java2nb.novel.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WxMessageDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final WxMessage wxMessage = new WxMessage();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = wxMessage.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> menuNum = wxMessage.menuNum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> title = wxMessage.title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> picurl = wxMessage.picurl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> url = wxMessage.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> description = wxMessage.description;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> msgType = wxMessage.msgType;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuName = wxMessage.menuName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class WxMessage extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> menuNum = column("menu_num", JDBCType.BIGINT);

        public final SqlColumn<String> title = column("Title", JDBCType.VARCHAR);

        public final SqlColumn<String> picurl = column("picUrl", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> msgType = column("msg_type", JDBCType.VARCHAR);

        public final SqlColumn<String> menuName = column("menu_name", JDBCType.VARCHAR);

        public WxMessage() {
            super("wx_message");
        }
    }
}