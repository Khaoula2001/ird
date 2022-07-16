package com.example.ird.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chercheur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String passWord;
    private String prenom;
    private String nom;
    private String email;

    @OneToMany(mappedBy = "chercheur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Distinction> distinctions;
    @OneToMany(mappedBy = "chercheur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<FormationContinue> formationContinues;
    @OneToMany(mappedBy = "chercheur")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Enseignement> enseignements;


    public Chercheur() {
    }

    public List<FormationContinue> getFormationContinues() {
        return formationContinues;
    }

    public void setFormationContinues(List<FormationContinue> formationContinues) {
        this.formationContinues = formationContinues;
    }

    public List<Enseignement> getEnseignements() {
        return enseignements;
    }

    public void setEnseignements(List<Enseignement> enseignements) {
        this.enseignements = enseignements;
    }


    public List<Distinction> getDistinctions() {
        return distinctions;
    }

    public void setDistinctions(List<Distinction> distinctions) {
        this.distinctions = distinctions;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
