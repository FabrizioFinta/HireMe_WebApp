package com.greenfoxacademy.hire_meweb_app.models;

import javax.persistence.*;

@Entity
@Table(name="Students")
public class Student extends User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String summary;
    private String image;
    private boolean isSaved;

    public Student() {
    }

    public Student(String summary, String image, boolean isSaved) {
        this.summary = summary;
        this.image = image;
        this.isSaved = isSaved;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean saved) {
        this.isSaved = saved;
    }
}
