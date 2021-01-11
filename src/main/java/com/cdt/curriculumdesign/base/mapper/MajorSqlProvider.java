package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Major;
import com.cdt.curriculumdesign.base.model.MajorExample.Criteria;
import com.cdt.curriculumdesign.base.model.MajorExample.Criterion;
import com.cdt.curriculumdesign.base.model.MajorExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("major")
public class MajorSqlProvider {
    public String countByExample(MajorExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("major");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MajorExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("major");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Major record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("major");
        
        if (record.getDeptid() != null) {
            sql.VALUES("DeptId", "#{deptid,jdbcType=BIGINT}");
        }
        
        if (record.getMajorname() != null) {
            sql.VALUES("MajorName", "#{majorname,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorassistant() != null) {
            sql.VALUES("MajorAssistant", "#{majorassistant,jdbcType=VARCHAR}");
        }
        
        if (record.getMajortel() != null) {
            sql.VALUES("MajorTel", "#{majortel,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MajorExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("MajorId");
        } else {
            sql.SELECT("MajorId");
        }
        sql.SELECT("DeptId");
        sql.SELECT("MajorName");
        sql.SELECT("MajorAssistant");
        sql.SELECT("MajorTel");
        sql.FROM("major");
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
        Major record = (Major) parameter.get("record");
        MajorExample example = (MajorExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("major");
        
        if (record.getMajorid() != null) {
            sql.SET("MajorId = #{record.majorid,jdbcType=BIGINT}");
        }
        
        if (record.getDeptid() != null) {
            sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        }
        
        if (record.getMajorname() != null) {
            sql.SET("MajorName = #{record.majorname,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorassistant() != null) {
            sql.SET("MajorAssistant = #{record.majorassistant,jdbcType=VARCHAR}");
        }
        
        if (record.getMajortel() != null) {
            sql.SET("MajorTel = #{record.majortel,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("major");
        
        sql.SET("MajorId = #{record.majorid,jdbcType=BIGINT}");
        sql.SET("DeptId = #{record.deptid,jdbcType=BIGINT}");
        sql.SET("MajorName = #{record.majorname,jdbcType=VARCHAR}");
        sql.SET("MajorAssistant = #{record.majorassistant,jdbcType=VARCHAR}");
        sql.SET("MajorTel = #{record.majortel,jdbcType=VARCHAR}");
        
        MajorExample example = (MajorExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Major record) {
        SQL sql = new SQL();
        sql.UPDATE("major");
        
        if (record.getDeptid() != null) {
            sql.SET("DeptId = #{deptid,jdbcType=BIGINT}");
        }
        
        if (record.getMajorname() != null) {
            sql.SET("MajorName = #{majorname,jdbcType=VARCHAR}");
        }
        
        if (record.getMajorassistant() != null) {
            sql.SET("MajorAssistant = #{majorassistant,jdbcType=VARCHAR}");
        }
        
        if (record.getMajortel() != null) {
            sql.SET("MajorTel = #{majortel,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("MajorId = #{majorid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MajorExample example, boolean includeExamplePhrase) {
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