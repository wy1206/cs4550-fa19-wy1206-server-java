package com.example.myapp.controllers;

import com.example.myapp.WidgetService;
import com.example.myapp.model.Widget;

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
public class WidgetController {
  WidgetService service = new WidgetService();
  List<Widget> widgets = service.findAllWidgets();

  @PostMapping("/api/widgets")
  public List<Widget> createWidget(
          @RequestBody Widget widget
  ){
    return service.createWidget(widget);
  }

  @DeleteMapping("/api/widgets/{widgetId}")
  public List<Widget> deleteWidget(
          @PathVariable("widgetId") Integer id
  ){
    return service.deleteWidget(id);
  }

  @PutMapping("/api/widgets/{widgetId}")
  public List<Widget> updateWidget(
          @PathVariable("widgetId") Integer Id,
          @RequestBody Widget widget
  ) {
    return service.updateWidget(Id, widget);
  }

  @GetMapping("/api/widgets")
  public List<Widget> findAllWidgets() {
    return service.findAllWidgets();
  }

  @GetMapping("/api/widgets")
  public Widget findWidgetByID(
          @PathVariable("widgetId") Integer Id
  ) {
    return service.findWidgetById(Id);
  }
}