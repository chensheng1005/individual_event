package com.cs.entity;

public class Admin {
    private Integer adminId;

    private String adminAccountNumber;

    private String adminNickname;

    private String adminPassword;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccountNumber() {
        return adminAccountNumber;
    }

    public void setAdminAccountNumber(String adminAccountNumber) {
        this.adminAccountNumber = adminAccountNumber == null ? null : adminAccountNumber.trim();
    }

    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname == null ? null : adminNickname.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }
}