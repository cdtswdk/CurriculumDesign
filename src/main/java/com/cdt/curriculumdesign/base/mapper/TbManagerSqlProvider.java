package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.TbManager;
import com.cdt.curriculumdesign.base.model.TbManagerExample.Criteria;
import com.cdt.curriculumdesign.base.model.TbManagerExample.Criterion;
import com.cdt.curriculumdesign.base.model.TbManagerExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("tb_manager")
public class TbManagerSqlProvider {
    public String countByExample(TbManagerExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_manager");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(TbManagerExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_manager");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(TbManager record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_manager");
        
        if (record.getManagernum() != null) {
            sql.VALUES("ManagerNum", "#{managernum,jdbcType=VARCHAR}");
        }
        
        if (record.getManagername() != null) {
            sql.VALUES("ManagerName", "#{managername,jdbcType=VARCHAR}");
        }
        
        if (record.getManagersex() != null) {
            sql.VALUES("ManagerSex", "#{managersex,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerbirthdate() != null) {
            sql.VALUES("ManagerBirthdate", "#{managerbirthdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getManagerrights() != null) {
            sql.VALUES("ManagerRights", "#{managerrights,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(TbManagerExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ManagerNum");
        } else {
            sql.SELECT("ManagerNum");
        }
        sql.SELECT("ManagerName");
        sql.SELECT("ManagerSex");
        sql.SELECT("ManagerBirthdate");
        sql.SELECT("ManagerRights");
        sql.FROM("tb_manager");
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
        TbManager record = (TbManager) parameter.get("record");
        TbManagerExample example = (TbManagerExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tb_manager");
        
        if (record.getManagernum() != null) {
            sql.SET("ManagerNum = #{record.managernum,jdbcType=VARCHAR}");
        }
        
        if (record.getManagername() != null) {
            sql.SET("ManagerName = #{record.managername,jdbcType=VARCHAR}");
        }
        
        if (record.getManagersex() != null) {
            sql.SET("ManagerSex = #{record.managersex,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerbirthdate() != null) {
            sql.SET("ManagerBirthdate = #{record.managerbirthdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getManagerrights() != null) {
            sql.SET("ManagerRights = #{record.managerrights,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_manager");
        
        sql.SET("ManagerNum = #{record.managernum,jdbcType=VARCHAR}");
        sql.SET("ManagerName = #{record.managername,jdbcType=VARCHAR}");
        sql.SET("ManagerSex = #{record.managersex,jdbcType=VARCHAR}");
        sql.SET("ManagerBirthdate = #{record.managerbirthdate,jdbcType=TIMESTAMP}");
        sql.SET("ManagerRights = #{record.managerrights,jdbcType=INTEGER}");
        
        TbManagerExample example = (TbManagerExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TbManager record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_manager");
        
        if (record.getManagername() != null) {
            sql.SET("ManagerName = #{managername,jdbcType=VARCHAR}");
        }
        
        if (record.getManagersex() != null) {
            sql.SET("ManagerSex = #{managersex,jdbcType=VARCHAR}");
        }
        
        if (record.getManagerbirthdate() != null) {
            sql.SET("ManagerBirthdate = #{managerbirthdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getManagerrights() != null) {
            sql.SET("ManagerRights = #{managerrights,jdbcType=INTEGER}");
        }
        
        sql.WHERE("ManagerNum = #{managernum,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, TbManagerExample example, boolean includeExamplePhrase) {
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