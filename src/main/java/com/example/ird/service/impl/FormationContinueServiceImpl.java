package com.example.ird.service.impl;


import com.example.ird.bean.FormationContinue;
import com.example.ird.dao.FormationContinueDao;
import com.example.ird.service.facade.DistinctionService;
import com.example.ird.service.facade.EnseignementService;
import com.example.ird.service.facade.FormationContinueService;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class FormationContinueServiceImpl implements FormationContinueService {
    @Autowired
    private FormationContinueDao formationContinueDao;
    @Autowired

    private DistinctionService distinctionService;

    @Autowired
    private EnseignementService enseignementService;


    @Override

    public double sumFormationContinue(Long chercheurId, Long campagneId) {
        return formationContinueDao.findSumDureeEstimeByChercheurIdAndCampagneId(chercheurId, campagneId);

    }

    @Override
    public StatistiqueFormulaireVo pourcentageFormationContinue(Long chercheurId, Long campagneId) {
        double sum1 = sumFormationContinue(chercheurId, campagneId);
        double sum2 = distinctionService.sumDistiction(chercheurId, campagneId);
        double sum3 = enseignementService.sumEnseignement(chercheurId, campagneId);
        double pr = sum1 / (sum1 + sum2 + sum3);
        return new StatistiqueFormulaireVo(sum1, pr, "FormationContinue");


    }


    @Override
    public FormationContinue save(FormationContinue formationContinue) {
        return formationContinueDao.save(formationContinue);

    }

    @Override
    public FormationContinue findByDureeEstime(double dureeEstime) {
        return formationContinueDao.findByDureeEstime(dureeEstime);
    }

    @Override
    public FormationContinue findByDescription(String description) {
        return formationContinueDao.findByDescription(description);
    }

    @Override
    public List<FormationContinue> findByChercheurEmail(String email) {
        return formationContinueDao.findByChercheurEmail(email);
    }

    @Override
    public List<FormationContinue> findByCampagneDateDebut(Date dateDebut) {
        return formationContinueDao.findByCampagneDateDebut(dateDebut);
    }

    @Override
    @Transactional
    public int deleteByDureeEstime(double dureeEstime) {
        return formationContinueDao.deleteByDureeEstime(dureeEstime);
    }

    @Override
    @Transactional
    public int deleteByDescription(String description) {
        return formationContinueDao.deleteByDescription(description);
    }

    public List<FormationContinue> findAll() {
        return formationContinueDao.findAll();
    }

    @Override
    public double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId, Long campagneId) {
        return formationContinueDao.findSumDureeEstimeByChercheurIdAndCampagneId(checheurId, campagneId);
    }
}
