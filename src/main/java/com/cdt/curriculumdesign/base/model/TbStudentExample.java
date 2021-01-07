package com.cdt.curriculumdesign.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

@Generated("tb_student")
public class TbStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer pageNum;

    private Integer pageSize;

    private Integer limit;

    private Integer offset;

    public TbStudentExample() {
        oredCriteria = new ArrayList<>();
    }

    public TbStudentExample setOrderByClause(String orderByClause) {
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

    public static TbStudentExample instance() {
        return new TbStudentExample();
    }

    public TbStudentExample paging(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public TbStudentExample setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public TbStudentExample setOffset(Integer offset) {
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

        public Criteria andClassnumIsNull() {
            addCriterion("ClassNum is null");
            return (Criteria) this;
        }

        public Criteria andClassnumIsNotNull() {
            addCriterion("ClassNum is not null");
            return (Criteria) this;
        }

        public Criteria andClassnumEqualTo(String value) {
            addCriterion("ClassNum =", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotEqualTo(String value) {
            addCriterion("ClassNum <>", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThan(String value) {
            addCriterion("ClassNum >", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumGreaterThanOrEqualTo(String value) {
            addCriterion("ClassNum >=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThan(String value) {
            addCriterion("ClassNum <", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLessThanOrEqualTo(String value) {
            addCriterion("ClassNum <=", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumLike(String value) {
            addCriterion("ClassNum like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotLike(String value) {
            addCriterion("ClassNum not like", value, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumIn(List<String> values) {
            addCriterion("ClassNum in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotIn(List<String> values) {
            addCriterion("ClassNum not in", values, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumBetween(String value1, String value2) {
            addCriterion("ClassNum between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andClassnumNotBetween(String value1, String value2) {
            addCriterion("ClassNum not between", value1, value2, "classnum");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("StudentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("StudentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("StudentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("StudentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("StudentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("StudentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("StudentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("StudentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("StudentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("StudentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("StudentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("StudentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("StudentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("StudentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNull() {
            addCriterion("StudentSex is null");
            return (Criteria) this;
        }

        public Criteria andStudentsexIsNotNull() {
            addCriterion("StudentSex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsexEqualTo(String value) {
            addCriterion("StudentSex =", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotEqualTo(String value) {
            addCriterion("StudentSex <>", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThan(String value) {
            addCriterion("StudentSex >", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexGreaterThanOrEqualTo(String value) {
            addCriterion("StudentSex >=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThan(String value) {
            addCriterion("StudentSex <", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLessThanOrEqualTo(String value) {
            addCriterion("StudentSex <=", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexLike(String value) {
            addCriterion("StudentSex like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotLike(String value) {
            addCriterion("StudentSex not like", value, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexIn(List<String> values) {
            addCriterion("StudentSex in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotIn(List<String> values) {
            addCriterion("StudentSex not in", values, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexBetween(String value1, String value2) {
            addCriterion("StudentSex between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentsexNotBetween(String value1, String value2) {
            addCriterion("StudentSex not between", value1, value2, "studentsex");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayIsNull() {
            addCriterion("StudentBirthday is null");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayIsNotNull() {
            addCriterion("StudentBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayEqualTo(Date value) {
            addCriterion("StudentBirthday =", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayNotEqualTo(Date value) {
            addCriterion("StudentBirthday <>", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayGreaterThan(Date value) {
            addCriterion("StudentBirthday >", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("StudentBirthday >=", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayLessThan(Date value) {
            addCriterion("StudentBirthday <", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayLessThanOrEqualTo(Date value) {
            addCriterion("StudentBirthday <=", value, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayIn(List<Date> values) {
            addCriterion("StudentBirthday in", values, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayNotIn(List<Date> values) {
            addCriterion("StudentBirthday not in", values, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayBetween(Date value1, Date value2) {
            addCriterion("StudentBirthday between", value1, value2, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentbirthdayNotBetween(Date value1, Date value2) {
            addCriterion("StudentBirthday not between", value1, value2, "studentbirthday");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNull() {
            addCriterion("StudentPassword is null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNotNull() {
            addCriterion("StudentPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordEqualTo(String value) {
            addCriterion("StudentPassword =", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotEqualTo(String value) {
            addCriterion("StudentPassword <>", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThan(String value) {
            addCriterion("StudentPassword >", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("StudentPassword >=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThan(String value) {
            addCriterion("StudentPassword <", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThanOrEqualTo(String value) {
            addCriterion("StudentPassword <=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLike(String value) {
            addCriterion("StudentPassword like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotLike(String value) {
            addCriterion("StudentPassword not like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIn(List<String> values) {
            addCriterion("StudentPassword in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotIn(List<String> values) {
            addCriterion("StudentPassword not in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordBetween(String value1, String value2) {
            addCriterion("StudentPassword between", value1, value2, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotBetween(String value1, String value2) {
            addCriterion("StudentPassword not between", value1, value2, "studentpassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private TbStudentExample example;

        protected Criteria() {
            super();
        }

        public TbStudentExample example() {
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