package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

@Generated("tb_manager")
public class TbManager implements Serializable {
    private String managernum;

    private String managername;

    private String managersex;

    private Date managerbirthdate;

    private Integer managerrights;

    private String managerpassword;

    private static final long serialVersionUID = 1L;

    public String getManagerpassword() {
        return managerpassword;
    }

    public void setManagerpassword(String managerpassword) {
        this.managerpassword = managerpassword;
    }

    public String getManagernum() {
        return managernum;
    }

    public TbManager setManagernum(String managernum) {
        this.managernum = managernum;
        return this;
    }

    public String getManagername() {
        return managername;
    }

    public TbManager setManagername(String managername) {
        this.managername = managername;
        return this;
    }

    public String getManagersex() {
        return managersex;
    }

    public TbManager setManagersex(String managersex) {
        this.managersex = managersex;
        return this;
    }

    public Date getManagerbirthdate() {
        return managerbirthdate;
    }

    public TbManager setManagerbirthdate(Date managerbirthdate) {
        this.managerbirthdate = managerbirthdate;
        return this;
    }

    public Integer getManagerrights() {
        return managerrights;
    }

    public TbManager setManagerrights(Integer managerrights) {
        this.managerrights = managerrights;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", managernum=").append(managernum);
        sb.append(", managername=").append(managername);
        sb.append(", managersex=").append(managersex);
        sb.append(", managerbirthdate=").append(managerbirthdate);
        sb.append(", managerrights=").append(managerrights);
        sb.append("]");
        return sb.toString();
    }
}