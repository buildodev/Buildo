package com.buildo.application.build.cpu;

public class Series {

    private String name;
    private String desc;

    public Series() {
    }

    public Series(String name, String desc) {

        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
