package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbStudent;
import com.cdt.curriculumdesign.base.model.TbStudentExample;
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

@Generated("tb_student")
@Mapper
public interface TbStudentMapper {
    @SelectProvider(type=TbStudentSqlProvider.class, method="countByExample")
    long countByExample(TbStudentExample example);

    @DeleteProvider(type=TbStudentSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbStudentExample example);

    @Delete({
        "delete from tb_student",
        "where StudentNum = #{studentnum,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String studentnum);

    @Insert({
        "insert into tb_student (DeptNum, MajorNum, ",
        "ClassNum, StudentName, ",
        "StudentSex, StudentBirthday, ",
        "StudentPassword)",
        "values (#{deptnum,jdbcType=VARCHAR}, #{majornum,jdbcType=VARCHAR}, ",
        "#{classnum,jdbcType=VARCHAR}, #{studentname,jdbcType=VARCHAR}, ",
        "#{studentsex,jdbcType=VARCHAR}, #{studentbirthday,jdbcType=TIMESTAMP}, ",
        "#{studentpassword,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="studentnum")
    int insert(TbStudent record);

    @InsertProvider(type=TbStudentSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="studentnum")
    int insertSelective(TbStudent record);

    @SelectProvider(type=TbStudentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="StudentNum", property="studentnum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="DeptNum", property="deptnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorNum", property="majornum", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassNum", property="classnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentName", property="studentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentSex", property="studentsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentBirthday", property="studentbirthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="StudentPassword", property="studentpassword", jdbcType=JdbcType.VARCHAR)
    })
    List<TbStudent> selectByExample(TbStudentExample example);

    @Select({
        "select",
        "StudentNum, DeptNum, MajorNum, ClassNum, StudentName, StudentSex, StudentBirthday, ",
        "StudentPassword",
        "from tb_student",
        "where StudentNum = #{studentnum,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="StudentNum", property="studentnum", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="DeptNum", property="deptnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorNum", property="majornum", jdbcType=JdbcType.VARCHAR),
        @Result(column="ClassNum", property="classnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentName", property="studentname", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentSex", property="studentsex", jdbcType=JdbcType.VARCHAR),
        @Result(column="StudentBirthday", property="studentbirthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="StudentPassword", property="studentpassword", jdbcType=JdbcType.VARCHAR)
    })
    TbStudent selectByPrimaryKey(String studentnum);

    @UpdateProvider(type=TbStudentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    @UpdateProvider(type=TbStudentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TbStudent record, @Param("example") TbStudentExample example);

    @UpdateProvider(type=TbStudentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbStudent record);

    @Update({
        "update tb_student",
        "set DeptNum = #{deptnum,jdbcType=VARCHAR},",
          "MajorNum = #{majornum,jdbcType=VARCHAR},",
          "ClassNum = #{classnum,jdbcType=VARCHAR},",
          "StudentName = #{studentname,jdbcType=VARCHAR},",
          "StudentSex = #{studentsex,jdbcType=VARCHAR},",
          "StudentBirthday = #{studentbirthday,jdbcType=TIMESTAMP},",
          "StudentPassword = #{studentpassword,jdbcType=VARCHAR}",
        "where StudentNum = #{studentnum,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TbStudent record);
}