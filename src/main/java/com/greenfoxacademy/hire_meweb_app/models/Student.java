package com.greenfoxacademy.hire_meweb_app.models;

public class Student extends User {
    private String summary;
    private String picture;
    private boolean hello;

    public Student() {
    }

    public Student(String summary, String picture, boolean hello) {
        this.summary = summary;
        this.picture = picture;
        this.hello = hello;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public boolean isHello() {
        return hello;
    }

    public void setHello(boolean hello) {
        this.hello = hello;
    }
}
