package com.example.ird.ws.provided;


import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import com.example.ird.service.facade.CampagneChercheurOuvertureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/campagneChercheurOuverture")
public class CampagneChercheurOuvertureWs {
    @Autowired
    private CampagneChercheurOuvertureService campagneChercheurOuvertureService;

    public List<CampagneChercheurOuverture> findByCampagneDateDebut(Date dateDebut) {
        return campagneChercheurOuvertureService.findByCampagneDateDebut(dateDebut);
    }

    public List<CampagneChercheurOuverture> findByCampagneDateFin(Date dateFin) {
        return campagneChercheurOuvertureService.findByCampagneDateFin(dateFin);
    }

    public int deleteByCampagneDateDebut(Date dateDebut) {
        return campagneChercheurOuvertureService.deleteByCampagneDateDebut(dateDebut);
    }

    public int deleteByCampagneDateFin(Date dateFin) {
        return campagneChercheurOuvertureService.deleteByCampagneDateFin(dateFin);
    }

    public Chercheur findByChercheurLogin(String login) {
        return campagneChercheurOuvertureService.findByChercheurLogin(login);
    }

    public Chercheur findByChercheurNom(String nom) {
        return campagneChercheurOuvertureService.findByChercheurNom(nom);
    }

    public Chercheur findByChercheurPrenom(String prenom) {
        return campagneChercheurOuvertureService.findByChercheurPrenom(prenom);
    }

    public Chercheur findByChercheurEmail(String email) {
        return campagneChercheurOuvertureService.findByChercheurEmail(email);
    }

    public int deleteByChercheurLogin(String login) {
        return campagneChercheurOuvertureService.deleteByChercheurLogin(login);
    }

    public int deleteByChercheurNom(String nom) {
        return campagneChercheurOuvertureService.deleteByChercheurNom(nom);
    }

    public int deleteByChercheurPrenom(String prenom) {
        return campagneChercheurOuvertureService.deleteByChercheurPrenom(prenom);
    }

    public int deleteByChercheurEmail(String email) {
        return campagneChercheurOuvertureService.deleteByChercheurEmail(email);
    }

    public CampagneChercheurOuverture save(CampagneChercheurOuverture campagneChercheurOuverture) {
        return campagneChercheurOuvertureService.save(campagneChercheurOuverture);
    }
}
