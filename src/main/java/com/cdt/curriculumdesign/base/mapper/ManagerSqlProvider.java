package com.cdt.curriculumdesign.base.mapper;

import com.cdt.curriculumdesign.base.model.Manager;
import com.cdt.curriculumdesign.base.model.ManagerExample.Criteria;
import com.cdt.curriculumdesign.base.model.ManagerExample.Criterion;
import com.cdt.curriculumdesign.base.model.ManagerExample;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.ibatis.jdbc.SQL;

@Generated("manager")
public class ManagerSqlProvider {
    public String countByExample(ManagerExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("manager");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ManagerExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("manager");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Manager record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("manager");
        
        if (record.getManagerdeptid() != null) {
            sql.VALUES("ManagerDeptId", "#{managerdeptid,jdbcType=BIGINT}");
        }
        
        if (record.getManagermajorid() != null) {
            sql.VALUES("ManagerMajorId", "#{managermajorid,jdbcType=BIGINT}");
        }
        
        if (record.getManagername() != null) {
            sql.VALUES("ManagerName", "#{managername,jdbcType=VARCHAR}");
        }
        
        if (record.getManagersex() != null) {
            sql.VALUES("ManagerSex", "#{managersex,jdbcType=CHAR}");
        }
        
        if (record.getManagerbirthdy() != null) {
            sql.VALUES("ManagerBirthdy", "#{managerbirthdy,jdbcType=DATE}");
        }
        
        if (record.getManagerpassword() != null) {
            sql.VALUES("ManagerPassword", "#{managerpassword,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ManagerExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ManagerId");
        } else {
            sql.SELECT("ManagerId");
        }
        sql.SELECT("ManagerDeptId");
        sql.SELECT("ManagerMajorId");
        sql.SELECT("ManagerName");
        sql.SELECT("ManagerSex");
        sql.SELECT("ManagerBirthdy");
        sql.SELECT("ManagerPassword");
        sql.FROM("manager");
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
        Manager record = (Manager) parameter.get("record");
        ManagerExample example = (ManagerExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("manager");
        
        if (record.getManagerid() != null) {
            sql.SET("ManagerId = #{record.managerid,jdbcType=BIGINT}");
        }
        
        if (record.getManagerdeptid() != null) {
            sql.SET("ManagerDeptId = #{record.managerdeptid,jdbcType=BIGINT}");
        }
        
        if (record.getManagermajorid() != null) {
            sql.SET("ManagerMajorId = #{record.managermajorid,jdbcType=BIGINT}");
        }
        
        if (record.getManagername() != null) {
            sql.SET("ManagerName = #{record.managername,jdbcType=VARCHAR}");
        }
        
        if (record.getManagersex() != null) {
            sql.SET("ManagerSex = #{record.managersex,jdbcType=CHAR}");
        }
        
        if (record.getManagerbirthdy() != null) {
            sql.SET("ManagerBirthdy = #{record.managerbirthdy,jdbcType=DATE}");
        }
        
        if (record.getManagerpassword() != null) {
            sql.SET("ManagerPassword = #{record.managerpassword,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("manager");
        
        sql.SET("ManagerId = #{record.managerid,jdbcType=BIGINT}");
        sql.SET("ManagerDeptId = #{record.managerdeptid,jdbcType=BIGINT}");
        sql.SET("ManagerMajorId = #{record.managermajorid,jdbcType=BIGINT}");
        sql.SET("ManagerName = #{record.managername,jdbcType=VARCHAR}");
        sql.SET("ManagerSex = #{record.managersex,jdbcType=CHAR}");
        sql.SET("ManagerBirthdy = #{record.managerbirthdy,jdbcType=DATE}");
        sql.SET("ManagerPassword = #{record.managerpassword,jdbcType=VARCHAR}");
        
        ManagerExample example = (ManagerExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Manager record) {
        SQL sql = new SQL();
        sql.UPDATE("manager");
        
        if (record.getManagerdeptid() != null) {
            sql.SET("ManagerDeptId = #{managerdeptid,jdbcType=BIGINT}");
        }
        
        if (record.getManagermajorid() != null) {
            sql.SET("ManagerMajorId = #{managermajorid,jdbcType=BIGINT}");
        }
        
        if (record.getManagername() != null) {
            sql.SET("ManagerName = #{managername,jdbcType=VARCHAR}");
        }
        
        if (record.getManagersex() != null) {
            sql.SET("ManagerSex = #{managersex,jdbcType=CHAR}");
        }
        
        if (record.getManagerbirthdy() != null) {
            sql.SET("ManagerBirthdy = #{managerbirthdy,jdbcType=DATE}");
        }
        
        if (record.getManagerpassword() != null) {
            sql.SET("ManagerPassword = #{managerpassword,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ManagerId = #{managerid,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ManagerExample example, boolean includeExamplePhrase) {
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