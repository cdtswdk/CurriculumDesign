package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("student")
public class Student implements Serializable {
    private Long studentid;

    private Long deptid;

    private Long majorid;

    private Long classid;

    private String studentname;

    private String studentsex;

    private Date studentbirthday;

    private String studentpassword;

    private static final long serialVersionUID = 1L;

    public Long getStudentid() {
        return studentid;
    }

    public Student setStudentid(Long studentid) {
        this.studentid = studentid;
        return this;
    }

    public Long getDeptid() {
        return deptid;
    }

    public Student setDeptid(Long deptid) {
        this.deptid = deptid;
        return this;
    }

    public Long getMajorid() {
        return majorid;
    }

    public Student setMajorid(Long majorid) {
        this.majorid = majorid;
        return this;
    }

    public Long getClassid() {
        return classid;
    }

    public Student setClassid(Long classid) {
        this.classid = classid;
        return this;
    }

    public String getStudentname() {
        return studentname;
    }

    public Student setStudentname(String studentname) {
        this.studentname = studentname;
        return this;
    }

    public String getStudentsex() {
        return studentsex;
    }

    public Student setStudentsex(String studentsex) {
        this.studentsex = studentsex;
        return this;
    }

    public Date getStudentbirthday() {
        return studentbirthday;
    }

    public Student setStudentbirthday(Date studentbirthday) {
        this.studentbirthday = studentbirthday;
        return this;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public Student setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentid=").append(studentid);
        sb.append(", deptid=").append(deptid);
        sb.append(", majorid=").append(majorid);
        sb.append(", classid=").append(classid);
        sb.append(", studentname=").append(studentname);
        sb.append(", studentsex=").append(studentsex);
        sb.append(", studentbirthday=").append(studentbirthday);
        sb.append(", studentpassword=").append(studentpassword);
        sb.append("]");
        return sb.toString();
    }
}