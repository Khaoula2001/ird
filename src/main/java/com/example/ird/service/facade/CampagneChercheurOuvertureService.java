package com.example.ird.service.facade;

import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface CampagneChercheurOuvertureService {

    List<CampagneChercheurOuverture> findByCampagneDateDebut(Date dateDebut);

    List<CampagneChercheurOuverture> findByCampagneDateFin(Date dateFin);

    int deleteByCampagneDateDebut(Date dateDebut);

    int deleteByCampagneDateFin(Date dateFin);

    Chercheur findByChercheurLogin(String login);

    Chercheur findByChercheurNom(String nom);

    Chercheur findByChercheurPrenom(String prenom);

    Chercheur findByChercheurEmail(String email);

    int deleteByChercheurLogin(String login);

    int deleteByChercheurNom(String nom);

    int deleteByChercheurPrenom(String prenom);

    int deleteByChercheurEmail(String email);

    CampagneChercheurOuverture save(CampagneChercheurOuverture campagneChercheurOuverture);


}
