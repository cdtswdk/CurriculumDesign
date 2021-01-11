package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Dept;
import com.cdt.curriculumdesign.base.model.DeptExample;
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

@Generated("dept")
@Mapper
public interface DeptMapper {
    @SelectProvider(type=DeptSqlProvider.class, method="countByExample")
    long countByExample(DeptExample example);

    @DeleteProvider(type=DeptSqlProvider.class, method="deleteByExample")
    int deleteByExample(DeptExample example);

    @Delete({
        "delete from dept",
        "where DeptId = #{deptid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long deptid);

    @Insert({
        "insert into dept (DeptName, DeptChairman, ",
        "DeptTel, DeptDesc)",
        "values (#{deptname,jdbcType=VARCHAR}, #{deptchairman,jdbcType=VARCHAR}, ",
        "#{depttel,jdbcType=VARCHAR}, #{deptdesc,jdbcType=LONGVARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="deptid")
    int insert(Dept record);

    @InsertProvider(type=DeptSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="deptid")
    int insertSelective(Dept record);

    @SelectProvider(type=DeptSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptChairman", property="deptchairman", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptTel", property="depttel", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptDesc", property="deptdesc", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Dept> selectByExampleWithBLOBs(DeptExample example);

    @SelectProvider(type=DeptSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptChairman", property="deptchairman", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptTel", property="depttel", jdbcType=JdbcType.VARCHAR)
    })
    List<Dept> selectByExample(DeptExample example);

    @Select({
        "select",
        "DeptId, DeptName, DeptChairman, DeptTel, DeptDesc",
        "from dept",
        "where DeptId = #{deptid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptChairman", property="deptchairman", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptTel", property="depttel", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptDesc", property="deptdesc", jdbcType=JdbcType.LONGVARCHAR)
    })
    Dept selectByPrimaryKey(Long deptid);

    @UpdateProvider(type=DeptSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    @UpdateProvider(type=DeptSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Dept record, @Param("example") DeptExample example);

    @UpdateProvider(type=DeptSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    @UpdateProvider(type=DeptSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Dept record);

    @Update({
        "update dept",
        "set DeptName = #{deptname,jdbcType=VARCHAR},",
          "DeptChairman = #{deptchairman,jdbcType=VARCHAR},",
          "DeptTel = #{depttel,jdbcType=VARCHAR},",
          "DeptDesc = #{deptdesc,jdbcType=LONGVARCHAR}",
        "where DeptId = #{deptid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Dept record);

    @Update({
        "update dept",
        "set DeptName = #{deptname,jdbcType=VARCHAR},",
          "DeptChairman = #{deptchairman,jdbcType=VARCHAR},",
          "DeptTel = #{depttel,jdbcType=VARCHAR}",
        "where DeptId = #{deptid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Dept record);
}