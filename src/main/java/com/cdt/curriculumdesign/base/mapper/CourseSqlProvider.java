package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Course;
import com.cdt.curriculumdesign.base.model.CourseExample.Criteria;
import com.cdt.curriculumdesign.base.model.CourseExample.Criterion;
import com.cdt.curriculumdesign.base.model.CourseExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("course")
public class CourseSqlProvider {
    public String countByExample(CourseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("course");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CourseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("course");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Course record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("course");
        
        if (record.getTeacherid() != null) {
            sql.VALUES("TeacherId", "#{teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getCoursename() != null) {
            sql.VALUES("CourseName", "#{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursecredit() != null) {
            sql.VALUES("CourseCredit", "#{coursecredit,jdbcType=REAL}");
        }
        
        if (record.getCoursehours() != null) {
            sql.VALUES("CourseHours", "#{coursehours,jdbcType=SMALLINT}");
        }
        
        if (record.getCoursecreatetime() != null) {
            sql.VALUES("courseCreateTime", "#{coursecreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.VALUES("CourseStartTime", "#{coursestarttime,jdbcType=VARCHAR}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.VALUES("CourseEndTime", "#{courseendtime,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursestartweek() != null) {
            sql.VALUES("CourseStartWeek", "#{coursestartweek,jdbcType=INTEGER}");
        }
        
        if (record.getCourseendweek() != null) {
            sql.VALUES("CourseEndWeek", "#{courseendweek,jdbcType=INTEGER}");
        }
        
        if (record.getCourseweek() != null) {
            sql.VALUES("CourseWeek", "#{courseweek,jdbcType=CHAR}");
        }
        
        if (record.getCoursedaynum() != null) {
            sql.VALUES("CourseDayNum", "#{coursedaynum,jdbcType=CHAR}");
        }
        
        if (record.getCoursestatus() != null) {
            sql.VALUES("CourseStatus", "#{coursestatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursetype() != null) {
            sql.VALUES("CourseType", "#{coursetype,jdbcType=CHAR}");
        }
        
        if (record.getAuditstatus() != null) {
            sql.VALUES("AuditStatus", "#{auditstatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursedesc() != null) {
            sql.VALUES("CourseDesc", "#{coursedesc,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(CourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CourseId");
        } else {
            sql.SELECT("CourseId");
        }
        sql.SELECT("TeacherId");
        sql.SELECT("CourseName");
        sql.SELECT("CourseCredit");
        sql.SELECT("CourseHours");
        sql.SELECT("courseCreateTime");
        sql.SELECT("CourseStartTime");
        sql.SELECT("CourseEndTime");
        sql.SELECT("CourseStartWeek");
        sql.SELECT("CourseEndWeek");
        sql.SELECT("CourseWeek");
        sql.SELECT("CourseDayNum");
        sql.SELECT("CourseStatus");
        sql.SELECT("CourseType");
        sql.SELECT("AuditStatus");
        sql.SELECT("CourseDesc");
        sql.FROM("course");
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

    public String selectByExample(CourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("CourseId");
        } else {
            sql.SELECT("CourseId");
        }
        sql.SELECT("TeacherId");
        sql.SELECT("CourseName");
        sql.SELECT("CourseCredit");
        sql.SELECT("CourseHours");
        sql.SELECT("courseCreateTime");
        sql.SELECT("CourseStartTime");
        sql.SELECT("CourseEndTime");
        sql.SELECT("CourseStartWeek");
        sql.SELECT("CourseEndWeek");
        sql.SELECT("CourseWeek");
        sql.SELECT("CourseDayNum");
        sql.SELECT("CourseStatus");
        sql.SELECT("CourseType");
        sql.SELECT("AuditStatus");
        sql.FROM("course");
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
        Course record = (Course) parameter.get("record");
        CourseExample example = (CourseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("course");
        
        if (record.getCourseid() != null) {
            sql.SET("CourseId = #{record.courseid,jdbcType=BIGINT}");
        }
        
        if (record.getTeacherid() != null) {
            sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursecredit() != null) {
            sql.SET("CourseCredit = #{record.coursecredit,jdbcType=REAL}");
        }
        
        if (record.getCoursehours() != null) {
            sql.SET("CourseHours = #{record.coursehours,jdbcType=SMALLINT}");
        }
        
        if (record.getCoursecreatetime() != null) {
            sql.SET("courseCreateTime = #{record.coursecreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=VARCHAR}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursestartweek() != null) {
            sql.SET("CourseStartWeek = #{record.coursestartweek,jdbcType=INTEGER}");
        }
        
        if (record.getCourseendweek() != null) {
            sql.SET("CourseEndWeek = #{record.courseendweek,jdbcType=INTEGER}");
        }
        
        if (record.getCourseweek() != null) {
            sql.SET("CourseWeek = #{record.courseweek,jdbcType=CHAR}");
        }
        
        if (record.getCoursedaynum() != null) {
            sql.SET("CourseDayNum = #{record.coursedaynum,jdbcType=CHAR}");
        }
        
        if (record.getCoursestatus() != null) {
            sql.SET("CourseStatus = #{record.coursestatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursetype() != null) {
            sql.SET("CourseType = #{record.coursetype,jdbcType=CHAR}");
        }
        
        if (record.getAuditstatus() != null) {
            sql.SET("AuditStatus = #{record.auditstatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursedesc() != null) {
            sql.SET("CourseDesc = #{record.coursedesc,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("course");
        
        sql.SET("CourseId = #{record.courseid,jdbcType=BIGINT}");
        sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        sql.SET("CourseCredit = #{record.coursecredit,jdbcType=REAL}");
        sql.SET("CourseHours = #{record.coursehours,jdbcType=SMALLINT}");
        sql.SET("courseCreateTime = #{record.coursecreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=VARCHAR}");
        sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=VARCHAR}");
        sql.SET("CourseStartWeek = #{record.coursestartweek,jdbcType=INTEGER}");
        sql.SET("CourseEndWeek = #{record.courseendweek,jdbcType=INTEGER}");
        sql.SET("CourseWeek = #{record.courseweek,jdbcType=CHAR}");
        sql.SET("CourseDayNum = #{record.coursedaynum,jdbcType=CHAR}");
        sql.SET("CourseStatus = #{record.coursestatus,jdbcType=CHAR}");
        sql.SET("CourseType = #{record.coursetype,jdbcType=CHAR}");
        sql.SET("AuditStatus = #{record.auditstatus,jdbcType=CHAR}");
        sql.SET("CourseDesc = #{record.coursedesc,jdbcType=LONGVARCHAR}");
        
        CourseExample example = (CourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("course");
        
        sql.SET("CourseId = #{record.courseid,jdbcType=BIGINT}");
        sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        sql.SET("CourseCredit = #{record.coursecredit,jdbcType=REAL}");
        sql.SET("CourseHours = #{record.coursehours,jdbcType=SMALLINT}");
        sql.SET("courseCreateTime = #{record.coursecreatetime,jdbcType=TIMESTAMP}");
        sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=VARCHAR}");
        sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=VARCHAR}");
        sql.SET("CourseStartWeek = #{record.coursestartweek,jdbcType=INTEGER}");
        sql.SET("CourseEndWeek = #{record.courseendweek,jdbcType=INTEGER}");
        sql.SET("CourseWeek = #{record.courseweek,jdbcType=CHAR}");
        sql.SET("CourseDayNum = #{record.coursedaynum,jdbcType=CHAR}");
        sql.SET("CourseStatus = #{record.coursestatus,jdbcType=CHAR}");
        sql.SET("CourseType = #{record.coursetype,jdbcType=CHAR}");
        sql.SET("AuditStatus = #{record.auditstatus,jdbcType=CHAR}");
        
        CourseExample example = (CourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Course record) {
        SQL sql = new SQL();
        sql.UPDATE("course");
        
        if (record.getTeacherid() != null) {
            sql.SET("TeacherId = #{teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursecredit() != null) {
            sql.SET("CourseCredit = #{coursecredit,jdbcType=REAL}");
        }
        
        if (record.getCoursehours() != null) {
            sql.SET("CourseHours = #{coursehours,jdbcType=SMALLINT}");
        }
        
        if (record.getCoursecreatetime() != null) {
            sql.SET("courseCreateTime = #{coursecreatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.SET("CourseStartTime = #{coursestarttime,jdbcType=VARCHAR}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.SET("CourseEndTime = #{courseendtime,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursestartweek() != null) {
            sql.SET("CourseStartWeek = #{coursestartweek,jdbcType=INTEGER}");
        }
        
        if (record.getCourseendweek() != null) {
            sql.SET("CourseEndWeek = #{courseendweek,jdbcType=INTEGER}");
        }
        
        if (record.getCourseweek() != null) {
            sql.SET("CourseWeek = #{courseweek,jdbcType=CHAR}");
        }
        
        if (record.getCoursedaynum() != null) {
            sql.SET("CourseDayNum = #{coursedaynum,jdbcType=CHAR}");
        }
        
        if (record.getCoursestatus() != null) {
            sql.SET("CourseStatus = #{coursestatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursetype() != null) {
            sql.SET("CourseType = #{coursetype,jdbcType=CHAR}");
        }
        
        if (record.getAuditstatus() != null) {
            sql.SET("AuditStatus = #{auditstatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursedesc() != null) {
            sql.SET("CourseDesc = #{coursedesc,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("CourseId = #{courseid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CourseExample example, boolean includeExamplePhrase) {
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