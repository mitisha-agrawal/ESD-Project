package com.example.esdprojectnew.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Student_Courses")
public class Student_Courses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sc_id;//this is the general primary key of this table no other use

    @ManyToOne
    @JoinColumn(name="id",nullable = false)
    private Student id;     // FK to id in students table



    @Column(nullable = false)
    private String course_name;

    @Column(nullable = false)
    private Double grade;//grade for individual subject

    public Student_Courses(Integer sc_id, Student id, String course_name, Double grade) {
        this.sc_id = sc_id;
        this.id = id;
        this.course_name = course_name;
        this.grade = grade;
    }

    public Student_Courses() {

    }

    public Integer getSc_id() {
        return sc_id;
    }

    public void setSc_id(Integer sc_id) {
        this.sc_id = sc_id;
    }

    public Student getId() {
        return id;
    }

    public void setId(Student id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
