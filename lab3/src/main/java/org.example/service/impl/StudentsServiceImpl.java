package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.model.Student;
import org.example.repository.StudentsRepository;
import org.example.service.StudentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentsServiceImpl implements StudentsService {

    private final StudentsRepository studentsRepository;

    @Override
    public void createStudent(Student student) {
        studentsRepository.createStudent(student);
    }

    @Override
    public List<Student> getAll() {
        return studentsRepository.readAll();
    }

    @Override
    public void updateStudent(int id, String department) {
        studentsRepository.updateStudent(id, department);
    }

    @Override
    public void deleteStudent(int id) {
        studentsRepository.deleteStudent(id);
    }
}
