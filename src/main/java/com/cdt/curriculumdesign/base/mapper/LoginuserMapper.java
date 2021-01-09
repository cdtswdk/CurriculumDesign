package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Loginuser;
import com.cdt.curriculumdesign.base.model.LoginuserExample;
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

@Generated("loginuser")
@Mapper
public interface LoginuserMapper {
    @SelectProvider(type=LoginuserSqlProvider.class, method="countByExample")
    long countByExample(LoginuserExample example);

    @DeleteProvider(type=LoginuserSqlProvider.class, method="deleteByExample")
    int deleteByExample(LoginuserExample example);

    @Delete({
        "delete from loginuser",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into loginuser (username, password, ",
        "userType)",
        "values (#{username,jdbcType=BIGINT}, #{password,jdbcType=VARCHAR}, ",
        "#{usertype,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insert(Loginuser record);

    @InsertProvider(type=LoginuserSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="id")
    int insertSelective(Loginuser record);

    @SelectProvider(type=LoginuserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.BIGINT),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="userType", property="usertype", jdbcType=JdbcType.CHAR)
    })
    List<Loginuser> selectByExample(LoginuserExample example);

    @Select({
        "select",
        "id, username, password, userType",
        "from loginuser",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.BIGINT),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="userType", property="usertype", jdbcType=JdbcType.CHAR)
    })
    Loginuser selectByPrimaryKey(Integer id);

    @UpdateProvider(type=LoginuserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Loginuser record, @Param("example") LoginuserExample example);

    @UpdateProvider(type=LoginuserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Loginuser record, @Param("example") LoginuserExample example);

    @UpdateProvider(type=LoginuserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Loginuser record);

    @Update({
        "update loginuser",
        "set username = #{username,jdbcType=BIGINT},",
          "password = #{password,jdbcType=VARCHAR},",
          "userType = #{usertype,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Loginuser record);
}