package com.greenfoxacademy.hire_meweb_app.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "partner")
public class Partner extends User {

  private String note;

  public Partner(String note) {
    this.note = note;
  }

  public Partner(String name, String note) {
    super(name);
    this.note = note;
  }

  public Partner(String name, String email, String note) {
    super(name, email);
    this.note = note;
  }

}
