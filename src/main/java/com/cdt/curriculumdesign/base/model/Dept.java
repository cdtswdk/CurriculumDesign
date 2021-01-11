package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("dept")
public class Dept implements Serializable {
    private Long deptid;

    private String deptname;

    private String deptchairman;

    private String depttel;

    private String deptdesc;

    private static final long serialVersionUID = 1L;

    public Long getDeptid() {
        return deptid;
    }

    public Dept setDeptid(Long deptid) {
        this.deptid = deptid;
        return this;
    }

    public String getDeptname() {
        return deptname;
    }

    public Dept setDeptname(String deptname) {
        this.deptname = deptname;
        return this;
    }

    public String getDeptchairman() {
        return deptchairman;
    }

    public Dept setDeptchairman(String deptchairman) {
        this.deptchairman = deptchairman;
        return this;
    }

    public String getDepttel() {
        return depttel;
    }

    public Dept setDepttel(String depttel) {
        this.depttel = depttel;
        return this;
    }

    public String getDeptdesc() {
        return deptdesc;
    }

    public Dept setDeptdesc(String deptdesc) {
        this.deptdesc = deptdesc;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptid=").append(deptid);
        sb.append(", deptname=").append(deptname);
        sb.append(", deptchairman=").append(deptchairman);
        sb.append(", depttel=").append(depttel);
        sb.append(", deptdesc=").append(deptdesc);
        sb.append("]");
        return sb.toString();
    }
}