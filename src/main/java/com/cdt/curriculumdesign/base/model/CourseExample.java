package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;

@Generated("course")
public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public CourseExample() {
        oredCriteria = new ArrayList<>();
    }

    public CourseExample setOrderByClause(String orderByClause) {
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

    public static CourseExample instance() {
        return new CourseExample();
    }

    public CourseExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public CourseExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public CourseExample setOffset(Integer offset) {
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

        public Criteria andCourseidIsNull() {
            addCriterion("CourseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("CourseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Long value) {
            addCriterion("CourseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Long value) {
            addCriterion("CourseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Long value) {
            addCriterion("CourseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("CourseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Long value) {
            addCriterion("CourseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Long value) {
            addCriterion("CourseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Long> values) {
            addCriterion("CourseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Long> values) {
            addCriterion("CourseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Long value1, Long value2) {
            addCriterion("CourseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Long value1, Long value2) {
            addCriterion("CourseId not between", value1, value2, "courseid");
            return (Criteria) this;
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

        public Criteria andCoursehoursIsNull() {
            addCriterion("CourseHours is null");
            return (Criteria) this;
        }

        public Criteria andCoursehoursIsNotNull() {
            addCriterion("CourseHours is not null");
            return (Criteria) this;
        }

        public Criteria andCoursehoursEqualTo(Short value) {
            addCriterion("CourseHours =", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursNotEqualTo(Short value) {
            addCriterion("CourseHours <>", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursGreaterThan(Short value) {
            addCriterion("CourseHours >", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursGreaterThanOrEqualTo(Short value) {
            addCriterion("CourseHours >=", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursLessThan(Short value) {
            addCriterion("CourseHours <", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursLessThanOrEqualTo(Short value) {
            addCriterion("CourseHours <=", value, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursIn(List<Short> values) {
            addCriterion("CourseHours in", values, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursNotIn(List<Short> values) {
            addCriterion("CourseHours not in", values, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursBetween(Short value1, Short value2) {
            addCriterion("CourseHours between", value1, value2, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursehoursNotBetween(Short value1, Short value2) {
            addCriterion("CourseHours not between", value1, value2, "coursehours");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeIsNull() {
            addCriterion("courseCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeIsNotNull() {
            addCriterion("courseCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeEqualTo(Date value) {
            addCriterion("courseCreateTime =", value, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeNotEqualTo(Date value) {
            addCriterion("courseCreateTime <>", value, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeGreaterThan(Date value) {
            addCriterion("courseCreateTime >", value, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("courseCreateTime >=", value, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeLessThan(Date value) {
            addCriterion("courseCreateTime <", value, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("courseCreateTime <=", value, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeIn(List<Date> values) {
            addCriterion("courseCreateTime in", values, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeNotIn(List<Date> values) {
            addCriterion("courseCreateTime not in", values, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeBetween(Date value1, Date value2) {
            addCriterion("courseCreateTime between", value1, value2, "coursecreatetime");
            return (Criteria) this;
        }

        public Criteria andCoursecreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("courseCreateTime not between", value1, value2, "coursecreatetime");
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

        public Criteria andCoursestarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("CourseStartTime =", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CourseStartTime <>", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CourseStartTime >", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CourseStartTime >=", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeLessThan(Date value) {
            addCriterionForJDBCDate("CourseStartTime <", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CourseStartTime <=", value, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("CourseStartTime in", values, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CourseStartTime not in", values, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CourseStartTime between", value1, value2, "coursestarttime");
            return (Criteria) this;
        }

        public Criteria andCoursestarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CourseStartTime not between", value1, value2, "coursestarttime");
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

        public Criteria andCourseendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("CourseEndTime =", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CourseEndTime <>", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CourseEndTime >", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CourseEndTime >=", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeLessThan(Date value) {
            addCriterionForJDBCDate("CourseEndTime <", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CourseEndTime <=", value, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("CourseEndTime in", values, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CourseEndTime not in", values, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CourseEndTime between", value1, value2, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCourseendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CourseEndTime not between", value1, value2, "courseendtime");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekIsNull() {
            addCriterion("CourseStartWeek is null");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekIsNotNull() {
            addCriterion("CourseStartWeek is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekEqualTo(Integer value) {
            addCriterion("CourseStartWeek =", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekNotEqualTo(Integer value) {
            addCriterion("CourseStartWeek <>", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekGreaterThan(Integer value) {
            addCriterion("CourseStartWeek >", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseStartWeek >=", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekLessThan(Integer value) {
            addCriterion("CourseStartWeek <", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekLessThanOrEqualTo(Integer value) {
            addCriterion("CourseStartWeek <=", value, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekIn(List<Integer> values) {
            addCriterion("CourseStartWeek in", values, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekNotIn(List<Integer> values) {
            addCriterion("CourseStartWeek not in", values, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekBetween(Integer value1, Integer value2) {
            addCriterion("CourseStartWeek between", value1, value2, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCoursestartweekNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseStartWeek not between", value1, value2, "coursestartweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekIsNull() {
            addCriterion("CourseEndWeek is null");
            return (Criteria) this;
        }

        public Criteria andCourseendweekIsNotNull() {
            addCriterion("CourseEndWeek is not null");
            return (Criteria) this;
        }

        public Criteria andCourseendweekEqualTo(Integer value) {
            addCriterion("CourseEndWeek =", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekNotEqualTo(Integer value) {
            addCriterion("CourseEndWeek <>", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekGreaterThan(Integer value) {
            addCriterion("CourseEndWeek >", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseEndWeek >=", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekLessThan(Integer value) {
            addCriterion("CourseEndWeek <", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekLessThanOrEqualTo(Integer value) {
            addCriterion("CourseEndWeek <=", value, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekIn(List<Integer> values) {
            addCriterion("CourseEndWeek in", values, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekNotIn(List<Integer> values) {
            addCriterion("CourseEndWeek not in", values, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekBetween(Integer value1, Integer value2) {
            addCriterion("CourseEndWeek between", value1, value2, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseendweekNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseEndWeek not between", value1, value2, "courseendweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekIsNull() {
            addCriterion("CourseWeek is null");
            return (Criteria) this;
        }

        public Criteria andCourseweekIsNotNull() {
            addCriterion("CourseWeek is not null");
            return (Criteria) this;
        }

        public Criteria andCourseweekEqualTo(String value) {
            addCriterion("CourseWeek =", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekNotEqualTo(String value) {
            addCriterion("CourseWeek <>", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekGreaterThan(String value) {
            addCriterion("CourseWeek >", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekGreaterThanOrEqualTo(String value) {
            addCriterion("CourseWeek >=", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekLessThan(String value) {
            addCriterion("CourseWeek <", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekLessThanOrEqualTo(String value) {
            addCriterion("CourseWeek <=", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekLike(String value) {
            addCriterion("CourseWeek like", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekNotLike(String value) {
            addCriterion("CourseWeek not like", value, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekIn(List<String> values) {
            addCriterion("CourseWeek in", values, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekNotIn(List<String> values) {
            addCriterion("CourseWeek not in", values, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekBetween(String value1, String value2) {
            addCriterion("CourseWeek between", value1, value2, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCourseweekNotBetween(String value1, String value2) {
            addCriterion("CourseWeek not between", value1, value2, "courseweek");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumIsNull() {
            addCriterion("CourseDayNum is null");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumIsNotNull() {
            addCriterion("CourseDayNum is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumEqualTo(String value) {
            addCriterion("CourseDayNum =", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumNotEqualTo(String value) {
            addCriterion("CourseDayNum <>", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumGreaterThan(String value) {
            addCriterion("CourseDayNum >", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumGreaterThanOrEqualTo(String value) {
            addCriterion("CourseDayNum >=", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumLessThan(String value) {
            addCriterion("CourseDayNum <", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumLessThanOrEqualTo(String value) {
            addCriterion("CourseDayNum <=", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumLike(String value) {
            addCriterion("CourseDayNum like", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumNotLike(String value) {
            addCriterion("CourseDayNum not like", value, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumIn(List<String> values) {
            addCriterion("CourseDayNum in", values, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumNotIn(List<String> values) {
            addCriterion("CourseDayNum not in", values, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumBetween(String value1, String value2) {
            addCriterion("CourseDayNum between", value1, value2, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursedaynumNotBetween(String value1, String value2) {
            addCriterion("CourseDayNum not between", value1, value2, "coursedaynum");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIsNull() {
            addCriterion("CourseStatus is null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIsNotNull() {
            addCriterion("CourseStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusEqualTo(String value) {
            addCriterion("CourseStatus =", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotEqualTo(String value) {
            addCriterion("CourseStatus <>", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThan(String value) {
            addCriterion("CourseStatus >", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThanOrEqualTo(String value) {
            addCriterion("CourseStatus >=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThan(String value) {
            addCriterion("CourseStatus <", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThanOrEqualTo(String value) {
            addCriterion("CourseStatus <=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLike(String value) {
            addCriterion("CourseStatus like", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotLike(String value) {
            addCriterion("CourseStatus not like", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIn(List<String> values) {
            addCriterion("CourseStatus in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotIn(List<String> values) {
            addCriterion("CourseStatus not in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusBetween(String value1, String value2) {
            addCriterion("CourseStatus between", value1, value2, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotBetween(String value1, String value2) {
            addCriterion("CourseStatus not between", value1, value2, "coursestatus");
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

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("CourseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("CourseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("CourseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CourseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("CourseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("CourseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("CourseType like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("CourseType not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("CourseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("CourseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("CourseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("CourseType not between", value1, value2, "coursetype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private CourseExample example;

        protected Criteria() {
            super();
        }

        public CourseExample example() {
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