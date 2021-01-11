package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("manager")
public class Manager implements Serializable {
    private Long managerid;

    private Long managerdeptid;

    private Long managermajorid;

    private String deptname;

    private String majorname;

    private String managername;

    private String managersex;

    private Date managerbirthday;

    private String managerpassword;

    /**
     * 管理员介绍
     */
    private String managerdesc;

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

    public String getDeptname() {
        return deptname;
    }

    public Manager setDeptname(String deptname) {
        this.deptname = deptname;
        return this;
    }

    public String getMajorname() {
        return majorname;
    }

    public Manager setMajorname(String majorname) {
        this.majorname = majorname;
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

    public Date getManagerbirthday() {
        return managerbirthday;
    }

    public Manager setManagerbirthday(Date managerbirthday) {
        this.managerbirthday = managerbirthday;
        return this;
    }

    public String getManagerpassword() {
        return managerpassword;
    }

    public Manager setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
        return this;
    }

    public String getManagerdesc() {
        return managerdesc;
    }

    public Manager setManagerdesc(String managerdesc) {
        this.managerdesc = managerdesc;
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
        sb.append(", deptname=").append(deptname);
        sb.append(", majorname=").append(majorname);
        sb.append(", managername=").append(managername);
        sb.append(", managersex=").append(managersex);
        sb.append(", managerbirthday=").append(managerbirthday);
        sb.append(", managerpassword=").append(managerpassword);
        sb.append(", managerdesc=").append(managerdesc);
        sb.append("]");
        return sb.toString();
    }
}