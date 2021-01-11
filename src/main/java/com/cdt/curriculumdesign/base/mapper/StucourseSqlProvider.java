package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Stucourse;
import com.cdt.curriculumdesign.base.model.StucourseExample.Criteria;
import com.cdt.curriculumdesign.base.model.StucourseExample.Criterion;
import com.cdt.curriculumdesign.base.model.StucourseExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("stucourse")
public class StucourseSqlProvider {
    public String countByExample(StucourseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("stucourse");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(StucourseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("stucourse");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Stucourse record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("stucourse");
        
        if (record.getStudentid() != null) {
            sql.VALUES("StudentId", "#{studentid,jdbcType=BIGINT}");
        }
        
        if (record.getCourseid() != null) {
            sql.VALUES("CourseId", "#{courseid,jdbcType=BIGINT}");
        }
        
        if (record.getTeacherid() != null) {
            sql.VALUES("TeacherId", "#{teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getTeachername() != null) {
            sql.VALUES("TeacherName", "#{teachername,jdbcType=VARCHAR}");
        }
        
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
        
        if (record.getCoursename() != null) {
            sql.VALUES("CourseName", "#{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.VALUES("Grade", "#{grade,jdbcType=INTEGER}");
        }
        
        if (record.getGradepoint() != null) {
            sql.VALUES("GradePoint", "#{gradepoint,jdbcType=REAL}");
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
        
        if (record.getCoursestatus() != null) {
            sql.VALUES("CourseStatus", "#{coursestatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursedaynum() != null) {
            sql.VALUES("CourseDayNum", "#{coursedaynum,jdbcType=CHAR}");
        }
        
        if (record.getCoursetype() != null) {
            sql.VALUES("CourseType", "#{coursetype,jdbcType=CHAR}");
        }
        
        if (record.getAuditstatus() != null) {
            sql.VALUES("AuditStatus", "#{auditstatus,jdbcType=CHAR}");
        }
        
        if (record.getStudentname() != null) {
            sql.VALUES("StudentName", "#{studentname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(StucourseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("stucourseId");
        } else {
            sql.SELECT("stucourseId");
        }
        sql.SELECT("StudentId");
        sql.SELECT("CourseId");
        sql.SELECT("TeacherId");
        sql.SELECT("TeacherName");
        sql.SELECT("DeptId");
        sql.SELECT("MajorId");
        sql.SELECT("DeptName");
        sql.SELECT("MajorName");
        sql.SELECT("CourseName");
        sql.SELECT("Grade");
        sql.SELECT("GradePoint");
        sql.SELECT("CourseStartTime");
        sql.SELECT("CourseEndTime");
        sql.SELECT("CourseStartWeek");
        sql.SELECT("CourseEndWeek");
        sql.SELECT("CourseWeek");
        sql.SELECT("CourseStatus");
        sql.SELECT("CourseDayNum");
        sql.SELECT("CourseType");
        sql.SELECT("AuditStatus");
        sql.SELECT("StudentName");
        sql.FROM("stucourse");
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
        Stucourse record = (Stucourse) parameter.get("record");
        StucourseExample example = (StucourseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("stucourse");
        
        if (record.getStucourseid() != null) {
            sql.SET("stucourseId = #{record.stucourseid,jdbcType=BIGINT}");
        }
        
        if (record.getStudentid() != null) {
            sql.SET("StudentId = #{record.studentid,jdbcType=BIGINT}");
        }
        
        if (record.getCourseid() != null) {
            sql.SET("CourseId = #{record.courseid,jdbcType=BIGINT}");
        }
        
        if (record.getTeacherid() != null) {
            sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getTeachername() != null) {
            sql.SET("TeacherName = #{record.teachername,jdbcType=VARCHAR}");
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
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.SET("Grade = #{record.grade,jdbcType=INTEGER}");
        }
        
        if (record.getGradepoint() != null) {
            sql.SET("GradePoint = #{record.gradepoint,jdbcType=REAL}");
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
        
        if (record.getCoursestatus() != null) {
            sql.SET("CourseStatus = #{record.coursestatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursedaynum() != null) {
            sql.SET("CourseDayNum = #{record.coursedaynum,jdbcType=CHAR}");
        }
        
        if (record.getCoursetype() != null) {
            sql.SET("CourseType = #{record.coursetype,jdbcType=CHAR}");
        }
        
        if (record.getAuditstatus() != null) {
            sql.SET("AuditStatus = #{record.auditstatus,jdbcType=CHAR}");
        }
        
        if (record.getStudentname() != null) {
            sql.SET("StudentName = #{record.studentname,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("stucourse");
        
        sql.SET("stucourseId = #{record.stucourseid,jdbcType=BIGINT}");
        sql.SET("StudentId = #{record.studentid,jdbcType=BIGINT}");
        sql.SET("CourseId = #{record.courseid,jdbcType=BIGINT}");
        sql.SET("TeacherId = #{record.teacherid,jdbcType=BIGINT}");
        sql.SET("TeacherName = #{record.teachername,jdbcType=VARCHAR}");
        sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        sql.SET("MajorId = #{record.majorid,jdbcType=BIGINT}");
        sql.SET("DeptName = #{record.deptname,jdbcType=VARCHAR}");
        sql.SET("MajorName = #{record.majorname,jdbcType=VARCHAR}");
        sql.SET("CourseName = #{record.coursename,jdbcType=VARCHAR}");
        sql.SET("Grade = #{record.grade,jdbcType=INTEGER}");
        sql.SET("GradePoint = #{record.gradepoint,jdbcType=REAL}");
        sql.SET("CourseStartTime = #{record.coursestarttime,jdbcType=VARCHAR}");
        sql.SET("CourseEndTime = #{record.courseendtime,jdbcType=VARCHAR}");
        sql.SET("CourseStartWeek = #{record.coursestartweek,jdbcType=INTEGER}");
        sql.SET("CourseEndWeek = #{record.courseendweek,jdbcType=INTEGER}");
        sql.SET("CourseWeek = #{record.courseweek,jdbcType=CHAR}");
        sql.SET("CourseStatus = #{record.coursestatus,jdbcType=CHAR}");
        sql.SET("CourseDayNum = #{record.coursedaynum,jdbcType=CHAR}");
        sql.SET("CourseType = #{record.coursetype,jdbcType=CHAR}");
        sql.SET("AuditStatus = #{record.auditstatus,jdbcType=CHAR}");
        sql.SET("StudentName = #{record.studentname,jdbcType=VARCHAR}");
        
        StucourseExample example = (StucourseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Stucourse record) {
        SQL sql = new SQL();
        sql.UPDATE("stucourse");
        
        if (record.getStudentid() != null) {
            sql.SET("StudentId = #{studentid,jdbcType=BIGINT}");
        }
        
        if (record.getCourseid() != null) {
            sql.SET("CourseId = #{courseid,jdbcType=BIGINT}");
        }
        
        if (record.getTeacherid() != null) {
            sql.SET("TeacherId = #{teacherid,jdbcType=BIGINT}");
        }
        
        if (record.getTeachername() != null) {
            sql.SET("TeacherName = #{teachername,jdbcType=VARCHAR}");
        }
        
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
        
        if (record.getCoursename() != null) {
            sql.SET("CourseName = #{coursename,jdbcType=VARCHAR}");
        }
        
        if (record.getGrade() != null) {
            sql.SET("Grade = #{grade,jdbcType=INTEGER}");
        }
        
        if (record.getGradepoint() != null) {
            sql.SET("GradePoint = #{gradepoint,jdbcType=REAL}");
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
        
        if (record.getCoursestatus() != null) {
            sql.SET("CourseStatus = #{coursestatus,jdbcType=CHAR}");
        }
        
        if (record.getCoursedaynum() != null) {
            sql.SET("CourseDayNum = #{coursedaynum,jdbcType=CHAR}");
        }
        
        if (record.getCoursetype() != null) {
            sql.SET("CourseType = #{coursetype,jdbcType=CHAR}");
        }
        
        if (record.getAuditstatus() != null) {
            sql.SET("AuditStatus = #{auditstatus,jdbcType=CHAR}");
        }
        
        if (record.getStudentname() != null) {
            sql.SET("StudentName = #{studentname,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("stucourseId = #{stucourseid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, StucourseExample example, boolean includeExamplePhrase) {
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