package com.example.esdprojectnew.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Student")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String roll_number;

    @Column(nullable = false)
    private String first_name;
    private String last_name;

    @Column(nullable = false, unique = true)
    private String email;

    private String specialization;

    @Column(nullable = false)
    private String domain;


    private Integer placement_id;

    public Student(Integer id, String roll_number, String first_name, String last_name, String email, String specialization, String domain, Integer placement_id) {
        this.id = id;
        this.roll_number = roll_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.specialization = specialization;
        this.domain = domain;
        this.placement_id = placement_id;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getPlacement_id() {
        return placement_id;
    }

    public void setPlacement_id(Integer placement_id) {
        this.placement_id = placement_id;
    }
}
