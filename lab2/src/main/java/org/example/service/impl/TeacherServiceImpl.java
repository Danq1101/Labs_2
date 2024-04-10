package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.Discipline;
import org.example.repository.DisciplineRepository;
import org.example.repository.TeacherRepository;
import org.example.models.Teacher;
import org.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRpository;

    @Override
    public List<Teacher> showTeachersByDateByClass(String date, Integer numberOfClass) {
        return teacherRpository.findTeachersByDateByClass(date, numberOfClass);
    }

    @Override
    public List<Teacher> showTeacherNotWorking(String date) {
        return teacherRpository.findTeacherNotWorking(date);
    }
}
