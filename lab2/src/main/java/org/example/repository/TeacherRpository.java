package org.example.repository;

import org.example.models.Teacher;

import java.util.List;

public interface TeacherRpository {

    List<Teacher> findTeachersByDateByClass(String date, int numberOfClass);

    List<Teacher> findTeacherNotWorking(String date);

}
