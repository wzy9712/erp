package com.wzy.domain;

public class User {
    private Integer count;
    private String password;

    public User() {
    }

    public User(Integer count, String password) {
        this.count = count;
        this.password = password;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "count=" + count +
                ", password='" + password + '\'' +
                '}';
    }
}
