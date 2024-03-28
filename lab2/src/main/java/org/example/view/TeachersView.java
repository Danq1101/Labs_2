package org.example.view;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.service.TeacherService;

@RequiredArgsConstructor
public class TeachersView {

    private final TeacherService teacherService;

    public void view(String date, int numberOfClasses){

        System.out.print("Teachers who dont work in this date : ");
        System.out.println(teacherService.showTeacherNotWorking(date));
        System.out.print("Teachers by date and class: ");
        System.out.println(teacherService.showTeachersByDateByClass(date, numberOfClasses));

    }

}
