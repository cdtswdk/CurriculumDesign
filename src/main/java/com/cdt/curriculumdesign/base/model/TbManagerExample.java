package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

@Generated("tb_manager")
public class TbManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public TbManagerExample() {
        oredCriteria = new ArrayList<>();
    }

    public TbManagerExample setOrderByClause(String orderByClause) {
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

    public static TbManagerExample instance() {
        return new TbManagerExample();
    }

    public TbManagerExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public TbManagerExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public TbManagerExample setOffset(Integer offset) {
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

        public Criteria andManagernumIsNull() {
            addCriterion("ManagerNum is null");
            return (Criteria) this;
        }

        public Criteria andManagernumIsNotNull() {
            addCriterion("ManagerNum is not null");
            return (Criteria) this;
        }

        public Criteria andManagernumEqualTo(String value) {
            addCriterion("ManagerNum =", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotEqualTo(String value) {
            addCriterion("ManagerNum <>", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumGreaterThan(String value) {
            addCriterion("ManagerNum >", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerNum >=", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumLessThan(String value) {
            addCriterion("ManagerNum <", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumLessThanOrEqualTo(String value) {
            addCriterion("ManagerNum <=", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumLike(String value) {
            addCriterion("ManagerNum like", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotLike(String value) {
            addCriterion("ManagerNum not like", value, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumIn(List<String> values) {
            addCriterion("ManagerNum in", values, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotIn(List<String> values) {
            addCriterion("ManagerNum not in", values, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumBetween(String value1, String value2) {
            addCriterion("ManagerNum between", value1, value2, "managernum");
            return (Criteria) this;
        }

        public Criteria andManagernumNotBetween(String value1, String value2) {
            addCriterion("ManagerNum not between", value1, value2, "managernum");
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

        public Criteria andManagerbirthdateIsNull() {
            addCriterion("ManagerBirthdate is null");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateIsNotNull() {
            addCriterion("ManagerBirthdate is not null");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateEqualTo(Date value) {
            addCriterion("ManagerBirthdate =", value, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateNotEqualTo(Date value) {
            addCriterion("ManagerBirthdate <>", value, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateGreaterThan(Date value) {
            addCriterion("ManagerBirthdate >", value, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ManagerBirthdate >=", value, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateLessThan(Date value) {
            addCriterion("ManagerBirthdate <", value, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateLessThanOrEqualTo(Date value) {
            addCriterion("ManagerBirthdate <=", value, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateIn(List<Date> values) {
            addCriterion("ManagerBirthdate in", values, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateNotIn(List<Date> values) {
            addCriterion("ManagerBirthdate not in", values, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateBetween(Date value1, Date value2) {
            addCriterion("ManagerBirthdate between", value1, value2, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerbirthdateNotBetween(Date value1, Date value2) {
            addCriterion("ManagerBirthdate not between", value1, value2, "managerbirthdate");
            return (Criteria) this;
        }

        public Criteria andManagerrightsIsNull() {
            addCriterion("ManagerRights is null");
            return (Criteria) this;
        }

        public Criteria andManagerrightsIsNotNull() {
            addCriterion("ManagerRights is not null");
            return (Criteria) this;
        }

        public Criteria andManagerrightsEqualTo(Integer value) {
            addCriterion("ManagerRights =", value, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsNotEqualTo(Integer value) {
            addCriterion("ManagerRights <>", value, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsGreaterThan(Integer value) {
            addCriterion("ManagerRights >", value, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ManagerRights >=", value, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsLessThan(Integer value) {
            addCriterion("ManagerRights <", value, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsLessThanOrEqualTo(Integer value) {
            addCriterion("ManagerRights <=", value, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsIn(List<Integer> values) {
            addCriterion("ManagerRights in", values, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsNotIn(List<Integer> values) {
            addCriterion("ManagerRights not in", values, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsBetween(Integer value1, Integer value2) {
            addCriterion("ManagerRights between", value1, value2, "managerrights");
            return (Criteria) this;
        }

        public Criteria andManagerrightsNotBetween(Integer value1, Integer value2) {
            addCriterion("ManagerRights not between", value1, value2, "managerrights");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TbManagerExample example;

        protected Criteria() {
            super();
        }

        public TbManagerExample example() {
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