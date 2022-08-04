package com.example.ird.service.facade;

import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;
@Service
public interface CampagneChercheurOuvertureService {

    CampagneChercheurOuverture save(CampagneChercheurOuverture campagneChercheurOuverture);

    List<CampagneChercheurOuverture> findByCampagneDateDebut(Date dateDebut);

    List<CampagneChercheurOuverture> findByCampagneDateFin(Date dateFin);


    @Transactional
    int deleteByCampagneDateDebut(Date dateDebut);

    @Transactional
    int deleteByCampagneDateFin(Date dateFin);

    Chercheur findByChercheurLogin(String login);

    Chercheur findByChercheurNom(String nom);

    Chercheur findByChercheurPrenom(String prenom);

    Chercheur findByChercheurEmail(String email);

    @Transactional
    int deleteByChercheurLogin(String login);

    @Transactional
    int deleteByChercheurNom(String nom);

    @Transactional
    int deleteByChercheurPrenom(String prenom);

    @Transactional
    int deleteByChercheurEmail(String email);

    List<CampagneChercheurOuverture> findAll();
}
