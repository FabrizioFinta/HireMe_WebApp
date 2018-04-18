package com.greenfoxacademy.hire_meweb_app.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {

  @Id
  protected String id;
  @Column(nullable = false)
  protected String email;

  public User() {
    this.id = UUID.randomUUID().toString();
  }

  public User(String email) {
    this.id = UUID.randomUUID().toString();
    this.email = email;
  }

}
