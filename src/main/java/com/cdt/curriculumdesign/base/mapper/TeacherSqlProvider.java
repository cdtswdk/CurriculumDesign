package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Teacher;
import com.cdt.curriculumdesign.base.model.TeacherExample.Criteria;
import com.cdt.curriculumdesign.base.model.TeacherExample.Criterion;
import com.cdt.curriculumdesign.base.model.TeacherExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("teacher")
public class TeacherSqlProvider {
    public String countByExample(TeacherExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("teacher");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TeacherExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("teacher");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Teacher record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("teacher");
        
        if (record.getDeptid() != null) {
            sql.VALUES("DeptId", "#{deptid,jdbcType=BIGINT}");
        }
        
        if (record.getMajorid() != null) {
            sql.VALUES("MajorId", "#{majorid,jdbcType=BIGINT}");
        }
        
        if (record.getDeptname() != null) {
            sql.VALUES("DeptName", "#{deptname,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorname() != null) {
            sql.VALUES("MajorName", "#{majorname,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachername() != null) {
            sql.VALUES("TeacherName", "#{teachername,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachersex() != null) {
            sql.VALUES("TeacherSex", "#{teachersex,jdbcType=CHAR}");
        }
        
        if (record.getTeacherbirthday() != null) {
            sql.VALUES("TeacherBirthday", "#{teacherbirthday,jdbcType=DATE}");
        }
        
        if (record.getTeacherpassword() != null) {
            sql.VALUES("TeacherPassword", "#{teacherpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherdesc() != null) {
            sql.VALUES("TeacherDesc", "#{teacherdesc,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TeacherExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("TeacherId");
        } else {
            sql.SELECT("TeacherId");
        }
        sql.SELECT("DeptId");
        sql.SELECT("MajorId");
        sql.SELECT("DeptName");
        sql.SELECT("MajorName");
        sql.SELECT("TeacherName");
        sql.SELECT("TeacherSex");
        sql.SELECT("TeacherBirthday");
        sql.SELECT("TeacherPassword");
        sql.SELECT("TeacherDesc");
        sql.FROM("teacher");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        if (example != null && example.getLimit() != null) {
            sql.LIMIT(example.getLimit());
        }
        if (example != null && example.getOffset() != null) {
            sql.OFFSET(example.getOffset());
        }
        if (example != null && example.getPageNum() != null && example.getPageSize() != null) {
            sql.LIMIT(example.getPageSize());
            sql.OFFSET((example.getPageNum() - 1) * example.getPageSize());
        }
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Teacher record = (Teacher) parameter.get("record");
        TeacherExample example = (TeacherExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("teacher");
        
        if (record.getTeacherid() != null) {
            sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getDeptid() != null) {
            sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        }
        
        if (record.getMajorid() != null) {
            sql.SET("MajorId = #{record.majorid,jdbcType=BIGINT}");
        }
        
        if (record.getDeptname() != null) {
            sql.SET("DeptName = #{record.deptname,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorname() != null) {
            sql.SET("MajorName = #{record.majorname,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachername() != null) {
            sql.SET("TeacherName = #{record.teachername,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachersex() != null) {
            sql.SET("TeacherSex = #{record.teachersex,jdbcType=CHAR}");
        }
        
        if (record.getTeacherbirthday() != null) {
            sql.SET("TeacherBirthday = #{record.teacherbirthday,jdbcType=DATE}");
        }
        
        if (record.getTeacherpassword() != null) {
            sql.SET("TeacherPassword = #{record.teacherpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherdesc() != null) {
            sql.SET("TeacherDesc = #{record.teacherdesc,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("teacher");
        
        sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        sql.SET("MajorId = #{record.majorid,jdbcType=BIGINT}");
        sql.SET("DeptName = #{record.deptname,jdbcType=VARCHAR}");
        sql.SET("MajorName = #{record.majorname,jdbcType=VARCHAR}");
        sql.SET("TeacherName = #{record.teachername,jdbcType=VARCHAR}");
        sql.SET("TeacherSex = #{record.teachersex,jdbcType=CHAR}");
        sql.SET("TeacherBirthday = #{record.teacherbirthday,jdbcType=DATE}");
        sql.SET("TeacherPassword = #{record.teacherpassword,jdbcType=VARCHAR}");
        sql.SET("TeacherDesc = #{record.teacherdesc,jdbcType=VARCHAR}");
        
        TeacherExample example = (TeacherExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Teacher record) {
        SQL sql = new SQL();
        sql.UPDATE("teacher");
        
        if (record.getDeptid() != null) {
            sql.SET("DeptId = #{deptid,jdbcType=BIGINT}");
        }
        
        if (record.getMajorid() != null) {
            sql.SET("MajorId = #{majorid,jdbcType=BIGINT}");
        }
        
        if (record.getDeptname() != null) {
            sql.SET("DeptName = #{deptname,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorname() != null) {
            sql.SET("MajorName = #{majorname,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachername() != null) {
            sql.SET("TeacherName = #{teachername,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachersex() != null) {
            sql.SET("TeacherSex = #{teachersex,jdbcType=CHAR}");
        }
        
        if (record.getTeacherbirthday() != null) {
            sql.SET("TeacherBirthday = #{teacherbirthday,jdbcType=DATE}");
        }
        
        if (record.getTeacherpassword() != null) {
            sql.SET("TeacherPassword = #{teacherpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getTeacherdesc() != null) {
            sql.SET("TeacherDesc = #{teacherdesc,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("TeacherId = #{teacherid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TeacherExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}