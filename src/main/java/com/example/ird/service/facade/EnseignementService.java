package com.example.ird.service.facade;

import com.example.ird.bean.Enseignement;
<<<<<<< HEAD
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface EnseignementService {
=======

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface EnseignementService {
    Enseignement save(Enseignement enseignement);
>>>>>>> origin/master

    Enseignement findByIntitule(String intitule);

    Enseignement findByDescription(String description);

<<<<<<< HEAD

=======
>>>>>>> origin/master
    List<Enseignement> findByChercheurEmail(String email);

    List<Enseignement> findByCampagneDateDebut(Date dateDebut);

<<<<<<< HEAD

    int deleteByIntitule(String intitule);

    int deleteByDescription(String description);

    double sumEnseignement(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageEnseignement(Long chercheurId, Long campagneId);

    Enseignement save(Enseignement enseignement);


=======
    @Transactional
    int deleteByIntitule(String intitule);

    @Transactional
    int deleteByDescription(String description);

    double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId , Long campagneId);
>>>>>>> origin/master
}
