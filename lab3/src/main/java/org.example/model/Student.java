package org.example.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students", schema = "public")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="students_id_seq")
    @SequenceGenerator(name = "students_id_seq",sequenceName = "students_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "department")
    private String department;

    @Column(name = "enrollment")
    private String enrollment;

}
