package com.greenfoxacademy.hire_meweb_app.models;

import java.util.List;

public class Company extends User {

    private List<Student> savedStudents;

    public Company() {
    }

    public Company(List<Student> savedStudents) {
        this.savedStudents = savedStudents;
    }

    public List<Student> getSavedStudents() {
        return savedStudents;
    }

    public void setSavedStudents(List<Student> savedStudents) {
        this.savedStudents = savedStudents;
    }
}
