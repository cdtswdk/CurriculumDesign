package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;

@Generated("teacher")
public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public TeacherExample() {
        oredCriteria = new ArrayList<>();
    }

    public TeacherExample setOrderByClause(String orderByClause) {
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

    public static TeacherExample instance() {
        return new TeacherExample();
    }

    public TeacherExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public TeacherExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public TeacherExample setOffset(Integer offset) {
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

        public Criteria andTeacheridIsNull() {
            addCriterion("TeacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("TeacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Long value) {
            addCriterion("TeacherId =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Long value) {
            addCriterion("TeacherId <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Long value) {
            addCriterion("TeacherId >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Long value) {
            addCriterion("TeacherId >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Long value) {
            addCriterion("TeacherId <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Long value) {
            addCriterion("TeacherId <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Long> values) {
            addCriterion("TeacherId in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Long> values) {
            addCriterion("TeacherId not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Long value1, Long value2) {
            addCriterion("TeacherId between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Long value1, Long value2) {
            addCriterion("TeacherId not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DeptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DeptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Long value) {
            addCriterion("DeptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Long value) {
            addCriterion("DeptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Long value) {
            addCriterion("DeptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Long value) {
            addCriterion("DeptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Long value) {
            addCriterion("DeptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Long value) {
            addCriterion("DeptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Long> values) {
            addCriterion("DeptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Long> values) {
            addCriterion("DeptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Long value1, Long value2) {
            addCriterion("DeptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Long value1, Long value2) {
            addCriterion("DeptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNull() {
            addCriterion("MajorId is null");
            return (Criteria) this;
        }

        public Criteria andMajoridIsNotNull() {
            addCriterion("MajorId is not null");
            return (Criteria) this;
        }

        public Criteria andMajoridEqualTo(Long value) {
            addCriterion("MajorId =", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotEqualTo(Long value) {
            addCriterion("MajorId <>", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThan(Long value) {
            addCriterion("MajorId >", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridGreaterThanOrEqualTo(Long value) {
            addCriterion("MajorId >=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThan(Long value) {
            addCriterion("MajorId <", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridLessThanOrEqualTo(Long value) {
            addCriterion("MajorId <=", value, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridIn(List<Long> values) {
            addCriterion("MajorId in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotIn(List<Long> values) {
            addCriterion("MajorId not in", values, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridBetween(Long value1, Long value2) {
            addCriterion("MajorId between", value1, value2, "majorid");
            return (Criteria) this;
        }

        public Criteria andMajoridNotBetween(Long value1, Long value2) {
            addCriterion("MajorId not between", value1, value2, "majorid");
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
            addCriterionForJDBCDate("TeacherBirthday =", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("TeacherBirthday <>", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("TeacherBirthday >", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TeacherBirthday >=", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("TeacherBirthday <", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TeacherBirthday <=", value, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("TeacherBirthday in", values, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("TeacherBirthday not in", values, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TeacherBirthday between", value1, value2, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TeacherBirthday not between", value1, value2, "teacherbirthday");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNull() {
            addCriterion("TeacherPassword is null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIsNotNull() {
            addCriterion("TeacherPassword is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordEqualTo(String value) {
            addCriterion("TeacherPassword =", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotEqualTo(String value) {
            addCriterion("TeacherPassword <>", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThan(String value) {
            addCriterion("TeacherPassword >", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherPassword >=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThan(String value) {
            addCriterion("TeacherPassword <", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLessThanOrEqualTo(String value) {
            addCriterion("TeacherPassword <=", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordLike(String value) {
            addCriterion("TeacherPassword like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotLike(String value) {
            addCriterion("TeacherPassword not like", value, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordIn(List<String> values) {
            addCriterion("TeacherPassword in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotIn(List<String> values) {
            addCriterion("TeacherPassword not in", values, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordBetween(String value1, String value2) {
            addCriterion("TeacherPassword between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherpasswordNotBetween(String value1, String value2) {
            addCriterion("TeacherPassword not between", value1, value2, "teacherpassword");
            return (Criteria) this;
        }

        public Criteria andTeacherdescIsNull() {
            addCriterion("TeacherDesc is null");
            return (Criteria) this;
        }

        public Criteria andTeacherdescIsNotNull() {
            addCriterion("TeacherDesc is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherdescEqualTo(String value) {
            addCriterion("TeacherDesc =", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescNotEqualTo(String value) {
            addCriterion("TeacherDesc <>", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescGreaterThan(String value) {
            addCriterion("TeacherDesc >", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescGreaterThanOrEqualTo(String value) {
            addCriterion("TeacherDesc >=", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescLessThan(String value) {
            addCriterion("TeacherDesc <", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescLessThanOrEqualTo(String value) {
            addCriterion("TeacherDesc <=", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescLike(String value) {
            addCriterion("TeacherDesc like", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescNotLike(String value) {
            addCriterion("TeacherDesc not like", value, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescIn(List<String> values) {
            addCriterion("TeacherDesc in", values, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescNotIn(List<String> values) {
            addCriterion("TeacherDesc not in", values, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescBetween(String value1, String value2) {
            addCriterion("TeacherDesc between", value1, value2, "teacherdesc");
            return (Criteria) this;
        }

        public Criteria andTeacherdescNotBetween(String value1, String value2) {
            addCriterion("TeacherDesc not between", value1, value2, "teacherdesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TeacherExample example;

        protected Criteria() {
            super();
        }

        public TeacherExample example() {
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