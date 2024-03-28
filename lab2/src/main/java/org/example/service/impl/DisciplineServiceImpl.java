package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.repository.DisciplineRepository;
import org.example.service.DisciplineService;

@RequiredArgsConstructor
public class DisciplineServiceImpl implements DisciplineService {

    private final DisciplineRepository disciplineRepository;


    @Override
    public String showDateByNumberOfPairs(int numberOfPairs) {
        return disciplineRepository.findDateByNumberOfPairs(numberOfPairs);
    }

    @Override
    public String showDateByNumberOfClass(int numberOfClass) {
        return disciplineRepository.findDateByNumberOfClass(numberOfClass);
    }
}
