package org.example.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "teachers_id_seq")
    @SequenceGenerator(name = "teachers_id_seq", sequenceName = "teachers_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "discipline_name")
    private String nameOfDiscipline;

    @Column(name = "number_of_pairs")
    private int numberOfPairs;

    @Column(name = "number_of_students")
    private int numberOfStudents;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Discipline> disciplines = new ArrayList<>();

    public Teacher() {}

    public void addDiscipline(Discipline discipline){
        this.disciplines.add(discipline);
    }

}


