package org.example.service;

import org.example.models.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> showTeachersByDateByClass(String date, Integer numberOfClass);

    List<Teacher> showTeacherNotWorking(String date);

}
