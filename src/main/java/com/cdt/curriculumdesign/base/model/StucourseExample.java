package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;

@Generated("stucourse")
public class StucourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public StucourseExample() {
        oredCriteria = new ArrayList<>();
    }

    public StucourseExample setOrderByClause(String orderByClause) {
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

    public static StucourseExample instance() {
        return new StucourseExample();
    }

    public StucourseExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public StucourseExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public StucourseExample setOffset(Integer offset) {
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

        public Criteria andStucourseidIsNull() {
            addCriterion("stucourseId is null");
            return (Criteria) this;
        }

        public Criteria andStucourseidIsNotNull() {
            addCriterion("stucourseId is not null");
            return (Criteria) this;
        }

        public Criteria andStucourseidEqualTo(Long value) {
            addCriterion("stucourseId =", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotEqualTo(Long value) {
            addCriterion("stucourseId <>", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidGreaterThan(Long value) {
            addCriterion("stucourseId >", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidGreaterThanOrEqualTo(Long value) {
            addCriterion("stucourseId >=", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidLessThan(Long value) {
            addCriterion("stucourseId <", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidLessThanOrEqualTo(Long value) {
            addCriterion("stucourseId <=", value, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidIn(List<Long> values) {
            addCriterion("stucourseId in", values, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotIn(List<Long> values) {
            addCriterion("stucourseId not in", values, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidBetween(Long value1, Long value2) {
            addCriterion("stucourseId between", value1, value2, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStucourseidNotBetween(Long value1, Long value2) {
            addCriterion("stucourseId not between", value1, value2, "stucourseid");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("StudentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("StudentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Long value) {
            addCriterion("StudentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Long value) {
            addCriterion("StudentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Long value) {
            addCriterion("StudentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Long value) {
            addCriterion("StudentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Long value) {
            addCriterion("StudentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Long value) {
            addCriterion("StudentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Long> values) {
            addCriterion("StudentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Long> values) {
            addCriterion("StudentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Long value1, Long value2) {
            addCriterion("StudentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Long value1, Long value2) {
            addCriterion("StudentId not between", value1, value2, "studentid");
            return (Criteria) this;
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

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradepointIsNull() {
            addCriterion("GradePoint is null");
            return (Criteria) this;
        }

        public Criteria andGradepointIsNotNull() {
            addCriterion("GradePoint is not null");
            return (Criteria) this;
        }

        public Criteria andGradepointEqualTo(Float value) {
            addCriterion("GradePoint =", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointNotEqualTo(Float value) {
            addCriterion("GradePoint <>", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointGreaterThan(Float value) {
            addCriterion("GradePoint >", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointGreaterThanOrEqualTo(Float value) {
            addCriterion("GradePoint >=", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointLessThan(Float value) {
            addCriterion("GradePoint <", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointLessThanOrEqualTo(Float value) {
            addCriterion("GradePoint <=", value, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointIn(List<Float> values) {
            addCriterion("GradePoint in", values, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointNotIn(List<Float> values) {
            addCriterion("GradePoint not in", values, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointBetween(Float value1, Float value2) {
            addCriterion("GradePoint between", value1, value2, "gradepoint");
            return (Criteria) this;
        }

        public Criteria andGradepointNotBetween(Float value1, Float value2) {
            addCriterion("GradePoint not between", value1, value2, "gradepoint");
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
        private StucourseExample example;

        protected Criteria() {
            super();
        }

        public StucourseExample example() {
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