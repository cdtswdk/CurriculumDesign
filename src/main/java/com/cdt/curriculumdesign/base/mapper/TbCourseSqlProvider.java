package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbCourse;
import com.cdt.curriculumdesign.base.model.TbCourseExample.Criteria;
import com.cdt.curriculumdesign.base.model.TbCourseExample.Criterion;
import com.cdt.curriculumdesign.base.model.TbCourseExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("tb_course")
public class TbCourseSqlProvider {
    public String countByExample(TbCourseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_course");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TbCourseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_course");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TbCourse record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_course");
        
        if (record.getCoursename() != null) {
            sql.VALUES("CourseName", "#{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachernum() != null) {
            sql.VALUES("TeacherNum", "#{teachernum,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursecredit() != null) {
            sql.VALUES("CourseCredit", "#{coursecredit,jdbcType=REAL}");
        }
        
        if (record.getCourseclass() != null) {
            sql.VALUES("CourseClass", "#{courseclass,jdbcType=SMALLINT}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.VALUES("CourseStartTime", "#{coursestarttime,jdbcType=INTEGER}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.VALUES("CourseEndTime", "#{courseendtime,jdbcType=INTEGER}");
        }
        
        if (record.getCoursedate() != null) {
            sql.VALUES("CourseDate", "#{coursedate,jdbcType=INTEGER}");
        }
        
        if (record.getCoursetype() != null) {
            sql.VALUES("CourseType", "#{coursetype,jdbcType=INTEGER}");
        }
        
        if (record.getCoursedesc() != null) {
            sql.VALUES("CourseDesc", "#{coursedesc,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(TbCourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CourseNum");
        } else {
            sql.SELECT("CourseNum");
        }
        sql.SELECT("CourseName");
        sql.SELECT("TeacherNum");
        sql.SELECT("CourseCredit");
        sql.SELECT("CourseClass");
        sql.SELECT("CourseStartTime");
        sql.SELECT("CourseEndTime");
        sql.SELECT("CourseDate");
        sql.SELECT("CourseType");
        sql.SELECT("CourseDesc");
        sql.FROM("tb_course");
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

    public String selectByExample(TbCourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CourseNum");
        } else {
            sql.SELECT("CourseNum");
        }
        sql.SELECT("CourseName");
        sql.SELECT("TeacherNum");
        sql.SELECT("CourseCredit");
        sql.SELECT("CourseClass");
        sql.SELECT("CourseStartTime");
        sql.SELECT("CourseEndTime");
        sql.SELECT("CourseDate");
        sql.SELECT("CourseType");
        sql.FROM("tb_course");
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
        TbCourse record = (TbCourse) parameter.get("record");
        TbCourseExample example = (TbCourseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_course");
        
        if (record.getCoursenum() != null) {
            sql.SET("CourseNum = #{record.coursenum,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachernum() != null) {
            sql.SET("TeacherNum = #{record.teachernum,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursecredit() != null) {
            sql.SET("CourseCredit = #{record.coursecredit,jdbcType=REAL}");
        }
        
        if (record.getCourseclass() != null) {
            sql.SET("CourseClass = #{record.courseclass,jdbcType=SMALLINT}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=INTEGER}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=INTEGER}");
        }
        
        if (record.getCoursedate() != null) {
            sql.SET("CourseDate = #{record.coursedate,jdbcType=INTEGER}");
        }
        
        if (record.getCoursetype() != null) {
            sql.SET("CourseType = #{record.coursetype,jdbcType=INTEGER}");
        }
        
        if (record.getCoursedesc() != null) {
            sql.SET("CourseDesc = #{record.coursedesc,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_course");
        
        sql.SET("CourseNum = #{record.coursenum,jdbcType=VARCHAR}");
        sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        sql.SET("TeacherNum = #{record.teachernum,jdbcType=VARCHAR}");
        sql.SET("CourseCredit = #{record.coursecredit,jdbcType=REAL}");
        sql.SET("CourseClass = #{record.courseclass,jdbcType=SMALLINT}");
        sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=INTEGER}");
        sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=INTEGER}");
        sql.SET("CourseDate = #{record.coursedate,jdbcType=INTEGER}");
        sql.SET("CourseType = #{record.coursetype,jdbcType=INTEGER}");
        sql.SET("CourseDesc = #{record.coursedesc,jdbcType=LONGVARCHAR}");
        
        TbCourseExample example = (TbCourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_course");
        
        sql.SET("CourseNum = #{record.coursenum,jdbcType=VARCHAR}");
        sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        sql.SET("TeacherNum = #{record.teachernum,jdbcType=VARCHAR}");
        sql.SET("CourseCredit = #{record.coursecredit,jdbcType=REAL}");
        sql.SET("CourseClass = #{record.courseclass,jdbcType=SMALLINT}");
        sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=INTEGER}");
        sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=INTEGER}");
        sql.SET("CourseDate = #{record.coursedate,jdbcType=INTEGER}");
        sql.SET("CourseType = #{record.coursetype,jdbcType=INTEGER}");
        
        TbCourseExample example = (TbCourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TbCourse record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_course");
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getTeachernum() != null) {
            sql.SET("TeacherNum = #{teachernum,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursecredit() != null) {
            sql.SET("CourseCredit = #{coursecredit,jdbcType=REAL}");
        }
        
        if (record.getCourseclass() != null) {
            sql.SET("CourseClass = #{courseclass,jdbcType=SMALLINT}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.SET("CourseStartTime = #{coursestarttime,jdbcType=INTEGER}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.SET("CourseEndTime = #{courseendtime,jdbcType=INTEGER}");
        }
        
        if (record.getCoursedate() != null) {
            sql.SET("CourseDate = #{coursedate,jdbcType=INTEGER}");
        }
        
        if (record.getCoursetype() != null) {
            sql.SET("CourseType = #{coursetype,jdbcType=INTEGER}");
        }
        
        if (record.getCoursedesc() != null) {
            sql.SET("CourseDesc = #{coursedesc,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("CourseNum = #{coursenum,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TbCourseExample example, boolean includeExamplePhrase) {
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