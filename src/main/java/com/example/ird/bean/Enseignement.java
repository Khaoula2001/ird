
package com.example.ird.bean;

import javax.persistence.*;

@Entity
public class Enseignement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double dureeEstime;
    private String description;
    private String intitule;
    @ManyToOne
    private ModaliteEnseignement modaliteEnseignement;
    @ManyToOne
    private Chercheur chercheur;
    @ManyToOne
    private Campagne campagne;

    public Enseignement() {
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

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public ModaliteEnseignement getModaliteEnseignement() {
        return modaliteEnseignement;
    }

    public void setModaliteEnseignement(ModaliteEnseignement modaliteEnseignement) {
        this.modaliteEnseignement = modaliteEnseignement;
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
