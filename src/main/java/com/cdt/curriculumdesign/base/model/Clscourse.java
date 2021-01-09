package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("clscourse")
public class Clscourse implements Serializable {
    private Long clscourseid;

    private Long courseid;

    private Long classid;

    private Long teacherid;

    private String coursename;

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

    private static final long serialVersionUID = 1L;

    public Long getClscourseid() {
        return clscourseid;
    }

    public Clscourse setClscourseid(Long clscourseid) {
        this.clscourseid = clscourseid;
        return this;
    }

    public Long getCourseid() {
        return courseid;
    }

    public Clscourse setCourseid(Long courseid) {
        this.courseid = courseid;
        return this;
    }

    public Long getClassid() {
        return classid;
    }

    public Clscourse setClassid(Long classid) {
        this.classid = classid;
        return this;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public Clscourse setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
        return this;
    }

    public String getCoursename() {
        return coursename;
    }

    public Clscourse setCoursename(String coursename) {
        this.coursename = coursename;
        return this;
    }

    public Date getCoursestarttime() {
        return coursestarttime;
    }

    public Clscourse setCoursestarttime(Date coursestarttime) {
        this.coursestarttime = coursestarttime;
        return this;
    }

    public Date getCourseendtime() {
        return courseendtime;
    }

    public Clscourse setCourseendtime(Date courseendtime) {
        this.courseendtime = courseendtime;
        return this;
    }

    public Integer getCoursestartweek() {
        return coursestartweek;
    }

    public Clscourse setCoursestartweek(Integer coursestartweek) {
        this.coursestartweek = coursestartweek;
        return this;
    }

    public Integer getCourseendweek() {
        return courseendweek;
    }

    public Clscourse setCourseendweek(Integer courseendweek) {
        this.courseendweek = courseendweek;
        return this;
    }

    public String getCourseweek() {
        return courseweek;
    }

    public Clscourse setCourseweek(String courseweek) {
        this.courseweek = courseweek;
        return this;
    }

    public String getCoursedaynum() {
        return coursedaynum;
    }

    public Clscourse setCoursedaynum(String coursedaynum) {
        this.coursedaynum = coursedaynum;
        return this;
    }

    public String getCoursestatus() {
        return coursestatus;
    }

    public Clscourse setCoursestatus(String coursestatus) {
        this.coursestatus = coursestatus;
        return this;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public Clscourse setCoursetype(String coursetype) {
        this.coursetype = coursetype;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clscourseid=").append(clscourseid);
        sb.append(", courseid=").append(courseid);
        sb.append(", classid=").append(classid);
        sb.append(", teacherid=").append(teacherid);
        sb.append(", coursename=").append(coursename);
        sb.append(", coursestarttime=").append(coursestarttime);
        sb.append(", courseendtime=").append(courseendtime);
        sb.append(", coursestartweek=").append(coursestartweek);
        sb.append(", courseendweek=").append(courseendweek);
        sb.append(", courseweek=").append(courseweek);
        sb.append(", coursedaynum=").append(coursedaynum);
        sb.append(", coursestatus=").append(coursestatus);
        sb.append(", coursetype=").append(coursetype);
        sb.append("]");
        return sb.toString();
    }
}