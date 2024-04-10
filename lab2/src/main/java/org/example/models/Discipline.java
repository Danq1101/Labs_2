package org.example.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "disciplines")
public class Discipline {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "disciplines_id_seq")
    @SequenceGenerator(name = "disciplines_id_seq", sequenceName = "disciplines_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "date")
    private String date;

    @Column(name = "number_of_class")
    private Integer numberOfClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    public Discipline(String date, int numberOfClass){
        this.date = date;
        this.numberOfClass = numberOfClass;
    }

    public Discipline() {

    }
}
