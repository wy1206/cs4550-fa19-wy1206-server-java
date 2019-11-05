package com.example.myapp.model;

public class Widget {

  private int id;
  private String name;

  private type WidgetType;
  private int order;
  private String text;
  private String src;
  private int size;
  private int width, height;

  public Widget(int id, String name, type widgetType, int order, String text) {
    this.id = id;
    this.name = name;
    WidgetType = widgetType;
    this.order = order;
    this.text = text;
  }

  public Widget(int id, String name, type widgetType, int order, String text, String src, int size,
                int width, int height) {
    this.id = id;
    this.name = name;
    WidgetType = widgetType;
    this.order = order;
    this.text = text;
    this.src = src;
    this.size = size;
    this.width = width;
    this.height = height;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public type getWidgetType() {
    return WidgetType;
  }

  public int getOrder() {
    return order;
  }

  public String getText() {
    return text;
  }

  public String getSrc() {
    return src;
  }

  public int getSize() {
    return size;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWidgetType(type widgetType) {
    WidgetType = widgetType;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}