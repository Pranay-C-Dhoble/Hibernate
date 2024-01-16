package org.example.entity;

import javax.persistence.*;

@Entity //Used to mark the class as an entity
//@Table(name = "mystudents")
public class Student {
    @Id //Used to mark the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
