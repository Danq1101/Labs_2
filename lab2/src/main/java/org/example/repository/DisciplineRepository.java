package org.example.repository;

import org.example.models.Discipline;

import java.util.List;

public interface DisciplineRepository {

    String findDateByNumberOfPairs(int numberOfPairs);

    String findDateByNumberOfClass(int numberOfClass);

}
