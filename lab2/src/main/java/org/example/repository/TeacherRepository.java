package org.example.repository;

import org.example.models.Discipline;
import org.example.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository{

    List<Teacher> findTeacherNotWorking(String date);

    List<Teacher> findTeachersByDateByClass(String date, Integer numberOfClass);

}
