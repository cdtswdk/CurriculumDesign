package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("loginuser")
public class Loginuser implements Serializable {
    private Integer id;

    private Long username;

    private String password;

    private String usertype;

    private static final long serialVersionUID = 1L;

    public Loginuser() {
    }

    public Loginuser(Long username, String password) {
        this.username = username;
        this.password = password;
    }

    public Loginuser(Long username, String password, String usertype) {
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }

    public Integer getId() {
        return id;
    }

    public Loginuser setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getUsername() {
        return username;
    }

    public Loginuser setUsername(Long username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Loginuser setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUsertype() {
        return usertype;
    }

    public Loginuser setUsertype(String usertype) {
        this.usertype = usertype;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", usertype=").append(usertype);
        sb.append("]");
        return sb.toString();
    }
}