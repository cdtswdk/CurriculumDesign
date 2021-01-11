package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Student;
import com.cdt.curriculumdesign.base.model.StudentExample;
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

@Generated("student")
@Mapper
public interface StudentMapper {
    @SelectProvider(type=StudentSqlProvider.class, method="countByExample")
    long countByExample(StudentExample example);

    @DeleteProvider(type=StudentSqlProvider.class, method="deleteByExample")
    int deleteByExample(StudentExample example);

    @Delete({
        "delete from student",
        "where StudentId = #{studentid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long studentid);

    @Insert({
        "insert into student (DeptId, MajorId, ",
        "DeptName, MajorName, ",
        "ClassId, StudentName, ",
        "StudentSex, StudentBirthday, ",
        "StudentPassword, ClassName)",
        "values (#{deptid,jdbcType=BIGINT}, #{majorid,jdbcType=BIGINT}, ",
        "#{deptname,jdbcType=VARCHAR}, #{majorname,jdbcType=VARCHAR}, ",
        "#{classid,jdbcType=BIGINT}, #{studentname,jdbcType=VARCHAR}, ",
        "#{studentsex,jdbcType=CHAR}, #{studentbirthday,jdbcType=DATE}, ",
        "#{studentpassword,jdbcType=VARCHAR}, #{classname,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="studentid")
    int insert(Student record);

    @InsertProvider(type=StudentSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="studentid")
    int insertSelective(Student record);

    @SelectProvider(type=StudentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="StudentId", property="studentid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassId", property="classid", jdbcType=JdbcType.BIGINT),
        @Result(column="StudentName", property="studentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentSex", property="studentsex", jdbcType=JdbcType.CHAR),
        @Result(column="StudentBirthday", property="studentbirthday", jdbcType=JdbcType.DATE),
        @Result(column="StudentPassword", property="studentpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassName", property="classname", jdbcType=JdbcType.VARCHAR)
    })
    List<Student> selectByExample(StudentExample example);

    @Select({
        "select",
        "StudentId, DeptId, MajorId, DeptName, MajorName, ClassId, StudentName, StudentSex, ",
        "StudentBirthday, StudentPassword, ClassName",
        "from student",
        "where StudentId = #{studentid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="StudentId", property="studentid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassId", property="classid", jdbcType=JdbcType.BIGINT),
        @Result(column="StudentName", property="studentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentSex", property="studentsex", jdbcType=JdbcType.CHAR),
        @Result(column="StudentBirthday", property="studentbirthday", jdbcType=JdbcType.DATE),
        @Result(column="StudentPassword", property="studentpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassName", property="classname", jdbcType=JdbcType.VARCHAR)
    })
    Student selectByPrimaryKey(Long studentid);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Student record);

    @Update({
        "update student",
        "set DeptId = #{deptid,jdbcType=BIGINT},",
          "MajorId = #{majorid,jdbcType=BIGINT},",
          "DeptName = #{deptname,jdbcType=VARCHAR},",
          "MajorName = #{majorname,jdbcType=VARCHAR},",
          "ClassId = #{classid,jdbcType=BIGINT},",
          "StudentName = #{studentname,jdbcType=VARCHAR},",
          "StudentSex = #{studentsex,jdbcType=CHAR},",
          "StudentBirthday = #{studentbirthday,jdbcType=DATE},",
          "StudentPassword = #{studentpassword,jdbcType=VARCHAR},",
          "ClassName = #{classname,jdbcType=VARCHAR}",
        "where StudentId = #{studentid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Student record);
}