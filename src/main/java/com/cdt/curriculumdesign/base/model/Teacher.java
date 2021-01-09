package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("teacher")
public class Teacher implements Serializable {
    private Long teacherid;

    private Long deptid;

    private Long majorid;

    private String teachername;

    private String teachersex;

    private Date teacherbirthday;

    private String teacherpassword;

    /**
     * 教师介绍
     */
    private String teacherdesc;

    private static final long serialVersionUID = 1L;

    public Long getTeacherid() {
        return teacherid;
    }

    public Teacher setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
        return this;
    }

    public Long getDeptid() {
        return deptid;
    }

    public Teacher setDeptid(Long deptid) {
        this.deptid = deptid;
        return this;
    }

    public Long getMajorid() {
        return majorid;
    }

    public Teacher setMajorid(Long majorid) {
        this.majorid = majorid;
        return this;
    }

    public String getTeachername() {
        return teachername;
    }

    public Teacher setTeachername(String teachername) {
        this.teachername = teachername;
        return this;
    }

    public String getTeachersex() {
        return teachersex;
    }

    public Teacher setTeachersex(String teachersex) {
        this.teachersex = teachersex;
        return this;
    }

    public Date getTeacherbirthday() {
        return teacherbirthday;
    }

    public Teacher setTeacherbirthday(Date teacherbirthday) {
        this.teacherbirthday = teacherbirthday;
        return this;
    }

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public Teacher setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword;
        return this;
    }

    public String getTeacherdesc() {
        return teacherdesc;
    }

    public Teacher setTeacherdesc(String teacherdesc) {
        this.teacherdesc = teacherdesc;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teacherid=").append(teacherid);
        sb.append(", deptid=").append(deptid);
        sb.append(", majorid=").append(majorid);
        sb.append(", teachername=").append(teachername);
        sb.append(", teachersex=").append(teachersex);
        sb.append(", teacherbirthday=").append(teacherbirthday);
        sb.append(", teacherpassword=").append(teacherpassword);
        sb.append(", teacherdesc=").append(teacherdesc);
        sb.append("]");
        return sb.toString();
    }
}