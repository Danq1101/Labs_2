package org.example.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.example.models.Course;
import org.example.view.CourseView;

@Data
@RequiredArgsConstructor
public class CourseController {

    private Course model;

    private CourseView view;

    public CourseController(Course model, CourseView view){
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        view.printCourseDetails(model.getCourseName(), model.getCourseId(), model.getCourseCategory());
    }


}
