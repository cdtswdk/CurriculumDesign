package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbStucourse;
import com.cdt.curriculumdesign.base.model.TbStucourseExample;
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

@Generated("tb_stucourse")
@Mapper
public interface TbStucourseMapper {
    @SelectProvider(type=TbStucourseSqlProvider.class, method="countByExample")
    long countByExample(TbStucourseExample example);

    @DeleteProvider(type=TbStucourseSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbStucourseExample example);

    @Delete({
        "delete from tb_stucourse",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into tb_stucourse (id, StudentNum, ",
        "TeacherNum, Grade, ",
        "GradePoint, CourseStatus)",
        "values (#{id,jdbcType=INTEGER}, #{studentnum,jdbcType=VARCHAR}, ",
        "#{teachernum,jdbcType=VARCHAR}, #{grade,jdbcType=SMALLINT}, ",
        "#{gradepoint,jdbcType=REAL}, #{coursestatus,jdbcType=INTEGER})"
    })
    @Options(useGeneratedKeys=true,keyProperty="coursenum")
    int insert(TbStucourse record);

    @InsertProvider(type=TbStucourseSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="coursenum")
    int insertSelective(TbStucourse record);

    @SelectProvider(type=TbStucourseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="StudentNum", property="studentnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseNum", property="coursenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherNum", property="teachernum", jdbcType=JdbcType.VARCHAR),
        @Result(column="Grade", property="grade", jdbcType=JdbcType.SMALLINT),
        @Result(column="GradePoint", property="gradepoint", jdbcType=JdbcType.REAL),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.INTEGER)
    })
    List<TbStucourse> selectByExample(TbStucourseExample example);

    @Select({
        "select",
        "id, StudentNum, CourseNum, TeacherNum, Grade, GradePoint, CourseStatus",
        "from tb_stucourse",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="StudentNum", property="studentnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseNum", property="coursenum", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherNum", property="teachernum", jdbcType=JdbcType.VARCHAR),
        @Result(column="Grade", property="grade", jdbcType=JdbcType.SMALLINT),
        @Result(column="GradePoint", property="gradepoint", jdbcType=JdbcType.REAL),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.INTEGER)
    })
    TbStucourse selectByPrimaryKey(Integer id);

    @UpdateProvider(type=TbStucourseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbStucourse record, @Param("example") TbStucourseExample example);

    @UpdateProvider(type=TbStucourseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbStucourse record, @Param("example") TbStucourseExample example);

    @UpdateProvider(type=TbStucourseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbStucourse record);

    @Update({
        "update tb_stucourse",
        "set StudentNum = #{studentnum,jdbcType=VARCHAR},",
          "CourseNum = #{coursenum,jdbcType=VARCHAR},",
          "TeacherNum = #{teachernum,jdbcType=VARCHAR},",
          "Grade = #{grade,jdbcType=SMALLINT},",
          "GradePoint = #{gradepoint,jdbcType=REAL},",
          "CourseStatus = #{coursestatus,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TbStucourse record);
}