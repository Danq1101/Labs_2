package example.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "disciplines")
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "discipline_id_seq")
    @SequenceGenerator(name = "discipline_id_seq", sequenceName = "discipline_id_seq", allocationSize = 1)
    private Integer id;

    private String name;

    private String date;

    private Integer numberOfClass;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}
