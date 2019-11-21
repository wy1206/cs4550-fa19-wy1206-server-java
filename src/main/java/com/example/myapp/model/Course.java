package com.example.myapp.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
  @Id
  private int id;
  private String title;
  private List<Module> modules;

  public Course(int id, String title, List<Module> modules) {
    this.id = id;
    this.title = title;
    this.modules = modules;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public List<Module> getModules() {
    return modules;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setModules(List<Module> modules) {
    this.modules = modules;
  }
}
