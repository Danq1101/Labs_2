package org.example.models;

import jakarta.persistence.*;

@Entity
@Table(name="autos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "autos_id_seq")
    @SequenceGenerator(name = "autos_id_seq", sequenceName = "autos_id_seq", allocationSize = 1)
    private int id;

    private String model;

    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    public Auto(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Auto(int id) {
        this.id = id;
    }

    public Auto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
