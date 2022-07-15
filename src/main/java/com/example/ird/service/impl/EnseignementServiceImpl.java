package com.example.ird.service.impl;


import com.example.ird.bean.Enseignement;
import com.example.ird.dao.EnseignementDao;
import com.example.ird.service.facade.EnseignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class EnseignementServiceImpl implements EnseignementService {
    @Autowired
    private EnseignementDao enseignementDao;

    @Override
    public Enseignement save(Enseignement enseignement) {
        return enseignementDao.save(enseignement);

    }

    @Override
    public Enseignement findByIntitule(String intitule) {
        return enseignementDao.findByIntitule(intitule);
    }

    @Override
    public Enseignement findByDescription(String description) {
        return enseignementDao.findByDescription(description);
    }

    @Override
    public List<Enseignement> findByChercheurEmail(String email) {
        return enseignementDao.findByChercheurEmail(email);
    }

    @Override
    public List<Enseignement> findByCampagneDateDebut(Date dateDebut) {
        return enseignementDao.findByCampagneDateDebut(dateDebut);
    }

    @Override
    @Transactional
    public int deleteByIntitule(String intitule) {
        return enseignementDao.deleteByIntitule(intitule);
    }

    @Override
    @Transactional
    public int deleteByDescription(String description) {
        return enseignementDao.deleteByDescription(description);
    }

    public List<Enseignement> findAll() {
        return enseignementDao.findAll();
    }

    @Override
    public double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId, Long campagneId) {
        return enseignementDao.findSumDureeEstimeByChercheurIdAndCampagneId(checheurId, campagneId);
    }
}
