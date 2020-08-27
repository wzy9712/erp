package com.wzy.domain;

import java.util.Date;

public class Goods {
    private Integer uid;
    private String name;
    private Integer begin;
    private Integer input;
    private Integer output;
    private Integer nums;
    private Date date;
    public Goods() {
    }

    public Goods(Integer uid, String name, Integer begin, Integer input, Integer output, Integer nums, Date date) {
        this.uid = uid;
        this.name = name;
        this.begin = begin;
        this.input = input;
        this.output = output;
        this.nums = nums;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getInput() {
        return input;
    }

    public void setInput(Integer input) {
        this.input = input;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
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

    @Override
    public String toString() {
        return "Goods{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", begin=" + begin +
                ", input=" + input +
                ", output=" + output +
                ", nums=" + nums +
                ", date=" + date +
                '}';
    }
}
