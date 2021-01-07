package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("user")
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private static final long serialVersionUID = 1L;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRealname() {
        return realname;
    }

    public User setRealname(String realname) {
        this.realname = realname;
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
        sb.append(", realname=").append(realname);
        sb.append("]");
        return sb.toString();
    }
}