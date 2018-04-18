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
@Table(name = "partner")
public class Partner extends User {

  @Column(name = "company_name", nullable = false)
  private String companyName;

  public Partner(String companyName) {
    this.companyName = companyName;
  }

  public Partner(String email,  String companyName) {
    super(email);
    this.companyName = companyName;
  }

}
