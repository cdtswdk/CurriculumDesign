package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("tb_stucourse")
public class TbStucourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public TbStucourseExample() {
        oredCriteria = new ArrayList<>();
    }

    public TbStucourseExample setOrderByClause(String orderByClause) {
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

    public static TbStucourseExample instance() {
        return new TbStucourseExample();
    }

    public TbStucourseExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public TbStucourseExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public TbStucourseExample setOffset(Integer offset) {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("StudentNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("StudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(String value) {
            addCriterion("StudentNum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(String value) {
            addCriterion("StudentNum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(String value) {
            addCriterion("StudentNum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(String value) {
            addCriterion("StudentNum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(String value) {
            addCriterion("StudentNum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(String value) {
            addCriterion("StudentNum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLike(String value) {
            addCriterion("StudentNum like", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotLike(String value) {
            addCriterion("StudentNum not like", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<String> values) {
            addCriterion("StudentNum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<String> values) {
            addCriterion("StudentNum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(String value1, String value2) {
            addCriterion("StudentNum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(String value1, String value2) {
            addCriterion("StudentNum not between", value1, value2, "studentnum");
            return (Criteria) this;
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

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Short value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Short value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Short value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Short value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Short value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Short value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Short> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Short> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Short value1, Short value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Short value1, Short value2) {
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

        public Criteria andCoursestatusIsNull() {
            addCriterion("CourseStatus is null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIsNotNull() {
            addCriterion("CourseStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCoursestatusEqualTo(Integer value) {
            addCriterion("CourseStatus =", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotEqualTo(Integer value) {
            addCriterion("CourseStatus <>", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThan(Integer value) {
            addCriterion("CourseStatus >", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CourseStatus >=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThan(Integer value) {
            addCriterion("CourseStatus <", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusLessThanOrEqualTo(Integer value) {
            addCriterion("CourseStatus <=", value, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusIn(List<Integer> values) {
            addCriterion("CourseStatus in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotIn(List<Integer> values) {
            addCriterion("CourseStatus not in", values, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusBetween(Integer value1, Integer value2) {
            addCriterion("CourseStatus between", value1, value2, "coursestatus");
            return (Criteria) this;
        }

        public Criteria andCoursestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CourseStatus not between", value1, value2, "coursestatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TbStucourseExample example;

        protected Criteria() {
            super();
        }

        public TbStucourseExample example() {
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