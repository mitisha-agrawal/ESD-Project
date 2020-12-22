package com.example.esdprojectnew.bean;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Placement_Filter")
public class Placement_Filter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer filter_id;

    @ManyToOne
    @JoinColumn(name="org_id")
    private Placement org_id;

    @Column(nullable = false)
    private String specialization;
    @Column(nullable = false)
    private String domain;

    public Placement_Filter(Integer filter_id, Placement org_id, String specialization, String domain) {
        this.filter_id = filter_id;
        this.org_id = org_id;
        this.specialization = specialization;
        this.domain = domain;
    }

    public Placement_Filter() {

    }

    public Integer getFilter_id() {
        return filter_id;
    }

    public void setFilter_id(Integer filter_id) {
        this.filter_id = filter_id;
    }

    public Placement getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Placement org_id) {
        this.org_id = org_id;
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
}
