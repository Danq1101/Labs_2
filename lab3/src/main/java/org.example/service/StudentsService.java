package org.example.service;

import org.example.model.Student;

import java.util.List;

public interface StudentsService {

    void createStudent(Student student);

    List<Student> getAll();

    void updateStudent(int id, String department);

    void deleteStudent(int id);

}
