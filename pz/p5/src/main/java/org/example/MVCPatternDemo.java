package org.example;

import org.example.controller.CourseController;
import org.example.models.Course;
import org.example.view.CourseView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Course model = retriveCourseFromDatabase();
        CourseView view = new CourseView();
        CourseController controller = new CourseController(model, view);
        controller.updateView();
        controller.getModel().setCourseName("Python");
        System.out.println("After updating, course details are as follows");
        controller.updateView();
    }

    private static Course retriveCourseFromDatabase(){
        Course course = new Course();
        course.setCourseName("Java");
        course.setCourseId("1");
        course.setCourseCategory("Programming");
        return course;
    }
}
