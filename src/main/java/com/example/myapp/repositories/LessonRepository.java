package com.example.myapp.repositories;

import com.example.myapp.model.Lesson;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LessonRepository
        extends CrudRepository<Lesson, Integer> {
  @Query("select lesson from Lesson lesson where lesson.module.id = :mid")
  public List<Lesson> findAllLessonsForModule(
          @Param("mid") Integer moduleId
  );
}