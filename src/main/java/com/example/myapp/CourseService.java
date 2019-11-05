package com.example.myapp;

import com.example.myapp.model.Course;
import com.example.myapp.model.Lesson;
import com.example.myapp.model.Module;
import com.example.myapp.model.Topic;
import com.example.myapp.model.Widget;
import com.example.myapp.model.type;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
  List<Course> courses = new ArrayList<>();

  public CourseService() {
    WidgetService ws = new WidgetService();

    List<Widget> widgets = ws.findAllWidgets();
  }

  public List<Course> findAllCourses() {
    return courses;
  }

  public List<Course> createCourse(Course course){
    courses.add(course);
    return courses;
  }

  public List<Course> deleteCourse(int cid){
    int index = -1;

    for (int i = 0; i < courses.size(); i++) {
      if (courses.get(i).getId() == cid) {
        index = i;
      }
    }
    courses.remove(index);
    return courses;
  }

  public List<Course> updateCourses(int cid, Course course){
    for (int i = 0; i < courses.size(); i++) {
      if (courses.get(i).getId() == cid) {
        courses.set(i, course);
      }
    }
    return courses;
  }

  public Course findCourseById(int cid) {
    for (Course c : courses) {
      if (c.getId() == cid) {
        return c;
      }
    }
    return null;
  }
}