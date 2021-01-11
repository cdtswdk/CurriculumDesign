package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Dept;
import com.cdt.curriculumdesign.base.model.DeptExample.Criteria;
import com.cdt.curriculumdesign.base.model.DeptExample.Criterion;
import com.cdt.curriculumdesign.base.model.DeptExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("dept")
public class DeptSqlProvider {
    public String countByExample(DeptExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("dept");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DeptExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("dept");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Dept record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("dept");
        
        if (record.getDeptname() != null) {
            sql.VALUES("DeptName", "#{deptname,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptchairman() != null) {
            sql.VALUES("DeptChairman", "#{deptchairman,jdbcType=VARCHAR}");
        }
        
        if (record.getDepttel() != null) {
            sql.VALUES("DeptTel", "#{depttel,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptdesc() != null) {
            sql.VALUES("DeptDesc", "#{deptdesc,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(DeptExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("DeptId");
        } else {
            sql.SELECT("DeptId");
        }
        sql.SELECT("DeptName");
        sql.SELECT("DeptChairman");
        sql.SELECT("DeptTel");
        sql.SELECT("DeptDesc");
        sql.FROM("dept");
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

    public String selectByExample(DeptExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("DeptId");
        } else {
            sql.SELECT("DeptId");
        }
        sql.SELECT("DeptName");
        sql.SELECT("DeptChairman");
        sql.SELECT("DeptTel");
        sql.FROM("dept");
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
        Dept record = (Dept) parameter.get("record");
        DeptExample example = (DeptExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("dept");
        
        if (record.getDeptid() != null) {
            sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        }
        
        if (record.getDeptname() != null) {
            sql.SET("DeptName = #{record.deptname,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptchairman() != null) {
            sql.SET("DeptChairman = #{record.deptchairman,jdbcType=VARCHAR}");
        }
        
        if (record.getDepttel() != null) {
            sql.SET("DeptTel = #{record.depttel,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptdesc() != null) {
            sql.SET("DeptDesc = #{record.deptdesc,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("dept");
        
        sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        sql.SET("DeptName = #{record.deptname,jdbcType=VARCHAR}");
        sql.SET("DeptChairman = #{record.deptchairman,jdbcType=VARCHAR}");
        sql.SET("DeptTel = #{record.depttel,jdbcType=VARCHAR}");
        sql.SET("DeptDesc = #{record.deptdesc,jdbcType=LONGVARCHAR}");
        
        DeptExample example = (DeptExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("dept");
        
        sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        sql.SET("DeptName = #{record.deptname,jdbcType=VARCHAR}");
        sql.SET("DeptChairman = #{record.deptchairman,jdbcType=VARCHAR}");
        sql.SET("DeptTel = #{record.depttel,jdbcType=VARCHAR}");
        
        DeptExample example = (DeptExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Dept record) {
        SQL sql = new SQL();
        sql.UPDATE("dept");
        
        if (record.getDeptname() != null) {
            sql.SET("DeptName = #{deptname,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptchairman() != null) {
            sql.SET("DeptChairman = #{deptchairman,jdbcType=VARCHAR}");
        }
        
        if (record.getDepttel() != null) {
            sql.SET("DeptTel = #{depttel,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptdesc() != null) {
            sql.SET("DeptDesc = #{deptdesc,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("DeptId = #{deptid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DeptExample example, boolean includeExamplePhrase) {
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