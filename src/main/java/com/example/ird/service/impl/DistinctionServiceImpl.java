package com.example.ird.service.impl;

import com.example.ird.bean.Distinction;
import com.example.ird.dao.DistinctionDao;
import com.example.ird.service.facade.DistinctionService;
import com.example.ird.service.facade.EnseignementService;
import com.example.ird.service.facade.FormationContinueService;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DistinctionServiceImpl implements DistinctionService {

    @Autowired
    private DistinctionDao distinctionDao;
    @Autowired

    private FormationContinueService formationContinueService;
    @Autowired

    private EnseignementService enseignementService;


    @Override
    public double sumDistiction(Long chercheurId, Long campagneId) {
        return distinctionDao.findSumDureeEstimeByChercheurIdAndCampagneId(chercheurId, campagneId);
    }

    @Override
    public StatistiqueFormulaireVo pourcentageDistinction(Long chercheurId, Long campagneId) {
        double sum1 = sumDistiction(chercheurId, campagneId);
        double sum2 = formationContinueService.sumFormationContinue(chercheurId, campagneId);
        double sum3 = enseignementService.sumEnseignement(chercheurId, campagneId);
        double pr = sum1 / (sum1 + sum2 + sum3);
        return new StatistiqueFormulaireVo(sum1, pr, "Distinction");

    }

    @Override
    public Distinction findByLibelle(String libelle) {
        return distinctionDao.findByLibelle(libelle);
    }

    @Override
    public Distinction findByDescription(String description) {
        return distinctionDao.findByDescription(description);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return distinctionDao.deleteByLibelle(libelle);
    }

    @Override
    public Distinction save(Distinction distinction) {

        return distinctionDao.save(distinction);


    }

    public List<Distinction> findAll() {
        return distinctionDao.findAll();
    }
}
