package com.example.ird.bean;


import javax.persistence.*;

@Entity
public class Distinction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    private String description;
    private double dureeEstime;
    @ManyToOne
    private TypeDistinction typeDistinction;

    @ManyToOne
    private Chercheur chercheur;

    @ManyToOne
    private Campagne campagne;


    public Distinction() {
    }

    public Campagne getCampagne() {
        return campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    public double getDureeEstime() {
        return dureeEstime;
    }

    public void setDureeEstime(double dureeEstime) {
        this.dureeEstime = dureeEstime;
    }

    public TypeDistinction getTypeDistinction() {
        return typeDistinction;
    }

    public void setTypeDistinction(TypeDistinction typeDistinction) {
        this.typeDistinction = typeDistinction;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }
}
