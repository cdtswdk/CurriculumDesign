package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("course")
public class Course implements Serializable {
    private Long courseid;

    private Long teacherid;

    private String coursename;

    private Float coursecredit;

    private Short coursehours;

    /**
     * 课程创建时间
     */
    private Date coursecreatetime;

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
     * 课程在星期几
     */
    private String courseweek;

    /**
     * 课程在第几节
     */
    private String coursedaynum;

    /**
     * 课程状态（0:未结课 1:已结课）只有状态为结课的课程才有成绩和绩点
     */
    private String coursestatus;

    /**
     * 课程类型（0:选修课 1:必修课）
     */
    private String coursetype;

    private String coursedesc;

    private static final long serialVersionUID = 1L;

    public Long getCourseid() {
        return courseid;
    }

    public Course setCourseid(Long courseid) {
        this.courseid = courseid;
        return this;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public Course setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
        return this;
    }

    public String getCoursename() {
        return coursename;
    }

    public Course setCoursename(String coursename) {
        this.coursename = coursename;
        return this;
    }

    public Float getCoursecredit() {
        return coursecredit;
    }

    public Course setCoursecredit(Float coursecredit) {
        this.coursecredit = coursecredit;
        return this;
    }

    public Short getCoursehours() {
        return coursehours;
    }

    public Course setCoursehours(Short coursehours) {
        this.coursehours = coursehours;
        return this;
    }

    public Date getCoursecreatetime() {
        return coursecreatetime;
    }

    public Course setCoursecreatetime(Date coursecreatetime) {
        this.coursecreatetime = coursecreatetime;
        return this;
    }

    public Date getCoursestarttime() {
        return coursestarttime;
    }

    public Course setCoursestarttime(Date coursestarttime) {
        this.coursestarttime = coursestarttime;
        return this;
    }

    public Date getCourseendtime() {
        return courseendtime;
    }

    public Course setCourseendtime(Date courseendtime) {
        this.courseendtime = courseendtime;
        return this;
    }

    public Integer getCoursestartweek() {
        return coursestartweek;
    }

    public Course setCoursestartweek(Integer coursestartweek) {
        this.coursestartweek = coursestartweek;
        return this;
    }

    public Integer getCourseendweek() {
        return courseendweek;
    }

    public Course setCourseendweek(Integer courseendweek) {
        this.courseendweek = courseendweek;
        return this;
    }

    public String getCourseweek() {
        return courseweek;
    }

    public Course setCourseweek(String courseweek) {
        this.courseweek = courseweek;
        return this;
    }

    public String getCoursedaynum() {
        return coursedaynum;
    }

    public Course setCoursedaynum(String coursedaynum) {
        this.coursedaynum = coursedaynum;
        return this;
    }

    public String getCoursestatus() {
        return coursestatus;
    }

    public Course setCoursestatus(String coursestatus) {
        this.coursestatus = coursestatus;
        return this;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public Course setCoursetype(String coursetype) {
        this.coursetype = coursetype;
        return this;
    }

    public String getCoursedesc() {
        return coursedesc;
    }

    public Course setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", courseid=").append(courseid);
        sb.append(", teacherid=").append(teacherid);
        sb.append(", coursename=").append(coursename);
        sb.append(", coursecredit=").append(coursecredit);
        sb.append(", coursehours=").append(coursehours);
        sb.append(", coursecreatetime=").append(coursecreatetime);
        sb.append(", coursestarttime=").append(coursestarttime);
        sb.append(", courseendtime=").append(courseendtime);
        sb.append(", coursestartweek=").append(coursestartweek);
        sb.append(", courseendweek=").append(courseendweek);
        sb.append(", courseweek=").append(courseweek);
        sb.append(", coursedaynum=").append(coursedaynum);
        sb.append(", coursestatus=").append(coursestatus);
        sb.append(", coursetype=").append(coursetype);
        sb.append(", coursedesc=").append(coursedesc);
        sb.append("]");
        return sb.toString();
    }
}