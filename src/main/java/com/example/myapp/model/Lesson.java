package com.example.myapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lesson {

  @Id
  private int id;
  private String title;
  private List<Topic> topics;

  public Lesson(int id, String title, List<Topic> topics) {
    this.id = id;
    this.title = title;
    this.topics = topics;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public List<Topic> getTopics() {
    return topics;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setTopics(List<Topic> topics) {
    this.topics = topics;
  }
}

