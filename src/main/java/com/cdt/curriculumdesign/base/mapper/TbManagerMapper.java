package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbManager;
import com.cdt.curriculumdesign.base.model.TbManagerExample;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Generated("tb_manager")
@Mapper
public interface TbManagerMapper {
    @SelectProvider(type=TbManagerSqlProvider.class, method="countByExample")
    long countByExample(TbManagerExample example);

    @DeleteProvider(type=TbManagerSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbManagerExample example);

    @Delete({
        "delete from tb_manager",
        "where ManagerNum = #{managernum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String managernum);

    @Insert({
        "insert into tb_manager (ManagerNum, ManagerName, ",
        "ManagerSex, ManagerBirthdate, ",
        "ManagerRights)",
        "values (#{managernum,jdbcType=VARCHAR}, #{managername,jdbcType=VARCHAR}, ",
        "#{managersex,jdbcType=VARCHAR}, #{managerbirthdate,jdbcType=TIMESTAMP}, ",
        "#{managerrights,jdbcType=INTEGER})"
    })
    int insert(TbManager record);

    @InsertProvider(type=TbManagerSqlProvider.class, method="insertSelective")
    int insertSelective(TbManager record);

    @SelectProvider(type=TbManagerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ManagerNum", property="managernum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ManagerName", property="managername", jdbcType=JdbcType.VARCHAR),
        @Result(column="ManagerSex", property="managersex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ManagerBirthdate", property="managerbirthdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ManagerRights", property="managerrights", jdbcType=JdbcType.INTEGER)
    })
    List<TbManager> selectByExample(TbManagerExample example);

    @Select({
        "select",
        "ManagerNum, ManagerName, ManagerSex, ManagerBirthdate, ManagerRights",
        "from tb_manager",
        "where ManagerNum = #{managernum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ManagerNum", property="managernum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ManagerName", property="managername", jdbcType=JdbcType.VARCHAR),
        @Result(column="ManagerSex", property="managersex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ManagerBirthdate", property="managerbirthdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ManagerRights", property="managerrights", jdbcType=JdbcType.INTEGER)
    })
    TbManager selectByPrimaryKey(String managernum);

    @UpdateProvider(type=TbManagerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbManager record, @Param("example") TbManagerExample example);

    @UpdateProvider(type=TbManagerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbManager record, @Param("example") TbManagerExample example);

    @UpdateProvider(type=TbManagerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbManager record);

    @Update({
        "update tb_manager",
        "set ManagerName = #{managername,jdbcType=VARCHAR},",
          "ManagerSex = #{managersex,jdbcType=VARCHAR},",
          "ManagerBirthdate = #{managerbirthdate,jdbcType=TIMESTAMP},",
          "ManagerRights = #{managerrights,jdbcType=INTEGER}",
        "where ManagerNum = #{managernum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbManager record);
}