package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("tb_class")
public class TbClass implements Serializable {
    private Long classid;

    private String classname;

    /**
     * 班级学生人数
     */
    private Integer classstunum;

    private Long deptid;

    private String deptname;

    private Long majorid;

    private String majorname;

    private Long headteacher;

    private String teachername;

    private static final long serialVersionUID = 1L;

    public Long getClassid() {
        return classid;
    }

    public TbClass setClassid(Long classid) {
        this.classid = classid;
        return this;
    }

    public String getClassname() {
        return classname;
    }

    public TbClass setClassname(String classname) {
        this.classname = classname;
        return this;
    }

    public Integer getClassstunum() {
        return classstunum;
    }

    public TbClass setClassstunum(Integer classstunum) {
        this.classstunum = classstunum;
        return this;
    }

    public Long getDeptid() {
        return deptid;
    }

    public TbClass setDeptid(Long deptid) {
        this.deptid = deptid;
        return this;
    }

    public String getDeptname() {
        return deptname;
    }

    public TbClass setDeptname(String deptname) {
        this.deptname = deptname;
        return this;
    }

    public Long getMajorid() {
        return majorid;
    }

    public TbClass setMajorid(Long majorid) {
        this.majorid = majorid;
        return this;
    }

    public String getMajorname() {
        return majorname;
    }

    public TbClass setMajorname(String majorname) {
        this.majorname = majorname;
        return this;
    }

    public Long getHeadteacher() {
        return headteacher;
    }

    public TbClass setHeadteacher(Long headteacher) {
        this.headteacher = headteacher;
        return this;
    }

    public String getTeachername() {
        return teachername;
    }

    public TbClass setTeachername(String teachername) {
        this.teachername = teachername;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classid=").append(classid);
        sb.append(", classname=").append(classname);
        sb.append(", classstunum=").append(classstunum);
        sb.append(", deptid=").append(deptid);
        sb.append(", deptname=").append(deptname);
        sb.append(", majorid=").append(majorid);
        sb.append(", majorname=").append(majorname);
        sb.append(", headteacher=").append(headteacher);
        sb.append(", teachername=").append(teachername);
        sb.append("]");
        return sb.toString();
    }
}