package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.models.Discipline;
import org.example.models.Teacher;
import org.example.repository.DisciplineRepository;
import org.example.repository.TeacherRepository;
import org.example.service.DisciplineService;
import org.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DisciplineServiceImpl implements DisciplineService {

    private final DisciplineRepository disciplineRepository;

    @Override
    public String showDateByNumberOfPairs(int numberOfPairs) {
        List<Discipline> disciplines = disciplineRepository.findDateByNumberOfPairs(numberOfPairs);
        String result = "";
        for (Discipline d: disciplines) {
            result += d.getDate();
            result += " ";
        }
        return result;
    }

    @Override
    public String showDateByNumberOfClass(int numberOfClass) {
        List<Discipline> disciplines = disciplineRepository.findDateByNumberOfClass(numberOfClass);
        String result = "";
        for (Discipline d: disciplines) {
            result += d.getDate();
            result += " ";
        }
        return result;
    }
}
