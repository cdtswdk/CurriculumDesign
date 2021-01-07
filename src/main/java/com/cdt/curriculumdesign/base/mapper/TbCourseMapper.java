package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbCourse;
import com.cdt.curriculumdesign.base.model.TbCourseExample;
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

@Generated("tb_course")
@Mapper
public interface TbCourseMapper {
    @SelectProvider(type=TbCourseSqlProvider.class, method="countByExample")
    long countByExample(TbCourseExample example);

    @DeleteProvider(type=TbCourseSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbCourseExample example);

    @Delete({
        "delete from tb_course",
        "where CourseNum = #{coursenum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String coursenum);

    @Insert({
        "insert into tb_course (CourseName, TeacherNum, ",
        "CourseCredit, CourseClass, ",
        "CourseStartTime, CourseEndTime, ",
        "CourseDate, CourseType, ",
        "CourseDesc)",
        "values (#{coursename,jdbcType=VARCHAR}, #{teachernum,jdbcType=VARCHAR}, ",
        "#{coursecredit,jdbcType=REAL}, #{courseclass,jdbcType=SMALLINT}, ",
        "#{coursestarttime,jdbcType=INTEGER}, #{courseendtime,jdbcType=INTEGER}, ",
        "#{coursedate,jdbcType=INTEGER}, #{coursetype,jdbcType=INTEGER}, ",
        "#{coursedesc,jdbcType=LONGVARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="coursenum")
    int insert(TbCourse record);

    @InsertProvider(type=TbCourseSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="coursenum")
    int insertSelective(TbCourse record);

    @SelectProvider(type=TbCourseSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CourseNum", property="coursenum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherNum", property="teachernum", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseCredit", property="coursecredit", jdbcType=JdbcType.REAL),
        @Result(column="CourseClass", property="courseclass", jdbcType=JdbcType.SMALLINT),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseDate", property="coursedate", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseDesc", property="coursedesc", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<TbCourse> selectByExampleWithBLOBs(TbCourseExample example);

    @SelectProvider(type=TbCourseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CourseNum", property="coursenum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherNum", property="teachernum", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseCredit", property="coursecredit", jdbcType=JdbcType.REAL),
        @Result(column="CourseClass", property="courseclass", jdbcType=JdbcType.SMALLINT),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseDate", property="coursedate", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.INTEGER)
    })
    List<TbCourse> selectByExample(TbCourseExample example);

    @Select({
        "select",
        "CourseNum, CourseName, TeacherNum, CourseCredit, CourseClass, CourseStartTime, ",
        "CourseEndTime, CourseDate, CourseType, CourseDesc",
        "from tb_course",
        "where CourseNum = #{coursenum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="CourseNum", property="coursenum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherNum", property="teachernum", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseCredit", property="coursecredit", jdbcType=JdbcType.REAL),
        @Result(column="CourseClass", property="courseclass", jdbcType=JdbcType.SMALLINT),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseDate", property="coursedate", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseDesc", property="coursedesc", jdbcType=JdbcType.LONGVARCHAR)
    })
    TbCourse selectByPrimaryKey(String coursenum);

    @UpdateProvider(type=TbCourseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbCourse record, @Param("example") TbCourseExample example);

    @UpdateProvider(type=TbCourseSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TbCourse record, @Param("example") TbCourseExample example);

    @UpdateProvider(type=TbCourseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbCourse record, @Param("example") TbCourseExample example);

    @UpdateProvider(type=TbCourseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbCourse record);

    @Update({
        "update tb_course",
        "set CourseName = #{coursename,jdbcType=VARCHAR},",
          "TeacherNum = #{teachernum,jdbcType=VARCHAR},",
          "CourseCredit = #{coursecredit,jdbcType=REAL},",
          "CourseClass = #{courseclass,jdbcType=SMALLINT},",
          "CourseStartTime = #{coursestarttime,jdbcType=INTEGER},",
          "CourseEndTime = #{courseendtime,jdbcType=INTEGER},",
          "CourseDate = #{coursedate,jdbcType=INTEGER},",
          "CourseType = #{coursetype,jdbcType=INTEGER},",
          "CourseDesc = #{coursedesc,jdbcType=LONGVARCHAR}",
        "where CourseNum = #{coursenum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(TbCourse record);

    @Update({
        "update tb_course",
        "set CourseName = #{coursename,jdbcType=VARCHAR},",
          "TeacherNum = #{teachernum,jdbcType=VARCHAR},",
          "CourseCredit = #{coursecredit,jdbcType=REAL},",
          "CourseClass = #{courseclass,jdbcType=SMALLINT},",
          "CourseStartTime = #{coursestarttime,jdbcType=INTEGER},",
          "CourseEndTime = #{courseendtime,jdbcType=INTEGER},",
          "CourseDate = #{coursedate,jdbcType=INTEGER},",
          "CourseType = #{coursetype,jdbcType=INTEGER}",
        "where CourseNum = #{coursenum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbCourse record);
}