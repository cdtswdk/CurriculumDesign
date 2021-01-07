package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("tb_stucourse")
public class TbStucourse implements Serializable {
    private Integer id;

    private String studentnum;

    private String coursenum;

    private String teachernum;

    private Short grade;

    private Float gradepoint;

    private Integer coursestatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbStucourse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public TbStucourse setStudentnum(String studentnum) {
        this.studentnum = studentnum;
        return this;
    }

    public String getCoursenum() {
        return coursenum;
    }

    public TbStucourse setCoursenum(String coursenum) {
        this.coursenum = coursenum;
        return this;
    }

    public String getTeachernum() {
        return teachernum;
    }

    public TbStucourse setTeachernum(String teachernum) {
        this.teachernum = teachernum;
        return this;
    }

    public Short getGrade() {
        return grade;
    }

    public TbStucourse setGrade(Short grade) {
        this.grade = grade;
        return this;
    }

    public Float getGradepoint() {
        return gradepoint;
    }

    public TbStucourse setGradepoint(Float gradepoint) {
        this.gradepoint = gradepoint;
        return this;
    }

    public Integer getCoursestatus() {
        return coursestatus;
    }

    public TbStucourse setCoursestatus(Integer coursestatus) {
        this.coursestatus = coursestatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentnum=").append(studentnum);
        sb.append(", coursenum=").append(coursenum);
        sb.append(", teachernum=").append(teachernum);
        sb.append(", grade=").append(grade);
        sb.append(", gradepoint=").append(gradepoint);
        sb.append(", coursestatus=").append(coursestatus);
        sb.append("]");
        return sb.toString();
    }
}