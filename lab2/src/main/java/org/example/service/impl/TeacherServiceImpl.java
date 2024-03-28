package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.repository.TeacherRpository;
import org.example.models.Teacher;
import org.example.service.TeacherService;

import java.util.List;

@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRpository teacherRpository;

    @Override
    public List<Teacher> showTeachersByDateByClass(String date, int numberOfClass) {
        return teacherRpository.findTeachersByDateByClass(date, numberOfClass);
    }

    @Override
    public List<Teacher> showTeacherNotWorking(String date) {
        return teacherRpository.findTeacherNotWorking(date);
    }
}
