package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("tb_student")
public class TbStudent implements Serializable {
    private String studentnum;

    private String deptnum;

    private String majornum;

    private String classnum;

    private String studentname;

    private String studentsex;

    private Date studentbirthday;

    private String studentpassword;

    private static final long serialVersionUID = 1L;

    public String getStudentnum() {
        return studentnum;
    }

    public TbStudent setStudentnum(String studentnum) {
        this.studentnum = studentnum;
        return this;
    }

    public String getDeptnum() {
        return deptnum;
    }

    public TbStudent setDeptnum(String deptnum) {
        this.deptnum = deptnum;
        return this;
    }

    public String getMajornum() {
        return majornum;
    }

    public TbStudent setMajornum(String majornum) {
        this.majornum = majornum;
        return this;
    }

    public String getClassnum() {
        return classnum;
    }

    public TbStudent setClassnum(String classnum) {
        this.classnum = classnum;
        return this;
    }

    public String getStudentname() {
        return studentname;
    }

    public TbStudent setStudentname(String studentname) {
        this.studentname = studentname;
        return this;
    }

    public String getStudentsex() {
        return studentsex;
    }

    public TbStudent setStudentsex(String studentsex) {
        this.studentsex = studentsex;
        return this;
    }

    public Date getStudentbirthday() {
        return studentbirthday;
    }

    public TbStudent setStudentbirthday(Date studentbirthday) {
        this.studentbirthday = studentbirthday;
        return this;
    }

    public String getStudentpassword() {
        return studentpassword;
    }

    public TbStudent setStudentpassword(String studentpassword) {
        this.studentpassword = studentpassword;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentnum=").append(studentnum);
        sb.append(", deptnum=").append(deptnum);
        sb.append(", majornum=").append(majornum);
        sb.append(", classnum=").append(classnum);
        sb.append(", studentname=").append(studentname);
        sb.append(", studentsex=").append(studentsex);
        sb.append(", studentbirthday=").append(studentbirthday);
        sb.append(", studentpassword=").append(studentpassword);
        sb.append("]");
        return sb.toString();
    }
}