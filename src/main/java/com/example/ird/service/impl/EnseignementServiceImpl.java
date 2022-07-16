package com.example.ird.service.impl;


import com.example.ird.bean.Enseignement;
import com.example.ird.dao.EnseignementDao;
import com.example.ird.service.facade.DistinctionService;
import com.example.ird.service.facade.EnseignementService;
import com.example.ird.service.facade.FormationContinueService;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class EnseignementServiceImpl implements EnseignementService {
    @Autowired
    private EnseignementDao enseignementDao;

    @Autowired
    private DistinctionService distinctionService;
    @Autowired
    private FormationContinueService formationContinueService;

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
    public int deleteByIntitule(String intitule) {
        return enseignementDao.deleteByIntitule(intitule);
    }

    @Override
    public int deleteByDescription(String description) {
        return enseignementDao.deleteByDescription(description);
    }

    @Override
    public double sumEnseignement(Long chercheurId, Long campagneId) {
        return enseignementDao.findSumDureeEstimeByChercheurIdAndCampagneId(chercheurId, campagneId);

    }

    @Override
    public StatistiqueFormulaireVo pourcentageEnseignement(Long chercheurId, Long campagneId) {
        double sum1 = sumEnseignement(chercheurId, campagneId);
        double sum2 = formationContinueService.sumFormationContinue(chercheurId, campagneId);
        double sum3 = distinctionService.sumDistiction(chercheurId, campagneId);
        double pr = sum1 / (sum1 + sum2 + sum3);
        return new StatistiqueFormulaireVo(sum1, pr, "Ensignement");


    }


    @Override
    public Enseignement save(Enseignement enseignement) {
        return enseignementDao.save(enseignement);
    }


    public List<Enseignement> findAll() {
        return enseignementDao.findAll();
    }
}
