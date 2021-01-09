package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Clscourse;
import com.cdt.curriculumdesign.base.model.ClscourseExample.Criteria;
import com.cdt.curriculumdesign.base.model.ClscourseExample.Criterion;
import com.cdt.curriculumdesign.base.model.ClscourseExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("clscourse")
public class ClscourseSqlProvider {
    public String countByExample(ClscourseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("clscourse");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ClscourseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("clscourse");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Clscourse record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("clscourse");
        
        if (record.getCourseid() != null) {
            sql.VALUES("CourseId", "#{courseid,jdbcType=BIGINT}");
        }
        
        if (record.getClassid() != null) {
            sql.VALUES("ClassId", "#{classid,jdbcType=BIGINT}");
        }
        
        if (record.getTeacherid() != null) {
            sql.VALUES("TeacherId", "#{teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getCoursename() != null) {
            sql.VALUES("CourseName", "#{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.VALUES("CourseStartTime", "#{coursestarttime,jdbcType=DATE}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.VALUES("CourseEndTime", "#{courseendtime,jdbcType=DATE}");
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
        
        return sql.toString();
    }

    public String selectByExample(ClscourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ClsCourseId");
        } else {
            sql.SELECT("ClsCourseId");
        }
        sql.SELECT("CourseId");
        sql.SELECT("ClassId");
        sql.SELECT("TeacherId");
        sql.SELECT("CourseName");
        sql.SELECT("CourseStartTime");
        sql.SELECT("CourseEndTime");
        sql.SELECT("CourseStartWeek");
        sql.SELECT("CourseEndWeek");
        sql.SELECT("CourseWeek");
        sql.SELECT("CourseDayNum");
        sql.SELECT("CourseStatus");
        sql.SELECT("CourseType");
        sql.FROM("clscourse");
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
        Clscourse record = (Clscourse) parameter.get("record");
        ClscourseExample example = (ClscourseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("clscourse");
        
        if (record.getClscourseid() != null) {
            sql.SET("ClsCourseId = #{record.clscourseid,jdbcType=BIGINT}");
        }
        
        if (record.getCourseid() != null) {
            sql.SET("CourseId = #{record.courseid,jdbcType=BIGINT}");
        }
        
        if (record.getClassid() != null) {
            sql.SET("ClassId = #{record.classid,jdbcType=BIGINT}");
        }
        
        if (record.getTeacherid() != null) {
            sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=DATE}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=DATE}");
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
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("clscourse");
        
        sql.SET("ClsCourseId = #{record.clscourseid,jdbcType=BIGINT}");
        sql.SET("CourseId = #{record.courseid,jdbcType=BIGINT}");
        sql.SET("ClassId = #{record.classid,jdbcType=BIGINT}");
        sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=DATE}");
        sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=DATE}");
        sql.SET("CourseStartWeek = #{record.coursestartweek,jdbcType=INTEGER}");
        sql.SET("CourseEndWeek = #{record.courseendweek,jdbcType=INTEGER}");
        sql.SET("CourseWeek = #{record.courseweek,jdbcType=CHAR}");
        sql.SET("CourseDayNum = #{record.coursedaynum,jdbcType=CHAR}");
        sql.SET("CourseStatus = #{record.coursestatus,jdbcType=CHAR}");
        sql.SET("CourseType = #{record.coursetype,jdbcType=CHAR}");
        
        ClscourseExample example = (ClscourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Clscourse record) {
        SQL sql = new SQL();
        sql.UPDATE("clscourse");
        
        if (record.getCourseid() != null) {
            sql.SET("CourseId = #{courseid,jdbcType=BIGINT}");
        }
        
        if (record.getClassid() != null) {
            sql.SET("ClassId = #{classid,jdbcType=BIGINT}");
        }
        
        if (record.getTeacherid() != null) {
            sql.SET("TeacherId = #{teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getCoursestarttime() != null) {
            sql.SET("CourseStartTime = #{coursestarttime,jdbcType=DATE}");
        }
        
        if (record.getCourseendtime() != null) {
            sql.SET("CourseEndTime = #{courseendtime,jdbcType=DATE}");
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
        
        sql.WHERE("ClsCourseId = #{clscourseid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ClscourseExample example, boolean includeExamplePhrase) {
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