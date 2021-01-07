package com.cdt.curriculumdesign.base.model;

import java.io.Serializable;

public class Login implements Serializable {
    private String username;
    private String password;
    private Integer userType;
    private static final long serialVersionUID = 1L;

    public Login() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType=" + userType +
                '}';
    }
}
