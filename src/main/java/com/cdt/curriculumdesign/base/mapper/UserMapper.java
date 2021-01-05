package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.User;
import com.cdt.curriculumdesign.base.model.UserExample;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Generated("user")
@Mapper
public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (userName, passWord, ",
        "realName)",
        "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{realname,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passWord", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="realName", property="realname", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, userName, passWord, realName",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="passWord", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="realName", property="realname", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set userName = #{username,jdbcType=VARCHAR},",
          "passWord = #{password,jdbcType=VARCHAR},",
          "realName = #{realname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}