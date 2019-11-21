package com.example.myapp.controllers;

import com.example.myapp.CourseService;
import com.example.myapp.model.Course;
import com.example.myapp.repositories.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://arcane-taiga-78224.herokuapp.com", allowCredentials = "true",
        allowedHeaders = "*")
@RestController
public class CourseController {

//  @Autowired
//  CourseRepository repository;

  CourseService service = new CourseService();
  List<Course> courses = service.findAllCourses();

  @PostMapping("/api/courses")
  public List<Course> createCourse(
          @RequestBody Course course
  ){
    return service.createCourse(course);
  }

  @DeleteMapping("/api/courses/{cid}")
  public List<Course> deleteCourse(
          @PathVariable("cid") Integer cid){
    return service.deleteCourse(cid);
  }

  @PutMapping("/api/courses/{cid}")
  public List<Course> updateCourses(
          @PathVariable("cid") Integer cid,
          @RequestBody Course course){
    return service.updateCourses(cid, course);
  }

  @GetMapping("/api/courses")
  public List<Course> findAllCourses() {
    return service.findAllCourses();
  }

  @GetMapping("/api/courses/{cid}")
  public Course findCourseById(
          @PathVariable("cid") Integer cid) {
    for (Course c : courses) {
      if (c.getId() == cid) {
        return c;
      }
    }
    return null;
  }

}