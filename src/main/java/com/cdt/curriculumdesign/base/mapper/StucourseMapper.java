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
        "TeacherId, CourseName, ",
        "Grade, GradePoint, ",
        "CourseStartTime, CourseEndTime, ",
        "CourseStartWeek, CourseEndWeek, ",
        "CourseStatus, CourseType)",
        "values (#{studentid,jdbcType=BIGINT}, #{courseid,jdbcType=BIGINT}, ",
        "#{teacherid,jdbcType=BIGINT}, #{coursename,jdbcType=VARCHAR}, ",
        "#{grade,jdbcType=INTEGER}, #{gradepoint,jdbcType=REAL}, ",
        "#{coursestarttime,jdbcType=DATE}, #{courseendtime,jdbcType=DATE}, ",
        "#{coursestartweek,jdbcType=INTEGER}, #{courseendweek,jdbcType=INTEGER}, ",
        "#{coursestatus,jdbcType=CHAR}, #{coursetype,jdbcType=CHAR})"
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
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="Grade", property="grade", jdbcType=JdbcType.INTEGER),
        @Result(column="GradePoint", property="gradepoint", jdbcType=JdbcType.REAL),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.DATE),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.DATE),
        @Result(column="CourseStartWeek", property="coursestartweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndWeek", property="courseendweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.CHAR)
    })
    List<Stucourse> selectByExample(StucourseExample example);

    @Select({
        "select",
        "stucourseId, StudentId, CourseId, TeacherId, CourseName, Grade, GradePoint, ",
        "CourseStartTime, CourseEndTime, CourseStartWeek, CourseEndWeek, CourseStatus, ",
        "CourseType",
        "from stucourse",
        "where stucourseId = #{stucourseid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="stucourseId", property="stucourseid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="StudentId", property="studentid", jdbcType=JdbcType.BIGINT),
        @Result(column="CourseId", property="courseid", jdbcType=JdbcType.BIGINT),
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT),
        @Result(column="CourseName", property="coursename", jdbcType=JdbcType.VARCHAR),
        @Result(column="Grade", property="grade", jdbcType=JdbcType.INTEGER),
        @Result(column="GradePoint", property="gradepoint", jdbcType=JdbcType.REAL),
        @Result(column="CourseStartTime", property="coursestarttime", jdbcType=JdbcType.DATE),
        @Result(column="CourseEndTime", property="courseendtime", jdbcType=JdbcType.DATE),
        @Result(column="CourseStartWeek", property="coursestartweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseEndWeek", property="courseendweek", jdbcType=JdbcType.INTEGER),
        @Result(column="CourseStatus", property="coursestatus", jdbcType=JdbcType.CHAR),
        @Result(column="CourseType", property="coursetype", jdbcType=JdbcType.CHAR)
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
          "CourseName = #{coursename,jdbcType=VARCHAR},",
          "Grade = #{grade,jdbcType=INTEGER},",
          "GradePoint = #{gradepoint,jdbcType=REAL},",
          "CourseStartTime = #{coursestarttime,jdbcType=DATE},",
          "CourseEndTime = #{courseendtime,jdbcType=DATE},",
          "CourseStartWeek = #{coursestartweek,jdbcType=INTEGER},",
          "CourseEndWeek = #{courseendweek,jdbcType=INTEGER},",
          "CourseStatus = #{coursestatus,jdbcType=CHAR},",
          "CourseType = #{coursetype,jdbcType=CHAR}",
        "where stucourseId = #{stucourseid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Stucourse record);
}