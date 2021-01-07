package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbTeacher;
import com.cdt.curriculumdesign.base.model.TbTeacherExample;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Generated("tb_teacher")
@Mapper
public interface TbTeacherMapper {
    @SelectProvider(type=TbTeacherSqlProvider.class, method="countByExample")
    long countByExample(TbTeacherExample example);

    @DeleteProvider(type=TbTeacherSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbTeacherExample example);

    @Delete({
        "delete from tb_teacher",
        "where TeacherNum = #{teachernum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String teachernum);

    @Insert({
        "insert into tb_teacher (TeacherNum, DeptNum, ",
        "MajorNum, TeacherName, ",
        "TeacherSex, TeacherBirthday, ",
        "TeacherTitle)",
        "values (#{teachernum,jdbcType=VARCHAR}, #{deptnum,jdbcType=VARCHAR}, ",
        "#{majornum,jdbcType=VARCHAR}, #{teachername,jdbcType=VARCHAR}, ",
        "#{teachersex,jdbcType=VARCHAR}, #{teacherbirthday,jdbcType=TIMESTAMP}, ",
        "#{teachertitle,jdbcType=VARCHAR})"
    })
    int insert(TbTeacher record);

    @InsertProvider(type=TbTeacherSqlProvider.class, method="insertSelective")
    int insertSelective(TbTeacher record);

    @SelectProvider(type=TbTeacherSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="TeacherNum", property="teachernum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="DeptNum", property="deptnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorNum", property="majornum", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherSex", property="teachersex", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherBirthday", property="teacherbirthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TeacherTitle", property="teachertitle", jdbcType=JdbcType.VARCHAR)
    })
    List<TbTeacher> selectByExample(TbTeacherExample example);

    @Select({
        "select",
        "TeacherNum, DeptNum, MajorNum, TeacherName, TeacherSex, TeacherBirthday, TeacherTitle",
        "from tb_teacher",
        "where TeacherNum = #{teachernum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="TeacherNum", property="teachernum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="DeptNum", property="deptnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorNum", property="majornum", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherName", property="teachername", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherSex", property="teachersex", jdbcType=JdbcType.VARCHAR),
        @Result(column="TeacherBirthday", property="teacherbirthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TeacherTitle", property="teachertitle", jdbcType=JdbcType.VARCHAR)
    })
    TbTeacher selectByPrimaryKey(String teachernum);

    @UpdateProvider(type=TbTeacherSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbTeacher record, @Param("example") TbTeacherExample example);

    @UpdateProvider(type=TbTeacherSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbTeacher record, @Param("example") TbTeacherExample example);

    @UpdateProvider(type=TbTeacherSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbTeacher record);

    @Update({
        "update tb_teacher",
        "set DeptNum = #{deptnum,jdbcType=VARCHAR},",
          "MajorNum = #{majornum,jdbcType=VARCHAR},",
          "TeacherName = #{teachername,jdbcType=VARCHAR},",
          "TeacherSex = #{teachersex,jdbcType=VARCHAR},",
          "TeacherBirthday = #{teacherbirthday,jdbcType=TIMESTAMP},",
          "TeacherTitle = #{teachertitle,jdbcType=VARCHAR}",
        "where TeacherNum = #{teachernum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbTeacher record);
}