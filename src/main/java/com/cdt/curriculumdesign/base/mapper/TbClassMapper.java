package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbClass;
import com.cdt.curriculumdesign.base.model.TbClassExample;
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

@Generated("tb_class")
@Mapper
public interface TbClassMapper {
    @SelectProvider(type=TbClassSqlProvider.class, method="countByExample")
    long countByExample(TbClassExample example);

    @DeleteProvider(type=TbClassSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbClassExample example);

    @Delete({
        "delete from tb_class",
        "where ClassId = #{classid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long classid);

    @Insert({
        "insert into tb_class (ClassName, ClassStuNum, ",
        "DeptId, DeptName, ",
        "MajorId, MajorName, ",
        "headTeacher, TeacherName)",
        "values (#{classname,jdbcType=VARCHAR}, #{classstunum,jdbcType=INTEGER}, ",
        "#{deptid,jdbcType=BIGINT}, #{deptname,jdbcType=VARCHAR}, ",
        "#{majorid,jdbcType=BIGINT}, #{majorname,jdbcType=VARCHAR}, ",
        "#{headteacher,jdbcType=BIGINT}, #{teachername,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="classid")
    int insert(TbClass record);

    @InsertProvider(type=TbClassSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="classid")
    int insertSelective(TbClass record);

    @SelectProvider(type=TbClassSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ClassId", property="classid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ClassName", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassStuNum", property="classstunum", jdbcType=JdbcType.INTEGER),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="headTeacher", property="headteacher", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR)
    })
    List<TbClass> selectByExample(TbClassExample example);

    @Select({
        "select",
        "ClassId, ClassName, ClassStuNum, DeptId, DeptName, MajorId, MajorName, headTeacher, ",
        "TeacherName",
        "from tb_class",
        "where ClassId = #{classid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ClassId", property="classid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="ClassName", property="classname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassStuNum", property="classstunum", jdbcType=JdbcType.INTEGER),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="headTeacher", property="headteacher", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR)
    })
    TbClass selectByPrimaryKey(Long classid);

    @UpdateProvider(type=TbClassSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbClass record, @Param("example") TbClassExample example);

    @UpdateProvider(type=TbClassSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbClass record, @Param("example") TbClassExample example);

    @UpdateProvider(type=TbClassSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbClass record);

    @Update({
        "update tb_class",
        "set ClassName = #{classname,jdbcType=VARCHAR},",
          "ClassStuNum = #{classstunum,jdbcType=INTEGER},",
          "DeptId = #{deptid,jdbcType=BIGINT},",
          "DeptName = #{deptname,jdbcType=VARCHAR},",
          "MajorId = #{majorid,jdbcType=BIGINT},",
          "MajorName = #{majorname,jdbcType=VARCHAR},",
          "headTeacher = #{headteacher,jdbcType=BIGINT},",
          "TeacherName = #{teachername,jdbcType=VARCHAR}",
        "where ClassId = #{classid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TbClass record);
}