package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbStudent;
import com.cdt.curriculumdesign.base.model.TbStudentExample.Criteria;
import com.cdt.curriculumdesign.base.model.TbStudentExample.Criterion;
import com.cdt.curriculumdesign.base.model.TbStudentExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("tb_student")
public class TbStudentSqlProvider {
    public String countByExample(TbStudentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TbStudentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TbStudent record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_student");
        
        if (record.getDeptnum() != null) {
            sql.VALUES("DeptNum", "#{deptnum,jdbcType=VARCHAR}");
        }
        
        if (record.getMajornum() != null) {
            sql.VALUES("MajorNum", "#{majornum,jdbcType=VARCHAR}");
        }
        
        if (record.getClassnum() != null) {
            sql.VALUES("ClassNum", "#{classnum,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentname() != null) {
            sql.VALUES("StudentName", "#{studentname,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentsex() != null) {
            sql.VALUES("StudentSex", "#{studentsex,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentbirthday() != null) {
            sql.VALUES("StudentBirthday", "#{studentbirthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStudentpassword() != null) {
            sql.VALUES("StudentPassword", "#{studentpassword,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TbStudentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("StudentNum");
        } else {
            sql.SELECT("StudentNum");
        }
        sql.SELECT("DeptNum");
        sql.SELECT("MajorNum");
        sql.SELECT("ClassNum");
        sql.SELECT("StudentName");
        sql.SELECT("StudentSex");
        sql.SELECT("StudentBirthday");
        sql.SELECT("StudentPassword");
        sql.FROM("tb_student");
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
        TbStudent record = (TbStudent) parameter.get("record");
        TbStudentExample example = (TbStudentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_student");
        
        if (record.getStudentnum() != null) {
            sql.SET("StudentNum = #{record.studentnum,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptnum() != null) {
            sql.SET("DeptNum = #{record.deptnum,jdbcType=VARCHAR}");
        }
        
        if (record.getMajornum() != null) {
            sql.SET("MajorNum = #{record.majornum,jdbcType=VARCHAR}");
        }
        
        if (record.getClassnum() != null) {
            sql.SET("ClassNum = #{record.classnum,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentname() != null) {
            sql.SET("StudentName = #{record.studentname,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentsex() != null) {
            sql.SET("StudentSex = #{record.studentsex,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentbirthday() != null) {
            sql.SET("StudentBirthday = #{record.studentbirthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStudentpassword() != null) {
            sql.SET("StudentPassword = #{record.studentpassword,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_student");
        
        sql.SET("StudentNum = #{record.studentnum,jdbcType=VARCHAR}");
        sql.SET("DeptNum = #{record.deptnum,jdbcType=VARCHAR}");
        sql.SET("MajorNum = #{record.majornum,jdbcType=VARCHAR}");
        sql.SET("ClassNum = #{record.classnum,jdbcType=VARCHAR}");
        sql.SET("StudentName = #{record.studentname,jdbcType=VARCHAR}");
        sql.SET("StudentSex = #{record.studentsex,jdbcType=VARCHAR}");
        sql.SET("StudentBirthday = #{record.studentbirthday,jdbcType=TIMESTAMP}");
        sql.SET("StudentPassword = #{record.studentpassword,jdbcType=VARCHAR}");
        
        TbStudentExample example = (TbStudentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TbStudent record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_student");
        
        if (record.getDeptnum() != null) {
            sql.SET("DeptNum = #{deptnum,jdbcType=VARCHAR}");
        }
        
        if (record.getMajornum() != null) {
            sql.SET("MajorNum = #{majornum,jdbcType=VARCHAR}");
        }
        
        if (record.getClassnum() != null) {
            sql.SET("ClassNum = #{classnum,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentname() != null) {
            sql.SET("StudentName = #{studentname,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentsex() != null) {
            sql.SET("StudentSex = #{studentsex,jdbcType=VARCHAR}");
        }
        
        if (record.getStudentbirthday() != null) {
            sql.SET("StudentBirthday = #{studentbirthday,jdbcType=TIMESTAMP}");
        }
        
        if (record.getStudentpassword() != null) {
            sql.SET("StudentPassword = #{studentpassword,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("StudentNum = #{studentnum,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TbStudentExample example, boolean includeExamplePhrase) {
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