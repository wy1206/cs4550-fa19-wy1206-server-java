package com.example.myapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

  @Id
  private int id;
  private String title;
  private List<Widget> widgets;

  public Topic(int id, String title, List<Widget> widgets) {
    this.id = id;
    this.title = title;
    this.widgets = widgets;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public List<Widget> getWidgets() {
    return widgets;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setWidgets(List<Widget> widgets) {
    this.widgets = widgets;
  }
}

