package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Teacher;
import com.cdt.curriculumdesign.base.model.TeacherExample;
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

@Generated("teacher")
@Mapper
public interface TeacherMapper {
    @SelectProvider(type=TeacherSqlProvider.class, method="countByExample")
    long countByExample(TeacherExample example);

    @DeleteProvider(type=TeacherSqlProvider.class, method="deleteByExample")
    int deleteByExample(TeacherExample example);

    @Delete({
        "delete from teacher",
        "where TeacherId = #{teacherid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long teacherid);

    @Insert({
        "insert into teacher (DeptId, MajorId, ",
        "DeptName, MajorName, ",
        "TeacherName, TeacherSex, ",
        "TeacherBirthday, TeacherPassword, ",
        "TeacherDesc)",
        "values (#{deptid,jdbcType=BIGINT}, #{majorid,jdbcType=BIGINT}, ",
        "#{deptname,jdbcType=VARCHAR}, #{majorname,jdbcType=VARCHAR}, ",
        "#{teachername,jdbcType=VARCHAR}, #{teachersex,jdbcType=CHAR}, ",
        "#{teacherbirthday,jdbcType=DATE}, #{teacherpassword,jdbcType=VARCHAR}, ",
        "#{teacherdesc,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="teacherid")
    int insert(Teacher record);

    @InsertProvider(type=TeacherSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="teacherid")
    int insertSelective(Teacher record);

    @SelectProvider(type=TeacherSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherSex", property="teachersex", jdbcType=JdbcType.CHAR),
        @Result(column="TeacherBirthday", property="teacherbirthday", jdbcType=JdbcType.DATE),
        @Result(column="TeacherPassword", property="teacherpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherDesc", property="teacherdesc", jdbcType=JdbcType.VARCHAR)
    })
    List<Teacher> selectByExample(TeacherExample example);

    @Select({
        "select",
        "TeacherId, DeptId, MajorId, DeptName, MajorName, TeacherName, TeacherSex, TeacherBirthday, ",
        "TeacherPassword, TeacherDesc",
        "from teacher",
        "where TeacherId = #{teacherid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="TeacherId", property="teacherid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherSex", property="teachersex", jdbcType=JdbcType.CHAR),
        @Result(column="TeacherBirthday", property="teacherbirthday", jdbcType=JdbcType.DATE),
        @Result(column="TeacherPassword", property="teacherpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherDesc", property="teacherdesc", jdbcType=JdbcType.VARCHAR)
    })
    Teacher selectByPrimaryKey(Long teacherid);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Teacher record);

    @Update({
        "update teacher",
        "set DeptId = #{deptid,jdbcType=BIGINT},",
          "MajorId = #{majorid,jdbcType=BIGINT},",
          "DeptName = #{deptname,jdbcType=VARCHAR},",
          "MajorName = #{majorname,jdbcType=VARCHAR},",
          "TeacherName = #{teachername,jdbcType=VARCHAR},",
          "TeacherSex = #{teachersex,jdbcType=CHAR},",
          "TeacherBirthday = #{teacherbirthday,jdbcType=DATE},",
          "TeacherPassword = #{teacherpassword,jdbcType=VARCHAR},",
          "TeacherDesc = #{teacherdesc,jdbcType=VARCHAR}",
        "where TeacherId = #{teacherid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Teacher record);
}