package com.example.ird.service.vo;

public class StatistiqueFormulaireVo {


    private double somme;
    private double pourcentage;
    private String nomFormulaire;

    public StatistiqueFormulaireVo() {
    }

    public StatistiqueFormulaireVo(double somme, double pourcentage, String nomFormulaire) {
        this.somme = somme;
        this.pourcentage = pourcentage;
        this.nomFormulaire = nomFormulaire;
    }

    public double getSum() {
        return somme;
    }

    public void setSum(double somme) {
        this.somme = somme;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getNom() {
        return nomFormulaire;
    }

    public void setNom(String nomFormulaire) {
        this.nomFormulaire = nomFormulaire;
    }
}
