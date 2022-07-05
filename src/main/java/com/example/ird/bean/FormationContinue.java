package com.example.ird.bean;


import javax.persistence.*;

@Entity
public class FormationContinue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double dureeEstime;
    private String description;
    @ManyToOne
    private Chercheur chercheur;
    @ManyToOne
    private Campagne campagne;
    @ManyToOne
    private TypeFormationContinue typeFormationContinue;

    public FormationContinue() {
    }

    public Campagne getCampagne() {
        return campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDureeEstime() {
        return dureeEstime;
    }

    public void setDureeEstime(double dureeEstime) {
        this.dureeEstime = dureeEstime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeFormationContinue getTypeFormationContinue() {
        return typeFormationContinue;
    }

    public void setTypeFormationContinue(TypeFormationContinue typeFormationContinue) {
        this.typeFormationContinue = typeFormationContinue;
    }
}
