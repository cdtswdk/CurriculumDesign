package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Stucourse;
import com.cdt.curriculumdesign.base.model.StucourseExample;
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

@Generated("stucourse")
@Mapper
public interface StucourseMapper {
    @SelectProvider(type=StucourseSqlProvider.class, method="countByExample")
    long countByExample(StucourseExample example);

    @DeleteProvider(type=StucourseSqlProvider.class, method="deleteByExample")
    int deleteByExample(StucourseExample example);

    @Delete({
        "delete from stucourse",
        "where stucourseId = #{stucourseid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long stucourseid);

    @Insert({
        "insert into stucourse (StudentId, CourseId, ",
        "TeacherId, TeacherName, ",
        "DeptId, MajorId, DeptName, ",
        "MajorName, CourseName, ",
        "Grade, GradePoint, ",
        "CourseStartTime, CourseEndTime, ",
        "CourseStartWeek, CourseEndWeek, ",
        "CourseWeek, CourseStatus, ",
        "CourseDayNum, CourseType, ",
        "AuditStatus, StudentName)",
        "values (#{studentid,jdbcType=BIGINT}, #{courseid,jdbcType=BIGINT}, ",
        "#{teacherid,jdbcType=BIGINT}, #{teachername,jdbcType=VARCHAR}, ",
        "#{deptid,jdbcType=BIGINT}, #{majorid,jdbcType=BIGINT}, #{deptname,jdbcType=VARCHAR}, ",
        "#{majorname,jdbcType=VARCHAR}, #{coursename,jdbcType=VARCHAR}, ",
        "#{grade,jdbcType=INTEGER}, #{gradepoint,jdbcType=REAL}, ",
        "#{coursestarttime,jdbcType=VARCHAR}, #{courseendtime,jdbcType=VARCHAR}, ",
        "#{coursestartweek,jdbcType=INTEGER}, #{courseendweek,jdbcType=INTEGER}, ",
        "#{courseweek,jdbcType=CHAR}, #{coursestatus,jdbcType=CHAR}, ",
        "#{coursedaynum,jdbcType=CHAR}, #{coursetype,jdbcType=CHAR}, ",
        "#{auditstatus,jdbcType=CHAR}, #{studentname,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="stucourseid")
    int insert(Stucourse record);

    @InsertProvider(type=StucourseSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="stucourseid")
    int insertSelective(Stucourse record);

    @SelectProvider(type=StucourseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="stucourseId", property="stucourseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="StudentId", property="studentid", jdbcType=JdbcType.BIGINT),
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="Grade", property="grade", jdbcType=JdbcType.INTEGER),
        @Result(column="GradePoint", property="gradepoint", jdbcType=JdbcType.REAL),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseStartWeek", property="coursestartweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndWeek", property="courseendweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseWeek", property="courseweek", jdbcType=JdbcType.CHAR),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseDayNum", property="coursedaynum", jdbcType=JdbcType.CHAR),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.CHAR),
        @Result(column="AuditStatus", property="auditstatus", jdbcType=JdbcType.CHAR),
        @Result(column="StudentName", property="studentname", jdbcType=JdbcType.VARCHAR)
    })
    List<Stucourse> selectByExample(StucourseExample example);

    @Select({
        "select",
        "stucourseId, StudentId, CourseId, TeacherId, TeacherName, DeptId, MajorId, DeptName, ",
        "MajorName, CourseName, Grade, GradePoint, CourseStartTime, CourseEndTime, CourseStartWeek, ",
        "CourseEndWeek, CourseWeek, CourseStatus, CourseDayNum, CourseType, AuditStatus, ",
        "StudentName",
        "from stucourse",
        "where stucourseId = #{stucourseid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="stucourseId", property="stucourseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="StudentId", property="studentid", jdbcType=JdbcType.BIGINT),
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="Grade", property="grade", jdbcType=JdbcType.INTEGER),
        @Result(column="GradePoint", property="gradepoint", jdbcType=JdbcType.REAL),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseStartWeek", property="coursestartweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndWeek", property="courseendweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseWeek", property="courseweek", jdbcType=JdbcType.CHAR),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseDayNum", property="coursedaynum", jdbcType=JdbcType.CHAR),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.CHAR),
        @Result(column="AuditStatus", property="auditstatus", jdbcType=JdbcType.CHAR),
        @Result(column="StudentName", property="studentname", jdbcType=JdbcType.VARCHAR)
    })
    Stucourse selectByPrimaryKey(Long stucourseid);

    @UpdateProvider(type=StucourseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Stucourse record, @Param("example") StucourseExample example);

    @UpdateProvider(type=StucourseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Stucourse record, @Param("example") StucourseExample example);

    @UpdateProvider(type=StucourseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Stucourse record);

    @Update({
        "update stucourse",
        "set StudentId = #{studentid,jdbcType=BIGINT},",
          "CourseId = #{courseid,jdbcType=BIGINT},",
          "TeacherId = #{teacherid,jdbcType=BIGINT},",
          "TeacherName = #{teachername,jdbcType=VARCHAR},",
          "DeptId = #{deptid,jdbcType=BIGINT},",
          "MajorId = #{majorid,jdbcType=BIGINT},",
          "DeptName = #{deptname,jdbcType=VARCHAR},",
          "MajorName = #{majorname,jdbcType=VARCHAR},",
          "CourseName = #{coursename,jdbcType=VARCHAR},",
          "Grade = #{grade,jdbcType=INTEGER},",
          "GradePoint = #{gradepoint,jdbcType=REAL},",
          "CourseStartTime = #{coursestarttime,jdbcType=VARCHAR},",
          "CourseEndTime = #{courseendtime,jdbcType=VARCHAR},",
          "CourseStartWeek = #{coursestartweek,jdbcType=INTEGER},",
          "CourseEndWeek = #{courseendweek,jdbcType=INTEGER},",
          "CourseWeek = #{courseweek,jdbcType=CHAR},",
          "CourseStatus = #{coursestatus,jdbcType=CHAR},",
          "CourseDayNum = #{coursedaynum,jdbcType=CHAR},",
          "CourseType = #{coursetype,jdbcType=CHAR},",
          "AuditStatus = #{auditstatus,jdbcType=CHAR},",
          "StudentName = #{studentname,jdbcType=VARCHAR}",
        "where stucourseId = #{stucourseid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Stucourse record);
}