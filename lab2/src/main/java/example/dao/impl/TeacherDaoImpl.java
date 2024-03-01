package example.dao.impl;

import example.models.Discipline;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TeacherDaoImpl {

    private Integer id;

    private String name;

    private String surname;

    private Integer numberOfStudents;

    private Integer numberOfPairs;


}
