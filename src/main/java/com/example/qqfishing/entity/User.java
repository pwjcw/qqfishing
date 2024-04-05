package com.example.qqfishing.entity;

public class User {
    private int id;
    private String account;
    private String passwd;
    private String ip;
    private String time;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User(int id, String account, String passwd, String ip, String time) {
        this.id = id;
        this.account = account;
        this.passwd = passwd;
        this.ip = ip;
        this.time = time;
    }
}
