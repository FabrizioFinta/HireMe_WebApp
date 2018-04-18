package com.greenfoxacademy.hire_meweb_app.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

  @Id
  protected String id;
  @Column(nullable = false)
  protected String name;
  @Column(nullable = false)
  protected String email;

  public User() {
    this.id = UUID.randomUUID().toString();
  }

  public User(String name) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
  }

  public User(String name, String email) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.email = email;
  }

}
