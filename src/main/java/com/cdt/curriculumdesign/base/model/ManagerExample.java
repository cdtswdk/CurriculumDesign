package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;

@Generated("manager")
public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public ManagerExample() {
        oredCriteria = new ArrayList<>();
    }

    public ManagerExample setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
        return this;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        criteria.example = this;
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static ManagerExample instance() {
        return new ManagerExample();
    }

    public ManagerExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ManagerExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public ManagerExample setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andManageridIsNull() {
            addCriterion("ManagerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("ManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Long value) {
            addCriterion("ManagerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Long value) {
            addCriterion("ManagerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Long value) {
            addCriterion("ManagerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Long value) {
            addCriterion("ManagerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Long value) {
            addCriterion("ManagerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Long value) {
            addCriterion("ManagerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Long> values) {
            addCriterion("ManagerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Long> values) {
            addCriterion("ManagerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Long value1, Long value2) {
            addCriterion("ManagerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Long value1, Long value2) {
            addCriterion("ManagerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidIsNull() {
            addCriterion("ManagerDeptId is null");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidIsNotNull() {
            addCriterion("ManagerDeptId is not null");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidEqualTo(Long value) {
            addCriterion("ManagerDeptId =", value, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidNotEqualTo(Long value) {
            addCriterion("ManagerDeptId <>", value, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidGreaterThan(Long value) {
            addCriterion("ManagerDeptId >", value, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidGreaterThanOrEqualTo(Long value) {
            addCriterion("ManagerDeptId >=", value, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidLessThan(Long value) {
            addCriterion("ManagerDeptId <", value, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidLessThanOrEqualTo(Long value) {
            addCriterion("ManagerDeptId <=", value, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidIn(List<Long> values) {
            addCriterion("ManagerDeptId in", values, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidNotIn(List<Long> values) {
            addCriterion("ManagerDeptId not in", values, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidBetween(Long value1, Long value2) {
            addCriterion("ManagerDeptId between", value1, value2, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagerdeptidNotBetween(Long value1, Long value2) {
            addCriterion("ManagerDeptId not between", value1, value2, "managerdeptid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridIsNull() {
            addCriterion("ManagerMajorId is null");
            return (Criteria) this;
        }

        public Criteria andManagermajoridIsNotNull() {
            addCriterion("ManagerMajorId is not null");
            return (Criteria) this;
        }

        public Criteria andManagermajoridEqualTo(Long value) {
            addCriterion("ManagerMajorId =", value, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridNotEqualTo(Long value) {
            addCriterion("ManagerMajorId <>", value, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridGreaterThan(Long value) {
            addCriterion("ManagerMajorId >", value, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridGreaterThanOrEqualTo(Long value) {
            addCriterion("ManagerMajorId >=", value, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridLessThan(Long value) {
            addCriterion("ManagerMajorId <", value, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridLessThanOrEqualTo(Long value) {
            addCriterion("ManagerMajorId <=", value, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridIn(List<Long> values) {
            addCriterion("ManagerMajorId in", values, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridNotIn(List<Long> values) {
            addCriterion("ManagerMajorId not in", values, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridBetween(Long value1, Long value2) {
            addCriterion("ManagerMajorId between", value1, value2, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagermajoridNotBetween(Long value1, Long value2) {
            addCriterion("ManagerMajorId not between", value1, value2, "managermajorid");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNull() {
            addCriterion("ManagerName is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("ManagerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("ManagerName =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("ManagerName <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("ManagerName >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerName >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("ManagerName <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("ManagerName <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("ManagerName like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("ManagerName not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("ManagerName in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("ManagerName not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("ManagerName between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("ManagerName not between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagersexIsNull() {
            addCriterion("ManagerSex is null");
            return (Criteria) this;
        }

        public Criteria andManagersexIsNotNull() {
            addCriterion("ManagerSex is not null");
            return (Criteria) this;
        }

        public Criteria andManagersexEqualTo(String value) {
            addCriterion("ManagerSex =", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotEqualTo(String value) {
            addCriterion("ManagerSex <>", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexGreaterThan(String value) {
            addCriterion("ManagerSex >", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerSex >=", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexLessThan(String value) {
            addCriterion("ManagerSex <", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexLessThanOrEqualTo(String value) {
            addCriterion("ManagerSex <=", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexLike(String value) {
            addCriterion("ManagerSex like", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotLike(String value) {
            addCriterion("ManagerSex not like", value, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexIn(List<String> values) {
            addCriterion("ManagerSex in", values, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotIn(List<String> values) {
            addCriterion("ManagerSex not in", values, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexBetween(String value1, String value2) {
            addCriterion("ManagerSex between", value1, value2, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagersexNotBetween(String value1, String value2) {
            addCriterion("ManagerSex not between", value1, value2, "managersex");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyIsNull() {
            addCriterion("ManagerBirthdy is null");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyIsNotNull() {
            addCriterion("ManagerBirthdy is not null");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthdy =", value, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyNotEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthdy <>", value, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyGreaterThan(Date value) {
            addCriterionForJDBCDate("ManagerBirthdy >", value, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthdy >=", value, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyLessThan(Date value) {
            addCriterionForJDBCDate("ManagerBirthdy <", value, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ManagerBirthdy <=", value, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyIn(List<Date> values) {
            addCriterionForJDBCDate("ManagerBirthdy in", values, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyNotIn(List<Date> values) {
            addCriterionForJDBCDate("ManagerBirthdy not in", values, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ManagerBirthdy between", value1, value2, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ManagerBirthdy not between", value1, value2, "managerbirthdy");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordIsNull() {
            addCriterion("ManagerPassword is null");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordIsNotNull() {
            addCriterion("ManagerPassword is not null");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordEqualTo(String value) {
            addCriterion("ManagerPassword =", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotEqualTo(String value) {
            addCriterion("ManagerPassword <>", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordGreaterThan(String value) {
            addCriterion("ManagerPassword >", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerPassword >=", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordLessThan(String value) {
            addCriterion("ManagerPassword <", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordLessThanOrEqualTo(String value) {
            addCriterion("ManagerPassword <=", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordLike(String value) {
            addCriterion("ManagerPassword like", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotLike(String value) {
            addCriterion("ManagerPassword not like", value, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordIn(List<String> values) {
            addCriterion("ManagerPassword in", values, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotIn(List<String> values) {
            addCriterion("ManagerPassword not in", values, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordBetween(String value1, String value2) {
            addCriterion("ManagerPassword between", value1, value2, "managerpassword");
            return (Criteria) this;
        }

        public Criteria andManagerpasswordNotBetween(String value1, String value2) {
            addCriterion("ManagerPassword not between", value1, value2, "managerpassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private ManagerExample example;

        protected Criteria() {
            super();
        }

        public ManagerExample example() {
            return this.example;
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}