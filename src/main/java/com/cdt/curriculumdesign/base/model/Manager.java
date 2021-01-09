package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("manager")
public class Manager implements Serializable {
    private Long managerid;

    private Long managerdeptid;

    private Long managermajorid;

    private String managername;

    private String managersex;

    private Date managerbirthdy;

    private String managerpassword;

    private static final long serialVersionUID = 1L;

    public Long getManagerid() {
        return managerid;
    }

    public Manager setManagerid(Long managerid) {
        this.managerid = managerid;
        return this;
    }

    public Long getManagerdeptid() {
        return managerdeptid;
    }

    public Manager setManagerdeptid(Long managerdeptid) {
        this.managerdeptid = managerdeptid;
        return this;
    }

    public Long getManagermajorid() {
        return managermajorid;
    }

    public Manager setManagermajorid(Long managermajorid) {
        this.managermajorid = managermajorid;
        return this;
    }

    public String getManagername() {
        return managername;
    }

    public Manager setManagername(String managername) {
        this.managername = managername;
        return this;
    }

    public String getManagersex() {
        return managersex;
    }

    public Manager setManagersex(String managersex) {
        this.managersex = managersex;
        return this;
    }

    public Date getManagerbirthdy() {
        return managerbirthdy;
    }

    public Manager setManagerbirthdy(Date managerbirthdy) {
        this.managerbirthdy = managerbirthdy;
        return this;
    }

    public String getManagerpassword() {
        return managerpassword;
    }

    public Manager setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", managerid=").append(managerid);
        sb.append(", managerdeptid=").append(managerdeptid);
        sb.append(", managermajorid=").append(managermajorid);
        sb.append(", managername=").append(managername);
        sb.append(", managersex=").append(managersex);
        sb.append(", managerbirthdy=").append(managerbirthdy);
        sb.append(", managerpassword=").append(managerpassword);
        sb.append("]");
        return sb.toString();
    }
}