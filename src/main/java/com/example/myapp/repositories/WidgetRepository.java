package com.example.myapp.repositories;

import com.example.myapp.model.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WidgetRepository
        extends CrudRepository<Widget, Integer> {

  @Query("select widget from Widget widget")
  public List<Widget> findAllWidgets();

  @Query("select widget from Widget widget where widget.id=:wid")
  public Widget findWidgetById(@Param("wid") Integer id);
}