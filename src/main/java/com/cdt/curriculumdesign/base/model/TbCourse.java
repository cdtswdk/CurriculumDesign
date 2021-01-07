package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("tb_course")
public class TbCourse implements Serializable {
    private String coursenum;

    private String coursename;

    private String teachernum;

    private Float coursecredit;

    private Short courseclass;

    private Integer coursestarttime;

    private Integer courseendtime;

    private Integer coursedate;

    private Integer coursetype;

    private String coursedesc;

    private static final long serialVersionUID = 1L;

    public String getCoursenum() {
        return coursenum;
    }

    public TbCourse setCoursenum(String coursenum) {
        this.coursenum = coursenum;
        return this;
    }

    public String getCoursename() {
        return coursename;
    }

    public TbCourse setCoursename(String coursename) {
        this.coursename = coursename;
        return this;
    }

    public String getTeachernum() {
        return teachernum;
    }

    public TbCourse setTeachernum(String teachernum) {
        this.teachernum = teachernum;
        return this;
    }

    public Float getCoursecredit() {
        return coursecredit;
    }

    public TbCourse setCoursecredit(Float coursecredit) {
        this.coursecredit = coursecredit;
        return this;
    }

    public Short getCourseclass() {
        return courseclass;
    }

    public TbCourse setCourseclass(Short courseclass) {
        this.courseclass = courseclass;
        return this;
    }

    public Integer getCoursestarttime() {
        return coursestarttime;
    }

    public TbCourse setCoursestarttime(Integer coursestarttime) {
        this.coursestarttime = coursestarttime;
        return this;
    }

    public Integer getCourseendtime() {
        return courseendtime;
    }

    public TbCourse setCourseendtime(Integer courseendtime) {
        this.courseendtime = courseendtime;
        return this;
    }

    public Integer getCoursedate() {
        return coursedate;
    }

    public TbCourse setCoursedate(Integer coursedate) {
        this.coursedate = coursedate;
        return this;
    }

    public Integer getCoursetype() {
        return coursetype;
    }

    public TbCourse setCoursetype(Integer coursetype) {
        this.coursetype = coursetype;
        return this;
    }

    public String getCoursedesc() {
        return coursedesc;
    }

    public TbCourse setCoursedesc(String coursedesc) {
        this.coursedesc = coursedesc;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coursenum=").append(coursenum);
        sb.append(", coursename=").append(coursename);
        sb.append(", teachernum=").append(teachernum);
        sb.append(", coursecredit=").append(coursecredit);
        sb.append(", courseclass=").append(courseclass);
        sb.append(", coursestarttime=").append(coursestarttime);
        sb.append(", courseendtime=").append(courseendtime);
        sb.append(", coursedate=").append(coursedate);
        sb.append(", coursetype=").append(coursetype);
        sb.append(", coursedesc=").append(coursedesc);
        sb.append("]");
        return sb.toString();
    }
}