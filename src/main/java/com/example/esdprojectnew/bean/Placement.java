package com.example.esdprojectnew.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Placement")
public class Placement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer org_id;

    @Column(nullable = false)
    private String organization;

    @Column(nullable = false)
    private String profile;

    private String description;


    private Integer intake;

    private Double min_grade;

    public Placement(Integer org_id, String organization, String profile, String description, Integer intake, Double min_grade) {
        this.org_id = org_id;
        this.organization = organization;
        this.profile = profile;
        this.description = description;
        this.intake = intake;
        this.min_grade = min_grade;
    }

    public Placement() {

    }

    public Integer getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Integer org_id) {
        this.org_id = org_id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIntake() {
        return intake;
    }

    public void setIntake(Integer intake) {
        this.intake = intake;
    }

    public Double getMin_grade() {
        return min_grade;
    }

    public void setMin_grade(Double min_grade) {
        this.min_grade = min_grade;
    }
}
