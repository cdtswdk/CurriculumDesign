package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("tb_teacher")
public class TbTeacher implements Serializable {
    private String teachernum;

    private String deptnum;

    private String majornum;

    private String teachername;

    private String teachersex;

    private Date teacherbirthday;

    private String teachertitle;

    private String teacherpassword;

    private static final long serialVersionUID = 1L;

    public String getTeacherpassword() {
        return teacherpassword;
    }

    public void setTeacherpassword(String teacherpassword) {
        this.teacherpassword = teacherpassword;
    }

    public String getTeachernum() {
        return teachernum;
    }

    public TbTeacher setTeachernum(String teachernum) {
        this.teachernum = teachernum;
        return this;
    }

    public String getDeptnum() {
        return deptnum;
    }

    public TbTeacher setDeptnum(String deptnum) {
        this.deptnum = deptnum;
        return this;
    }

    public String getMajornum() {
        return majornum;
    }

    public TbTeacher setMajornum(String majornum) {
        this.majornum = majornum;
        return this;
    }

    public String getTeachername() {
        return teachername;
    }

    public TbTeacher setTeachername(String teachername) {
        this.teachername = teachername;
        return this;
    }

    public String getTeachersex() {
        return teachersex;
    }

    public TbTeacher setTeachersex(String teachersex) {
        this.teachersex = teachersex;
        return this;
    }

    public Date getTeacherbirthday() {
        return teacherbirthday;
    }

    public TbTeacher setTeacherbirthday(Date teacherbirthday) {
        this.teacherbirthday = teacherbirthday;
        return this;
    }

    public String getTeachertitle() {
        return teachertitle;
    }

    public TbTeacher setTeachertitle(String teachertitle) {
        this.teachertitle = teachertitle;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teachernum=").append(teachernum);
        sb.append(", deptnum=").append(deptnum);
        sb.append(", majornum=").append(majornum);
        sb.append(", teachername=").append(teachername);
        sb.append(", teachersex=").append(teachersex);
        sb.append(", teacherbirthday=").append(teacherbirthday);
        sb.append(", teachertitle=").append(teachertitle);
        sb.append("]");
        return sb.toString();
    }
}