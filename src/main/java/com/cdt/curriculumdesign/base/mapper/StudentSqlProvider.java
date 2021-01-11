package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Student;
import com.cdt.curriculumdesign.base.model.StudentExample.Criteria;
import com.cdt.curriculumdesign.base.model.StudentExample.Criterion;
import com.cdt.curriculumdesign.base.model.StudentExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("student")
public class StudentSqlProvider {
    public String countByExample(StudentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(StudentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Student record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("student");
        
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
        
        if (record.getClassid() != null) {
            sql.VALUES("ClassId", "#{classid,jdbcType=BIGINT}");
        }
        
        if (record.getStudentname() != null) {
            sql.VALUES("StudentName", "#{studentname,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentsex() != null) {
            sql.VALUES("StudentSex", "#{studentsex,jdbcType=CHAR}");
        }
        
        if (record.getStudentbirthday() != null) {
            sql.VALUES("StudentBirthday", "#{studentbirthday,jdbcType=DATE}");
        }
        
        if (record.getStudentpassword() != null) {
            sql.VALUES("StudentPassword", "#{studentpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getClassname() != null) {
            sql.VALUES("ClassName", "#{classname,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(StudentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("StudentId");
        } else {
            sql.SELECT("StudentId");
        }
        sql.SELECT("DeptId");
        sql.SELECT("MajorId");
        sql.SELECT("DeptName");
        sql.SELECT("MajorName");
        sql.SELECT("ClassId");
        sql.SELECT("StudentName");
        sql.SELECT("StudentSex");
        sql.SELECT("StudentBirthday");
        sql.SELECT("StudentPassword");
        sql.SELECT("ClassName");
        sql.FROM("student");
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
        Student record = (Student) parameter.get("record");
        StudentExample example = (StudentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("student");
        
        if (record.getStudentid() != null) {
            sql.SET("StudentId = #{record.studentid,jdbcType=BIGINT}");
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
        
        if (record.getClassid() != null) {
            sql.SET("ClassId = #{record.classid,jdbcType=BIGINT}");
        }
        
        if (record.getStudentname() != null) {
            sql.SET("StudentName = #{record.studentname,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentsex() != null) {
            sql.SET("StudentSex = #{record.studentsex,jdbcType=CHAR}");
        }
        
        if (record.getStudentbirthday() != null) {
            sql.SET("StudentBirthday = #{record.studentbirthday,jdbcType=DATE}");
        }
        
        if (record.getStudentpassword() != null) {
            sql.SET("StudentPassword = #{record.studentpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getClassname() != null) {
            sql.SET("ClassName = #{record.classname,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("student");
        
        sql.SET("StudentId = #{record.studentid,jdbcType=BIGINT}");
        sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        sql.SET("MajorId = #{record.majorid,jdbcType=BIGINT}");
        sql.SET("DeptName = #{record.deptname,jdbcType=VARCHAR}");
        sql.SET("MajorName = #{record.majorname,jdbcType=VARCHAR}");
        sql.SET("ClassId = #{record.classid,jdbcType=BIGINT}");
        sql.SET("StudentName = #{record.studentname,jdbcType=VARCHAR}");
        sql.SET("StudentSex = #{record.studentsex,jdbcType=CHAR}");
        sql.SET("StudentBirthday = #{record.studentbirthday,jdbcType=DATE}");
        sql.SET("StudentPassword = #{record.studentpassword,jdbcType=VARCHAR}");
        sql.SET("ClassName = #{record.classname,jdbcType=VARCHAR}");
        
        StudentExample example = (StudentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Student record) {
        SQL sql = new SQL();
        sql.UPDATE("student");
        
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
        
        if (record.getClassid() != null) {
            sql.SET("ClassId = #{classid,jdbcType=BIGINT}");
        }
        
        if (record.getStudentname() != null) {
            sql.SET("StudentName = #{studentname,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentsex() != null) {
            sql.SET("StudentSex = #{studentsex,jdbcType=CHAR}");
        }
        
        if (record.getStudentbirthday() != null) {
            sql.SET("StudentBirthday = #{studentbirthday,jdbcType=DATE}");
        }
        
        if (record.getStudentpassword() != null) {
            sql.SET("StudentPassword = #{studentpassword,jdbcType=VARCHAR}");
        }
        
        if (record.getClassname() != null) {
            sql.SET("ClassName = #{classname,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("StudentId = #{studentid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, StudentExample example, boolean includeExamplePhrase) {
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