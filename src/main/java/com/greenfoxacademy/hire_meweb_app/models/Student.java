package com.greenfoxacademy.hire_meweb_app.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student extends User {

  @Column(name = "first_name", nullable = false)
  private String firstName;
  @Column(name = "last_name", nullable = false)
  private String lastName;
  @Column(nullable = false)
  private String cohort;
  @Column(name = "cohort_class", nullable = false)
  private String cohortClass;
  @Column(name = "project_team")
  private String projectTeam;
  @Column(nullable = false)
  private String summary;

  public Student(String email) {
    super(email);
  }
  
}
