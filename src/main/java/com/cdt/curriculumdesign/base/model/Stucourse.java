package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("stucourse")
public class Stucourse implements Serializable {
    private Long stucourseid;

    private Long studentid;

    private Long courseid;

    private Long teacherid;

    private String coursename;

    private Integer grade;

    /**
     * 绩点
     */
    private Float gradepoint;

    /**
     * 课程开始时间
     */
    private Date coursestarttime;

    /**
     * 课程结束时间
     */
    private Date courseendtime;

    /**
     * 课程开始周数
     */
    private Integer coursestartweek;

    /**
     * 课程结束周数
     */
    private Integer courseendweek;

    /**
     * 课程状态（0:未结课 1:已结课）只有状态为结课的课程才有成绩和绩点
     */
    private String coursestatus;

    /**
     * 课程类型（0:选修课 1:必修课）
     */
    private String coursetype;

    private static final long serialVersionUID = 1L;

    public Long getStucourseid() {
        return stucourseid;
    }

    public Stucourse setStucourseid(Long stucourseid) {
        this.stucourseid = stucourseid;
        return this;
    }

    public Long getStudentid() {
        return studentid;
    }

    public Stucourse setStudentid(Long studentid) {
        this.studentid = studentid;
        return this;
    }

    public Long getCourseid() {
        return courseid;
    }

    public Stucourse setCourseid(Long courseid) {
        this.courseid = courseid;
        return this;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public Stucourse setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
        return this;
    }

    public String getCoursename() {
        return coursename;
    }

    public Stucourse setCoursename(String coursename) {
        this.coursename = coursename;
        return this;
    }

    public Integer getGrade() {
        return grade;
    }

    public Stucourse setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }

    public Float getGradepoint() {
        return gradepoint;
    }

    public Stucourse setGradepoint(Float gradepoint) {
        this.gradepoint = gradepoint;
        return this;
    }

    public Date getCoursestarttime() {
        return coursestarttime;
    }

    public Stucourse setCoursestarttime(Date coursestarttime) {
        this.coursestarttime = coursestarttime;
        return this;
    }

    public Date getCourseendtime() {
        return courseendtime;
    }

    public Stucourse setCourseendtime(Date courseendtime) {
        this.courseendtime = courseendtime;
        return this;
    }

    public Integer getCoursestartweek() {
        return coursestartweek;
    }

    public Stucourse setCoursestartweek(Integer coursestartweek) {
        this.coursestartweek = coursestartweek;
        return this;
    }

    public Integer getCourseendweek() {
        return courseendweek;
    }

    public Stucourse setCourseendweek(Integer courseendweek) {
        this.courseendweek = courseendweek;
        return this;
    }

    public String getCoursestatus() {
        return coursestatus;
    }

    public Stucourse setCoursestatus(String coursestatus) {
        this.coursestatus = coursestatus;
        return this;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public Stucourse setCoursetype(String coursetype) {
        this.coursetype = coursetype;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stucourseid=").append(stucourseid);
        sb.append(", studentid=").append(studentid);
        sb.append(", courseid=").append(courseid);
        sb.append(", teacherid=").append(teacherid);
        sb.append(", coursename=").append(coursename);
        sb.append(", grade=").append(grade);
        sb.append(", gradepoint=").append(gradepoint);
        sb.append(", coursestarttime=").append(coursestarttime);
        sb.append(", courseendtime=").append(courseendtime);
        sb.append(", coursestartweek=").append(coursestartweek);
        sb.append(", courseendweek=").append(courseendweek);
        sb.append(", coursestatus=").append(coursestatus);
        sb.append(", coursetype=").append(coursetype);
        sb.append("]");
        return sb.toString();
    }
}