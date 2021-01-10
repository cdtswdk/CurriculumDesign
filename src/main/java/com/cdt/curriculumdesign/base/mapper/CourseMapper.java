package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Course;
import com.cdt.curriculumdesign.base.model.CourseExample;
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

@Generated("course")
@Mapper
public interface CourseMapper {
    @SelectProvider(type=CourseSqlProvider.class, method="countByExample")
    long countByExample(CourseExample example);

    @DeleteProvider(type=CourseSqlProvider.class, method="deleteByExample")
    int deleteByExample(CourseExample example);

    @Delete({
        "delete from course",
        "where CourseId = #{courseid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long courseid);

    @Insert({
        "insert into course (TeacherId, CourseName, ",
        "CourseCredit, CourseHours, ",
        "courseCreateTime, CourseStartTime, ",
        "CourseEndTime, CourseStartWeek, ",
        "CourseEndWeek, CourseWeek, ",
        "CourseDayNum, CourseStatus, ",
        "CourseType, AuditStatus, ",
        "CourseDesc)",
        "values (#{teacherid,jdbcType=BIGINT}, #{coursename,jdbcType=VARCHAR}, ",
        "#{coursecredit,jdbcType=REAL}, #{coursehours,jdbcType=SMALLINT}, ",
        "#{coursecreatetime,jdbcType=TIMESTAMP}, #{coursestarttime,jdbcType=VARCHAR}, ",
        "#{courseendtime,jdbcType=VARCHAR}, #{coursestartweek,jdbcType=INTEGER}, ",
        "#{courseendweek,jdbcType=INTEGER}, #{courseweek,jdbcType=CHAR}, ",
        "#{coursedaynum,jdbcType=CHAR}, #{coursestatus,jdbcType=CHAR}, ",
        "#{coursetype,jdbcType=CHAR}, #{auditstatus,jdbcType=CHAR}, ",
        "#{coursedesc,jdbcType=LONGVARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="courseid")
    int insert(Course record);

    @InsertProvider(type=CourseSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="courseid")
    int insertSelective(Course record);

    @SelectProvider(type=CourseSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseCredit", property="coursecredit", jdbcType=JdbcType.REAL),
        @Result(column="CourseHours", property="coursehours", jdbcType=JdbcType.SMALLINT),
        @Result(column="courseCreateTime", property="coursecreatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseStartWeek", property="coursestartweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndWeek", property="courseendweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseWeek", property="courseweek", jdbcType=JdbcType.CHAR),
        @Result(column="CourseDayNum", property="coursedaynum", jdbcType=JdbcType.CHAR),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.CHAR),
        @Result(column="AuditStatus", property="auditstatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseDesc", property="coursedesc", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Course> selectByExampleWithBLOBs(CourseExample example);

    @SelectProvider(type=CourseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseCredit", property="coursecredit", jdbcType=JdbcType.REAL),
        @Result(column="CourseHours", property="coursehours", jdbcType=JdbcType.SMALLINT),
        @Result(column="courseCreateTime", property="coursecreatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseStartWeek", property="coursestartweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndWeek", property="courseendweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseWeek", property="courseweek", jdbcType=JdbcType.CHAR),
        @Result(column="CourseDayNum", property="coursedaynum", jdbcType=JdbcType.CHAR),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.CHAR),
        @Result(column="AuditStatus", property="auditstatus", jdbcType=JdbcType.CHAR)
    })
    List<Course> selectByExample(CourseExample example);

    @Select({
        "select",
        "CourseId, TeacherId, CourseName, CourseCredit, CourseHours, courseCreateTime, ",
        "CourseStartTime, CourseEndTime, CourseStartWeek, CourseEndWeek, CourseWeek, ",
        "CourseDayNum, CourseStatus, CourseType, AuditStatus, CourseDesc",
        "from course",
        "where CourseId = #{courseid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseCredit", property="coursecredit", jdbcType=JdbcType.REAL),
        @Result(column="CourseHours", property="coursehours", jdbcType=JdbcType.SMALLINT),
        @Result(column="courseCreateTime", property="coursecreatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseStartWeek", property="coursestartweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndWeek", property="courseendweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseWeek", property="courseweek", jdbcType=JdbcType.CHAR),
        @Result(column="CourseDayNum", property="coursedaynum", jdbcType=JdbcType.CHAR),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.CHAR),
        @Result(column="AuditStatus", property="auditstatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseDesc", property="coursedesc", jdbcType=JdbcType.LONGVARCHAR)
    })
    Course selectByPrimaryKey(Long courseid);

    @UpdateProvider(type=CourseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    @UpdateProvider(type=CourseSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Course record, @Param("example") CourseExample example);

    @UpdateProvider(type=CourseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    @UpdateProvider(type=CourseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Course record);

    @Update({
        "update course",
        "set TeacherId = #{teacherid,jdbcType=BIGINT},",
          "CourseName = #{coursename,jdbcType=VARCHAR},",
          "CourseCredit = #{coursecredit,jdbcType=REAL},",
          "CourseHours = #{coursehours,jdbcType=SMALLINT},",
          "courseCreateTime = #{coursecreatetime,jdbcType=TIMESTAMP},",
          "CourseStartTime = #{coursestarttime,jdbcType=VARCHAR},",
          "CourseEndTime = #{courseendtime,jdbcType=VARCHAR},",
          "CourseStartWeek = #{coursestartweek,jdbcType=INTEGER},",
          "CourseEndWeek = #{courseendweek,jdbcType=INTEGER},",
          "CourseWeek = #{courseweek,jdbcType=CHAR},",
          "CourseDayNum = #{coursedaynum,jdbcType=CHAR},",
          "CourseStatus = #{coursestatus,jdbcType=CHAR},",
          "CourseType = #{coursetype,jdbcType=CHAR},",
          "AuditStatus = #{auditstatus,jdbcType=CHAR},",
          "CourseDesc = #{coursedesc,jdbcType=LONGVARCHAR}",
        "where CourseId = #{courseid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Course record);

    @Update({
        "update course",
        "set TeacherId = #{teacherid,jdbcType=BIGINT},",
          "CourseName = #{coursename,jdbcType=VARCHAR},",
          "CourseCredit = #{coursecredit,jdbcType=REAL},",
          "CourseHours = #{coursehours,jdbcType=SMALLINT},",
          "courseCreateTime = #{coursecreatetime,jdbcType=TIMESTAMP},",
          "CourseStartTime = #{coursestarttime,jdbcType=VARCHAR},",
          "CourseEndTime = #{courseendtime,jdbcType=VARCHAR},",
          "CourseStartWeek = #{coursestartweek,jdbcType=INTEGER},",
          "CourseEndWeek = #{courseendweek,jdbcType=INTEGER},",
          "CourseWeek = #{courseweek,jdbcType=CHAR},",
          "CourseDayNum = #{coursedaynum,jdbcType=CHAR},",
          "CourseStatus = #{coursestatus,jdbcType=CHAR},",
          "CourseType = #{coursetype,jdbcType=CHAR},",
          "AuditStatus = #{auditstatus,jdbcType=CHAR}",
        "where CourseId = #{courseid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Course record);
}