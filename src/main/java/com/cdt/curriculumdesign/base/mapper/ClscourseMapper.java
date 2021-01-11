package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Clscourse;
import com.cdt.curriculumdesign.base.model.ClscourseExample;
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

@Generated("clscourse")
@Mapper
public interface ClscourseMapper {
    @SelectProvider(type=ClscourseSqlProvider.class, method="countByExample")
    long countByExample(ClscourseExample example);

    @DeleteProvider(type=ClscourseSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClscourseExample example);

    @Delete({
        "delete from clscourse",
        "where ClsCourseId = #{clscourseid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long clscourseid);

    @Insert({
        "insert into clscourse (CourseId, ClassId, ",
        "TeacherId, TeacherName, ",
        "DeptId, MajorId, DeptName, ",
        "MajorName, CourseName, ",
        "CourseStartTime, CourseEndTime, ",
        "CourseStartWeek, CourseEndWeek, ",
        "CourseWeek, CourseDayNum, ",
        "CourseStatus, CourseType, ",
        "AuditStatus)",
        "values (#{courseid,jdbcType=BIGINT}, #{classid,jdbcType=BIGINT}, ",
        "#{teacherid,jdbcType=BIGINT}, #{teachername,jdbcType=VARCHAR}, ",
        "#{deptid,jdbcType=BIGINT}, #{majorid,jdbcType=BIGINT}, #{deptname,jdbcType=VARCHAR}, ",
        "#{majorname,jdbcType=VARCHAR}, #{coursename,jdbcType=VARCHAR}, ",
        "#{coursestarttime,jdbcType=VARCHAR}, #{courseendtime,jdbcType=VARCHAR}, ",
        "#{coursestartweek,jdbcType=INTEGER}, #{courseendweek,jdbcType=INTEGER}, ",
        "#{courseweek,jdbcType=CHAR}, #{coursedaynum,jdbcType=CHAR}, ",
        "#{coursestatus,jdbcType=CHAR}, #{coursetype,jdbcType=CHAR}, ",
        "#{auditstatus,jdbcType=CHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="clscourseid")
    int insert(Clscourse record);

    @InsertProvider(type=ClscourseSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="clscourseid")
    int insertSelective(Clscourse record);

    @SelectProvider(type=ClscourseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ClsCourseId", property="clscourseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT),
        @Result(column="ClassId", property="classid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
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
    List<Clscourse> selectByExample(ClscourseExample example);

    @Select({
        "select",
        "ClsCourseId, CourseId, ClassId, TeacherId, TeacherName, DeptId, MajorId, DeptName, ",
        "MajorName, CourseName, CourseStartTime, CourseEndTime, CourseStartWeek, CourseEndWeek, ",
        "CourseWeek, CourseDayNum, CourseStatus, CourseType, AuditStatus",
        "from clscourse",
        "where ClsCourseId = #{clscourseid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ClsCourseId", property="clscourseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT),
        @Result(column="ClassId", property="classid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
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
    Clscourse selectByPrimaryKey(Long clscourseid);

    @UpdateProvider(type=ClscourseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Clscourse record, @Param("example") ClscourseExample example);

    @UpdateProvider(type=ClscourseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Clscourse record, @Param("example") ClscourseExample example);

    @UpdateProvider(type=ClscourseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Clscourse record);

    @Update({
        "update clscourse",
        "set CourseId = #{courseid,jdbcType=BIGINT},",
          "ClassId = #{classid,jdbcType=BIGINT},",
          "TeacherId = #{teacherid,jdbcType=BIGINT},",
          "TeacherName = #{teachername,jdbcType=VARCHAR},",
          "DeptId = #{deptid,jdbcType=BIGINT},",
          "MajorId = #{majorid,jdbcType=BIGINT},",
          "DeptName = #{deptname,jdbcType=VARCHAR},",
          "MajorName = #{majorname,jdbcType=VARCHAR},",
          "CourseName = #{coursename,jdbcType=VARCHAR},",
          "CourseStartTime = #{coursestarttime,jdbcType=VARCHAR},",
          "CourseEndTime = #{courseendtime,jdbcType=VARCHAR},",
          "CourseStartWeek = #{coursestartweek,jdbcType=INTEGER},",
          "CourseEndWeek = #{courseendweek,jdbcType=INTEGER},",
          "CourseWeek = #{courseweek,jdbcType=CHAR},",
          "CourseDayNum = #{coursedaynum,jdbcType=CHAR},",
          "CourseStatus = #{coursestatus,jdbcType=CHAR},",
          "CourseType = #{coursetype,jdbcType=CHAR},",
          "AuditStatus = #{auditstatus,jdbcType=CHAR}",
        "where ClsCourseId = #{clscourseid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Clscourse record);
}