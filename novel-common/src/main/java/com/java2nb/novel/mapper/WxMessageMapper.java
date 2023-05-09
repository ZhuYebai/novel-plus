package com.java2nb.novel.mapper;

import static com.java2nb.novel.mapper.WxMessageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.java2nb.novel.entity.WxMessage;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface WxMessageMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, menuNum, title, picurl, url, description, msgType, menuName);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<WxMessage> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<WxMessage> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WxMessageResult")
    Optional<WxMessage> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WxMessageResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="menu_num", property="menuNum", jdbcType=JdbcType.BIGINT),
        @Result(column="Title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="picUrl", property="picurl", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="msg_type", property="msgType", jdbcType=JdbcType.VARCHAR),
        @Result(column="menu_name", property="menuName", jdbcType=JdbcType.VARCHAR)
    })
    List<WxMessage> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, wxMessage, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, wxMessage, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(WxMessage record) {
        return MyBatis3Utils.insert(this::insert, record, wxMessage, c ->
            c.map(id).toProperty("id")
            .map(menuNum).toProperty("menuNum")
            .map(title).toProperty("title")
            .map(picurl).toProperty("picurl")
            .map(url).toProperty("url")
            .map(description).toProperty("description")
            .map(msgType).toProperty("msgType")
            .map(menuName).toProperty("menuName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<WxMessage> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, wxMessage, c ->
            c.map(id).toProperty("id")
            .map(menuNum).toProperty("menuNum")
            .map(title).toProperty("title")
            .map(picurl).toProperty("picurl")
            .map(url).toProperty("url")
            .map(description).toProperty("description")
            .map(msgType).toProperty("msgType")
            .map(menuName).toProperty("menuName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(WxMessage record) {
        return MyBatis3Utils.insert(this::insert, record, wxMessage, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(menuNum).toPropertyWhenPresent("menuNum", record::getMenuNum)
            .map(title).toPropertyWhenPresent("title", record::getTitle)
            .map(picurl).toPropertyWhenPresent("picurl", record::getPicurl)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(description).toPropertyWhenPresent("description", record::getDescription)
            .map(msgType).toPropertyWhenPresent("msgType", record::getMsgType)
            .map(menuName).toPropertyWhenPresent("menuName", record::getMenuName)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<WxMessage> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, wxMessage, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<WxMessage> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, wxMessage, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<WxMessage> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, wxMessage, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<WxMessage> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, wxMessage, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(WxMessage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(menuNum).equalTo(record::getMenuNum)
                .set(title).equalTo(record::getTitle)
                .set(picurl).equalTo(record::getPicurl)
                .set(url).equalTo(record::getUrl)
                .set(description).equalTo(record::getDescription)
                .set(msgType).equalTo(record::getMsgType)
                .set(menuName).equalTo(record::getMenuName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(WxMessage record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(menuNum).equalToWhenPresent(record::getMenuNum)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(picurl).equalToWhenPresent(record::getPicurl)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(description).equalToWhenPresent(record::getDescription)
                .set(msgType).equalToWhenPresent(record::getMsgType)
                .set(menuName).equalToWhenPresent(record::getMenuName);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(WxMessage record) {
        return update(c ->
            c.set(menuNum).equalTo(record::getMenuNum)
            .set(title).equalTo(record::getTitle)
            .set(picurl).equalTo(record::getPicurl)
            .set(url).equalTo(record::getUrl)
            .set(description).equalTo(record::getDescription)
            .set(msgType).equalTo(record::getMsgType)
            .set(menuName).equalTo(record::getMenuName)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(WxMessage record) {
        return update(c ->
            c.set(menuNum).equalToWhenPresent(record::getMenuNum)
            .set(title).equalToWhenPresent(record::getTitle)
            .set(picurl).equalToWhenPresent(record::getPicurl)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(description).equalToWhenPresent(record::getDescription)
            .set(msgType).equalToWhenPresent(record::getMsgType)
            .set(menuName).equalToWhenPresent(record::getMenuName)
            .where(id, isEqualTo(record::getId))
        );
    }
}