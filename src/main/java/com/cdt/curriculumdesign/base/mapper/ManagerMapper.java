package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Manager;
import com.cdt.curriculumdesign.base.model.ManagerExample;
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

@Generated("manager")
@Mapper
public interface ManagerMapper {
    @SelectProvider(type=ManagerSqlProvider.class, method="countByExample")
    long countByExample(ManagerExample example);

    @DeleteProvider(type=ManagerSqlProvider.class, method="deleteByExample")
    int deleteByExample(ManagerExample example);

    @Delete({
        "delete from manager",
        "where ManagerId = #{managerid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long managerid);

    @Insert({
        "insert into manager (ManagerDeptId, ManagerMajorId, ",
        "ManagerName, ManagerSex, ",
        "ManagerBirthdy, ManagerPassword)",
        "values (#{managerdeptid,jdbcType=BIGINT}, #{managermajorid,jdbcType=BIGINT}, ",
        "#{managername,jdbcType=VARCHAR}, #{managersex,jdbcType=CHAR}, ",
        "#{managerbirthdy,jdbcType=DATE}, #{managerpassword,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="managerid")
    int insert(Manager record);

    @InsertProvider(type=ManagerSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="managerid")
    int insertSelective(Manager record);

    @SelectProvider(type=ManagerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ManagerId", property="managerid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ManagerDeptId", property="managerdeptid", jdbcType=JdbcType.BIGINT),
        @Result(column="ManagerMajorId", property="managermajorid", jdbcType=JdbcType.BIGINT),
        @Result(column="ManagerName", property="managername", jdbcType=JdbcType.VARCHAR),
        @Result(column="ManagerSex", property="managersex", jdbcType=JdbcType.CHAR),
        @Result(column="ManagerBirthdy", property="managerbirthdy", jdbcType=JdbcType.DATE),
        @Result(column="ManagerPassword", property="managerpassword", jdbcType=JdbcType.VARCHAR)
    })
    List<Manager> selectByExample(ManagerExample example);

    @Select({
        "select",
        "ManagerId, ManagerDeptId, ManagerMajorId, ManagerName, ManagerSex, ManagerBirthdy, ",
        "ManagerPassword",
        "from manager",
        "where ManagerId = #{managerid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ManagerId", property="managerid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ManagerDeptId", property="managerdeptid", jdbcType=JdbcType.BIGINT),
        @Result(column="ManagerMajorId", property="managermajorid", jdbcType=JdbcType.BIGINT),
        @Result(column="ManagerName", property="managername", jdbcType=JdbcType.VARCHAR),
        @Result(column="ManagerSex", property="managersex", jdbcType=JdbcType.CHAR),
        @Result(column="ManagerBirthdy", property="managerbirthdy", jdbcType=JdbcType.DATE),
        @Result(column="ManagerPassword", property="managerpassword", jdbcType=JdbcType.VARCHAR)
    })
    Manager selectByPrimaryKey(Long managerid);

    @UpdateProvider(type=ManagerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    @UpdateProvider(type=ManagerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    @UpdateProvider(type=ManagerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Manager record);

    @Update({
        "update manager",
        "set ManagerDeptId = #{managerdeptid,jdbcType=BIGINT},",
          "ManagerMajorId = #{managermajorid,jdbcType=BIGINT},",
          "ManagerName = #{managername,jdbcType=VARCHAR},",
          "ManagerSex = #{managersex,jdbcType=CHAR},",
          "ManagerBirthdy = #{managerbirthdy,jdbcType=DATE},",
          "ManagerPassword = #{managerpassword,jdbcType=VARCHAR}",
        "where ManagerId = #{managerid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Manager record);
}