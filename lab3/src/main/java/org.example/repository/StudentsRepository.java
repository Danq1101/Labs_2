package org.example.repository;

import org.example.model.Student;

import java.util.List;

public interface StudentsRepository {

    void createStudent (Student student);

    List<Student> readAll();

    void updateStudent(int id, String department);

    void deleteStudent(int id);

}
