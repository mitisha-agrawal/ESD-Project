package com.example.esdprojectnew.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Placement_Student")
public class Placement_Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer placement_id;

    @ManyToOne
    @JoinColumn(name="org_id")
    private Placement org_id;

    @ManyToOne
    @JoinColumn(name="id")
    private Student id;


    private String acceptance;

    public Placement_Student(Integer placement_id, Placement org_id, Student id, String acceptance) {
        this.placement_id = placement_id;
        this.org_id = org_id;
        this.id = id;
        this.acceptance = acceptance;
    }

    public Placement_Student() {

    }

    public Integer getPlacement_id() {
        return placement_id;
    }

    public void setPlacement_id(Integer placement_id) {
        this.placement_id = placement_id;
    }

    public Placement getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Placement org_id) {
        this.org_id = org_id;
    }

    public Student getId() {
        return id;
    }

    public void setId(Student id) {
        this.id = id;
    }

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }
}
