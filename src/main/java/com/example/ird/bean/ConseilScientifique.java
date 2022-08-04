package com.example.ird.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class ConseilScientifique {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String intitule;
    private String descriptif;
    @ManyToOne
    private NatureExpertise natureExpertise;
    @ManyToOne
    @JsonIgnore
    private Expertise expertise;


    public NatureExpertise getNatureExpertise() {
        return natureExpertise;
    }

    public void setNatureExpertise(NatureExpertise natureExpertise) {
        this.natureExpertise = natureExpertise;
    }

    public Expertise getExpertise() {
        return expertise;
    }

    public void setExpertise(Expertise expertise) {
        this.expertise = expertise;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
}
