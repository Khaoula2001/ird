package com.example.ird.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Expertise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long tempsEstimal;
    private Long annee;
    private String libelle;
    @OneToMany(mappedBy = "expertise")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<ConseilScientifique> scientifiques;
    @ManyToOne
    private Chercheur chercheur;
    @ManyToOne
    private Campagne campagne;

    //    Getters && Setters
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTempsEstimal() {
        return tempsEstimal;
    }

    public void setTempsEstimal(Long tempsEstimal) {
        this.tempsEstimal = tempsEstimal;
    }

    public Long getAnnee() {
        return annee;
    }

    public void setAnnee(Long annee) {
        this.annee = annee;
    }

    public List<ConseilScientifique> getScientifiques() {
        return scientifiques;
    }

    public void setScientifiques(List<ConseilScientifique> scientifiques) {
        this.scientifiques = scientifiques;
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public Campagne getCampagne() {
        return campagne;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }
}
