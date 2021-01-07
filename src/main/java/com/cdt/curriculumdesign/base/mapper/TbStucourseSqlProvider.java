package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbStucourse;
import com.cdt.curriculumdesign.base.model.TbStucourseExample.Criteria;
import com.cdt.curriculumdesign.base.model.TbStucourseExample.Criterion;
import com.cdt.curriculumdesign.base.model.TbStucourseExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("tb_stucourse")
public class TbStucourseSqlProvider {
    public String countByExample(TbStucourseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_stucourse");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TbStucourseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_stucourse");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TbStucourse record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_stucourse");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getStudentnum() != null) {
            sql.VALUES("StudentNum", "#{studentnum,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachernum() != null) {
            sql.VALUES("TeacherNum", "#{teachernum,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.VALUES("Grade", "#{grade,jdbcType=SMALLINT}");
        }
        
        if (record.getGradepoint() != null) {
            sql.VALUES("GradePoint", "#{gradepoint,jdbcType=REAL}");
        }
        
        if (record.getCoursestatus() != null) {
            sql.VALUES("CourseStatus", "#{coursestatus,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TbStucourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("StudentNum");
        sql.SELECT("CourseNum");
        sql.SELECT("TeacherNum");
        sql.SELECT("Grade");
        sql.SELECT("GradePoint");
        sql.SELECT("CourseStatus");
        sql.FROM("tb_stucourse");
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
        TbStucourse record = (TbStucourse) parameter.get("record");
        TbStucourseExample example = (TbStucourseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_stucourse");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getStudentnum() != null) {
            sql.SET("StudentNum = #{record.studentnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursenum() != null) {
            sql.SET("CourseNum = #{record.coursenum,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachernum() != null) {
            sql.SET("TeacherNum = #{record.teachernum,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.SET("Grade = #{record.grade,jdbcType=SMALLINT}");
        }
        
        if (record.getGradepoint() != null) {
            sql.SET("GradePoint = #{record.gradepoint,jdbcType=REAL}");
        }
        
        if (record.getCoursestatus() != null) {
            sql.SET("CourseStatus = #{record.coursestatus,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_stucourse");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("StudentNum = #{record.studentnum,jdbcType=VARCHAR}");
        sql.SET("CourseNum = #{record.coursenum,jdbcType=VARCHAR}");
        sql.SET("TeacherNum = #{record.teachernum,jdbcType=VARCHAR}");
        sql.SET("Grade = #{record.grade,jdbcType=SMALLINT}");
        sql.SET("GradePoint = #{record.gradepoint,jdbcType=REAL}");
        sql.SET("CourseStatus = #{record.coursestatus,jdbcType=INTEGER}");
        
        TbStucourseExample example = (TbStucourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TbStucourse record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_stucourse");
        
        if (record.getStudentnum() != null) {
            sql.SET("StudentNum = #{studentnum,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursenum() != null) {
            sql.SET("CourseNum = #{coursenum,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachernum() != null) {
            sql.SET("TeacherNum = #{teachernum,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.SET("Grade = #{grade,jdbcType=SMALLINT}");
        }
        
        if (record.getGradepoint() != null) {
            sql.SET("GradePoint = #{gradepoint,jdbcType=REAL}");
        }
        
        if (record.getCoursestatus() != null) {
            sql.SET("CourseStatus = #{coursestatus,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TbStucourseExample example, boolean includeExamplePhrase) {
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