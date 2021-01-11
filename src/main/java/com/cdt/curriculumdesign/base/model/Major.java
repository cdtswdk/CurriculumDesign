package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("major")
public class Major implements Serializable {
    private Long majorid;

    private Long deptid;

    private String majorname;

    private String majorassistant;

    private String majortel;

    private static final long serialVersionUID = 1L;

    public Long getMajorid() {
        return majorid;
    }

    public Major setMajorid(Long majorid) {
        this.majorid = majorid;
        return this;
    }

    public Long getDeptid() {
        return deptid;
    }

    public Major setDeptid(Long deptid) {
        this.deptid = deptid;
        return this;
    }

    public String getMajorname() {
        return majorname;
    }

    public Major setMajorname(String majorname) {
        this.majorname = majorname;
        return this;
    }

    public String getMajorassistant() {
        return majorassistant;
    }

    public Major setMajorassistant(String majorassistant) {
        this.majorassistant = majorassistant;
        return this;
    }

    public String getMajortel() {
        return majortel;
    }

    public Major setMajortel(String majortel) {
        this.majortel = majortel;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", majorid=").append(majorid);
        sb.append(", deptid=").append(deptid);
        sb.append(", majorname=").append(majorname);
        sb.append(", majorassistant=").append(majorassistant);
        sb.append(", majortel=").append(majortel);
        sb.append("]");
        return sb.toString();
    }
}