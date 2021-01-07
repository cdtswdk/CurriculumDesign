package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

@Generated("tb_teacher")
public class TbTeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public TbTeacherExample() {
        oredCriteria = new ArrayList<>();
    }

    public TbTeacherExample setOrderByClause(String orderByClause) {
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

    public static TbTeacherExample instance() {
        return new TbTeacherExample();
    }

    public TbTeacherExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public TbTeacherExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public TbTeacherExample setOffset(Integer offset) {
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

        public Criteria andTeachernumIsNull() {
            addCriterion("TeacherNum is null");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNotNull() {
            addCriterion("TeacherNum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernumEqualTo(String value) {
            addCriterion("TeacherNum =", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotEqualTo(String value) {
            addCriterion("TeacherNum <>", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThan(String value) {
            addCriterion("TeacherNum >", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherNum >=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThan(String value) {
            addCriterion("TeacherNum <", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThanOrEqualTo(String value) {
            addCriterion("TeacherNum <=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLike(String value) {
            addCriterion("TeacherNum like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotLike(String value) {
            addCriterion("TeacherNum not like", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumIn(List<String> values) {
            addCriterion("TeacherNum in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotIn(List<String> values) {
            addCriterion("TeacherNum not in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumBetween(String value1, String value2) {
            addCriterion("TeacherNum between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotBetween(String value1, String value2) {
            addCriterion("TeacherNum not between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andDeptnumIsNull() {
            addCriterion("DeptNum is null");
            return (Criteria) this;
        }

        public Criteria andDeptnumIsNotNull() {
            addCriterion("DeptNum is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnumEqualTo(String value) {
            addCriterion("DeptNum =", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotEqualTo(String value) {
            addCriterion("DeptNum <>", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThan(String value) {
            addCriterion("DeptNum >", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThanOrEqualTo(String value) {
            addCriterion("DeptNum >=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThan(String value) {
            addCriterion("DeptNum <", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThanOrEqualTo(String value) {
            addCriterion("DeptNum <=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLike(String value) {
            addCriterion("DeptNum like", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotLike(String value) {
            addCriterion("DeptNum not like", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumIn(List<String> values) {
            addCriterion("DeptNum in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotIn(List<String> values) {
            addCriterion("DeptNum not in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumBetween(String value1, String value2) {
            addCriterion("DeptNum between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotBetween(String value1, String value2) {
            addCriterion("DeptNum not between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNull() {
            addCriterion("MajorNum is null");
            return (Criteria) this;
        }

        public Criteria andMajornumIsNotNull() {
            addCriterion("MajorNum is not null");
            return (Criteria) this;
        }

        public Criteria andMajornumEqualTo(String value) {
            addCriterion("MajorNum =", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotEqualTo(String value) {
            addCriterion("MajorNum <>", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThan(String value) {
            addCriterion("MajorNum >", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumGreaterThanOrEqualTo(String value) {
            addCriterion("MajorNum >=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThan(String value) {
            addCriterion("MajorNum <", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLessThanOrEqualTo(String value) {
            addCriterion("MajorNum <=", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumLike(String value) {
            addCriterion("MajorNum like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotLike(String value) {
            addCriterion("MajorNum not like", value, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumIn(List<String> values) {
            addCriterion("MajorNum in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotIn(List<String> values) {
            addCriterion("MajorNum not in", values, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumBetween(String value1, String value2) {
            addCriterion("MajorNum between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andMajornumNotBetween(String value1, String value2) {
            addCriterion("MajorNum not between", value1, value2, "majornum");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("TeacherName is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("TeacherName is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("TeacherName =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("TeacherName <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("TeacherName >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherName >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("TeacherName <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("TeacherName <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("TeacherName like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("TeacherName not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("TeacherName in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("TeacherName not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("TeacherName between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("TeacherName not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNull() {
            addCriterion("TeacherSex is null");
            return (Criteria) this;
        }

        public Criteria andTeachersexIsNotNull() {
            addCriterion("TeacherSex is not null");
            return (Criteria) this;
        }

        public Criteria andTeachersexEqualTo(String value) {
            addCriterion("TeacherSex =", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotEqualTo(String value) {
            addCriterion("TeacherSex <>", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThan(String value) {
            addCriterion("TeacherSex >", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherSex >=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThan(String value) {
            addCriterion("TeacherSex <", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLessThanOrEqualTo(String value) {
            addCriterion("TeacherSex <=", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexLike(String value) {
            addCriterion("TeacherSex like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotLike(String value) {
            addCriterion("TeacherSex not like", value, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexIn(List<String> values) {
            addCriterion("TeacherSex in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotIn(List<String> values) {
            addCriterion("TeacherSex not in", values, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexBetween(String value1, String value2) {
            addCriterion("TeacherSex between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeachersexNotBetween(String value1, String value2) {
            addCriterion("TeacherSex not between", value1, value2, "teachersex");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayIsNull() {
            addCriterion("TeacherBirthday is null");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayIsNotNull() {
            addCriterion("TeacherBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayEqualTo(Date value) {
            addCriterion("TeacherBirthday =", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotEqualTo(Date value) {
            addCriterion("TeacherBirthday <>", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayGreaterThan(Date value) {
            addCriterion("TeacherBirthday >", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("TeacherBirthday >=", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayLessThan(Date value) {
            addCriterion("TeacherBirthday <", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayLessThanOrEqualTo(Date value) {
            addCriterion("TeacherBirthday <=", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayIn(List<Date> values) {
            addCriterion("TeacherBirthday in", values, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotIn(List<Date> values) {
            addCriterion("TeacherBirthday not in", values, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayBetween(Date value1, Date value2) {
            addCriterion("TeacherBirthday between", value1, value2, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotBetween(Date value1, Date value2) {
            addCriterion("TeacherBirthday not between", value1, value2, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIsNull() {
            addCriterion("TeacherTitle is null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIsNotNull() {
            addCriterion("TeacherTitle is not null");
            return (Criteria) this;
        }

        public Criteria andTeachertitleEqualTo(String value) {
            addCriterion("TeacherTitle =", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotEqualTo(String value) {
            addCriterion("TeacherTitle <>", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleGreaterThan(String value) {
            addCriterion("TeacherTitle >", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherTitle >=", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLessThan(String value) {
            addCriterion("TeacherTitle <", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLessThanOrEqualTo(String value) {
            addCriterion("TeacherTitle <=", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleLike(String value) {
            addCriterion("TeacherTitle like", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotLike(String value) {
            addCriterion("TeacherTitle not like", value, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleIn(List<String> values) {
            addCriterion("TeacherTitle in", values, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotIn(List<String> values) {
            addCriterion("TeacherTitle not in", values, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleBetween(String value1, String value2) {
            addCriterion("TeacherTitle between", value1, value2, "teachertitle");
            return (Criteria) this;
        }

        public Criteria andTeachertitleNotBetween(String value1, String value2) {
            addCriterion("TeacherTitle not between", value1, value2, "teachertitle");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TbTeacherExample example;

        protected Criteria() {
            super();
        }

        public TbTeacherExample example() {
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