package com.example.ird.service.impl;


import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import com.example.ird.dao.CampagneChercheurOuvertureDao;
import com.example.ird.service.fasade.CampagneChercheurOuvertureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class CampagneChercheurOuvertureServiceImpl implements CampagneChercheurOuvertureService {
    @Autowired
    private CampagneChercheurOuvertureDao campagneChercheurOuvertureDao;

    @Override
    public CampagneChercheurOuverture save(CampagneChercheurOuverture campagneChercheurOuverture) {
        return campagneChercheurOuvertureDao.save(campagneChercheurOuverture);

    }

    @Override
    public List<CampagneChercheurOuverture> findByCampagneDateDebut(Date dateDebut) {
        return campagneChercheurOuvertureDao.findByCampagneDateDebut(dateDebut);
    }

    @Override
    public List<CampagneChercheurOuverture> findByCampagneDateFin(Date dateFin) {
        return campagneChercheurOuvertureDao.findByCampagneDateFin(dateFin);
    }

    @Override
    @Transactional
    public int deleteByCampagneDateDebut(Date dateDebut) {
        return campagneChercheurOuvertureDao.deleteByCampagneDateDebut(dateDebut);
    }

    @Override
    @Transactional
    public int deleteByCampagneDateFin(Date dateFin) {
        return campagneChercheurOuvertureDao.deleteByCampagneDateFin(dateFin);
    }

    @Override
    public Chercheur findByChercheurLogin(String login) {
        return campagneChercheurOuvertureDao.findByChercheurLogin(login);
    }

    @Override
    public Chercheur findByChercheurNom(String nom) {
        return campagneChercheurOuvertureDao.findByChercheurNom(nom);
    }

    @Override
    public Chercheur findByChercheurPrenom(String prenom) {
        return campagneChercheurOuvertureDao.findByChercheurPrenom(prenom);
    }

    @Override
    public Chercheur findByChercheurEmail(String email) {
        return campagneChercheurOuvertureDao.findByChercheurEmail(email);
    }

    @Override
    @Transactional
    public int deleteByChercheurLogin(String login) {
        return campagneChercheurOuvertureDao.deleteByChercheurLogin(login);
    }

    @Override
    @Transactional
    public int deleteByChercheurNom(String nom) {
        return campagneChercheurOuvertureDao.deleteByChercheurNom(nom);
    }

    @Override
    @Transactional
    public int deleteByChercheurPrenom(String prenom) {
        return campagneChercheurOuvertureDao.deleteByChercheurPrenom(prenom);
    }

    @Override
    @Transactional
    public int deleteByChercheurEmail(String email) {
        return campagneChercheurOuvertureDao.deleteByChercheurEmail(email);
    }

    public List<CampagneChercheurOuverture> findAll() {
        return campagneChercheurOuvertureDao.findAll();
    }
}
