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

    @Column(nullable = false,columnDefinition="Decimal(2,1) default '0.0'")
    private Double cgpa;

    private Integer grad_year;

    @Column(nullable = false)
    private String domain;

    @Column(nullable = false)
    private String specialization;

    public Student(Integer id, String roll_number, String first_name, String last_name, String email, Double cgpa, Integer grad_year, String domain, String specialization) {
        this.id = id;
        this.roll_number = roll_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.cgpa = cgpa;
        this.grad_year = grad_year;
        this.domain = domain;
        this.specialization = specialization;
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

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public Integer getGrad_year() {
        return grad_year;
    }

    public void setGrad_year(Integer grad_year) {
        this.grad_year = grad_year;
    }



}
