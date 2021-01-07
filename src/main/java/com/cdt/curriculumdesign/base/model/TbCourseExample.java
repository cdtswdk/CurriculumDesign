package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("tb_course")
public class TbCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public TbCourseExample() {
        oredCriteria = new ArrayList<>();
    }

    public TbCourseExample setOrderByClause(String orderByClause) {
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

    public static TbCourseExample instance() {
        return new TbCourseExample();
    }

    public TbCourseExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public TbCourseExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public TbCourseExample setOffset(Integer offset) {
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

        public Criteria andCoursenumIsNull() {
            addCriterion("CourseNum is null");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNotNull() {
            addCriterion("CourseNum is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenumEqualTo(String value) {
            addCriterion("CourseNum =", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotEqualTo(String value) {
            addCriterion("CourseNum <>", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThan(String value) {
            addCriterion("CourseNum >", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThanOrEqualTo(String value) {
            addCriterion("CourseNum >=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThan(String value) {
            addCriterion("CourseNum <", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThanOrEqualTo(String value) {
            addCriterion("CourseNum <=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLike(String value) {
            addCriterion("CourseNum like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotLike(String value) {
            addCriterion("CourseNum not like", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumIn(List<String> values) {
            addCriterion("CourseNum in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotIn(List<String> values) {
            addCriterion("CourseNum not in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumBetween(String value1, String value2) {
            addCriterion("CourseNum between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotBetween(String value1, String value2) {
            addCriterion("CourseNum not between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("CourseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("CourseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("CourseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("CourseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("CourseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("CourseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("CourseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("CourseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("CourseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("CourseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("CourseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("CourseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("CourseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("CourseName not between", value1, value2, "coursename");
            return (Criteria) this;
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

        public Criteria andCoursecreditIsNull() {
            addCriterion("CourseCredit is null");
            return (Criteria) this;
        }

        public Criteria andCoursecreditIsNotNull() {
            addCriterion("CourseCredit is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecreditEqualTo(Float value) {
            addCriterion("CourseCredit =", value, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditNotEqualTo(Float value) {
            addCriterion("CourseCredit <>", value, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditGreaterThan(Float value) {
            addCriterion("CourseCredit >", value, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditGreaterThanOrEqualTo(Float value) {
            addCriterion("CourseCredit >=", value, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditLessThan(Float value) {
            addCriterion("CourseCredit <", value, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditLessThanOrEqualTo(Float value) {
            addCriterion("CourseCredit <=", value, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditIn(List<Float> values) {
            addCriterion("CourseCredit in", values, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditNotIn(List<Float> values) {
            addCriterion("CourseCredit not in", values, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditBetween(Float value1, Float value2) {
            addCriterion("CourseCredit between", value1, value2, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCoursecreditNotBetween(Float value1, Float value2) {
            addCriterion("CourseCredit not between", value1, value2, "coursecredit");
            return (Criteria) this;
        }

        public Criteria andCourseclassIsNull() {
            addCriterion("CourseClass is null");
            return (Criteria) this;
        }

        public Criteria andCourseclassIsNotNull() {
            addCriterion("CourseClass is not null");
            return (Criteria) this;
        }

        public Criteria andCourseclassEqualTo(Short value) {
            addCriterion("CourseClass =", value, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassNotEqualTo(Short value) {
            addCriterion("CourseClass <>", value, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassGreaterThan(Short value) {
            addCriterion("CourseClass >", value, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassGreaterThanOrEqualTo(Short value) {
            addCriterion("CourseClass >=", value, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassLessThan(Short value) {
            addCriterion("CourseClass <", value, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassLessThanOrEqualTo(Short value) {
            addCriterion("CourseClass <=", value, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassIn(List<Short> values) {
            addCriterion("CourseClass in", values, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassNotIn(List<Short> values) {
            addCriterion("CourseClass not in", values, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassBetween(Short value1, Short value2) {
            addCriterion("CourseClass between", value1, value2, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCourseclassNotBetween(Short value1, Short value2) {
            addCriterion("CourseClass not between", value1, value2, "courseclass");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeIsNull() {
            addCriterion("CourseStartTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeIsNotNull() {
            addCriterion("CourseStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeEqualTo(Integer value) {
            addCriterion("CourseStartTime =", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotEqualTo(Integer value) {
            addCriterion("CourseStartTime <>", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeGreaterThan(Integer value) {
            addCriterion("CourseStartTime >", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseStartTime >=", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeLessThan(Integer value) {
            addCriterion("CourseStartTime <", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("CourseStartTime <=", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeIn(List<Integer> values) {
            addCriterion("CourseStartTime in", values, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotIn(List<Integer> values) {
            addCriterion("CourseStartTime not in", values, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeBetween(Integer value1, Integer value2) {
            addCriterion("CourseStartTime between", value1, value2, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseStartTime not between", value1, value2, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeIsNull() {
            addCriterion("CourseEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeIsNotNull() {
            addCriterion("CourseEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeEqualTo(Integer value) {
            addCriterion("CourseEndTime =", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotEqualTo(Integer value) {
            addCriterion("CourseEndTime <>", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeGreaterThan(Integer value) {
            addCriterion("CourseEndTime >", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseEndTime >=", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeLessThan(Integer value) {
            addCriterion("CourseEndTime <", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeLessThanOrEqualTo(Integer value) {
            addCriterion("CourseEndTime <=", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeIn(List<Integer> values) {
            addCriterion("CourseEndTime in", values, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotIn(List<Integer> values) {
            addCriterion("CourseEndTime not in", values, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeBetween(Integer value1, Integer value2) {
            addCriterion("CourseEndTime between", value1, value2, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseEndTime not between", value1, value2, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCoursedateIsNull() {
            addCriterion("CourseDate is null");
            return (Criteria) this;
        }

        public Criteria andCoursedateIsNotNull() {
            addCriterion("CourseDate is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedateEqualTo(Integer value) {
            addCriterion("CourseDate =", value, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateNotEqualTo(Integer value) {
            addCriterion("CourseDate <>", value, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateGreaterThan(Integer value) {
            addCriterion("CourseDate >", value, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseDate >=", value, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateLessThan(Integer value) {
            addCriterion("CourseDate <", value, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateLessThanOrEqualTo(Integer value) {
            addCriterion("CourseDate <=", value, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateIn(List<Integer> values) {
            addCriterion("CourseDate in", values, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateNotIn(List<Integer> values) {
            addCriterion("CourseDate not in", values, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateBetween(Integer value1, Integer value2) {
            addCriterion("CourseDate between", value1, value2, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursedateNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseDate not between", value1, value2, "coursedate");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("CourseType is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("CourseType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(Integer value) {
            addCriterion("CourseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(Integer value) {
            addCriterion("CourseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(Integer value) {
            addCriterion("CourseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(Integer value) {
            addCriterion("CourseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(Integer value) {
            addCriterion("CourseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<Integer> values) {
            addCriterion("CourseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<Integer> values) {
            addCriterion("CourseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(Integer value1, Integer value2) {
            addCriterion("CourseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseType not between", value1, value2, "coursetype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TbCourseExample example;

        protected Criteria() {
            super();
        }

        public TbCourseExample example() {
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