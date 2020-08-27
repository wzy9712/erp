package com.wzy.domain;

import java.util.Date;

public class Input {
    private Integer uid;
    private String name;
    private Integer nums;
    private Date date;

    public Input() {

    }
    public Input(Integer uid, String name, Integer nums, Date date) {
        this.uid = uid;
        this.name = name;
        this.nums = nums;
        this.date = date;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "input{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", nums=" + nums +
                ", date=" + date +
                '}';
    }
}
