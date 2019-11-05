package com.example.myapp;
import com.example.myapp.model.*;
import java.util.ArrayList;
import java.util.List;

public class WidgetService{
  List<Widget> widgets = new ArrayList<>();

  public WidgetService() {
    Widget w1 = new Widget(123, "w1", type.LIST, 0, "Item 1\nItem 2\nItem 3"
    );

    Widget w2 = new Widget(234, "w2", type.HEADING, 1, "Hello from Redux"
    );

    Widget w3 = new Widget(345, "w3", type.PARAGRAPH, 2, "Hello from Redux paragraph"
    );

    Widget w4 = new Widget(456, "w4", type.IMAGE, 3, "Hello from Redux Image"
    );

    Widget w5 = new Widget(567, "w5", type.LINK, 4, "https://github.com/wy1206"
    );

    widgets.add(w1);
    widgets.add(w2);
    widgets.add(w3);
    widgets.add(w4);
    widgets.add(w5);
  }

  public List<Widget> findAllWidgets() {
    return widgets;
  }

  public List<Widget> createWidget(Widget widget) {
    widgets.add(widget);
    return widgets;
  }

  public List<Widget> deleteWidget(int Id) {
    int index = -1;
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId() == Id) {
        index = i;
      }
    }
    widgets.remove(index);
    return widgets;
  }

  public List<Widget> updateWidget(int Id, Widget widget) {
    for (int i = 0; i < widgets.size(); i++) {
      if (widgets.get(i).getId() == Id) {
        widgets.set(i, widget);
      }
    }
    return widgets;
  }

  public Widget findWidgetById(int Id) {
    for (Widget w : widgets) {
      if (w.getId() == Id) {
        return w;
      }
    }
    return null;
  }
}