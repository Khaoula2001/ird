package com.example.ird.service.facade;

import com.example.ird.bean.Distinction;
<<<<<<< HEAD
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;

@Service
public interface DistinctionService {

    double sumDistiction(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageDistinction(Long chercheurId, Long campagneId);

=======

import javax.transaction.Transactional;

public interface DistinctionService {
>>>>>>> origin/master
    Distinction findByLibelle(String libelle);

    Distinction findByDescription(String description);

<<<<<<< HEAD

    int deleteByLibelle(String libelle);

    Distinction save(Distinction distinction);
=======
    @Transactional
    int deleteByLibelle(String libelle);

    Distinction save(Distinction distinction);

    double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId , Long campagneId);

>>>>>>> origin/master
}
