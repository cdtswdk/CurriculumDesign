package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Major;
import com.cdt.curriculumdesign.base.model.MajorExample;
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

@Generated("major")
@Mapper
public interface MajorMapper {
    @SelectProvider(type=MajorSqlProvider.class, method="countByExample")
    long countByExample(MajorExample example);

    @DeleteProvider(type=MajorSqlProvider.class, method="deleteByExample")
    int deleteByExample(MajorExample example);

    @Delete({
        "delete from major",
        "where MajorId = #{majorid,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long majorid);

    @Insert({
        "insert into major (DeptId, MajorName, ",
        "MajorAssistant, MajorTel)",
        "values (#{deptid,jdbcType=BIGINT}, #{majorname,jdbcType=VARCHAR}, ",
        "#{majorassistant,jdbcType=VARCHAR}, #{majortel,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="majorid")
    int insert(Major record);

    @InsertProvider(type=MajorSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="majorid")
    int insertSelective(Major record);

    @SelectProvider(type=MajorSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorAssistant", property="majorassistant", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorTel", property="majortel", jdbcType=JdbcType.VARCHAR)
    })
    List<Major> selectByExample(MajorExample example);

    @Select({
        "select",
        "MajorId, DeptId, MajorName, MajorAssistant, MajorTel",
        "from major",
        "where MajorId = #{majorid,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="MajorId", property="majorid", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="DeptId", property="deptid", jdbcType=JdbcType.BIGINT),
        @Result(column="MajorName", property="majorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorAssistant", property="majorassistant", jdbcType=JdbcType.VARCHAR),
        @Result(column="MajorTel", property="majortel", jdbcType=JdbcType.VARCHAR)
    })
    Major selectByPrimaryKey(Long majorid);

    @UpdateProvider(type=MajorSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    @UpdateProvider(type=MajorSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    @UpdateProvider(type=MajorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Major record);

    @Update({
        "update major",
        "set DeptId = #{deptid,jdbcType=BIGINT},",
          "MajorName = #{majorname,jdbcType=VARCHAR},",
          "MajorAssistant = #{majorassistant,jdbcType=VARCHAR},",
          "MajorTel = #{majortel,jdbcType=VARCHAR}",
        "where MajorId = #{majorid,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Major record);
}