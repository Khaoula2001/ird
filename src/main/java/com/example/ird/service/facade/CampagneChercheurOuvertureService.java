package com.example.ird.service.facade;

import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface CampagneChercheurOuvertureService {
=======

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface CampagneChercheurOuvertureService {
    CampagneChercheurOuverture save(CampagneChercheurOuverture campagneChercheurOuverture);
>>>>>>> origin/master

    List<CampagneChercheurOuverture> findByCampagneDateDebut(Date dateDebut);

    List<CampagneChercheurOuverture> findByCampagneDateFin(Date dateFin);

<<<<<<< HEAD
    int deleteByCampagneDateDebut(Date dateDebut);

=======
    @Transactional
    int deleteByCampagneDateDebut(Date dateDebut);

    @Transactional
>>>>>>> origin/master
    int deleteByCampagneDateFin(Date dateFin);

    Chercheur findByChercheurLogin(String login);

    Chercheur findByChercheurNom(String nom);

    Chercheur findByChercheurPrenom(String prenom);

    Chercheur findByChercheurEmail(String email);

<<<<<<< HEAD
    int deleteByChercheurLogin(String login);

    int deleteByChercheurNom(String nom);

    int deleteByChercheurPrenom(String prenom);

    int deleteByChercheurEmail(String email);

    CampagneChercheurOuverture save(CampagneChercheurOuverture campagneChercheurOuverture);


=======
    @Transactional
    int deleteByChercheurLogin(String login);

    @Transactional
    int deleteByChercheurNom(String nom);

    @Transactional
    int deleteByChercheurPrenom(String prenom);

    @Transactional
    int deleteByChercheurEmail(String email);

    List<CampagneChercheurOuverture> findAll();
>>>>>>> origin/master
}
