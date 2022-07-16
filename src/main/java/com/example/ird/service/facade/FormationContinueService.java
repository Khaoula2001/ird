package com.example.ird.service.facade;

import com.example.ird.bean.FormationContinue;
<<<<<<< HEAD
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface FormationContinueService {

=======

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface FormationContinueService {
    FormationContinue save(FormationContinue formationContinue);
>>>>>>> origin/master

    FormationContinue findByDureeEstime(double dureeEstime);

    FormationContinue findByDescription(String description);

<<<<<<< HEAD

=======
>>>>>>> origin/master
    List<FormationContinue> findByChercheurEmail(String email);

    List<FormationContinue> findByCampagneDateDebut(Date dateDebut);

<<<<<<< HEAD

    int deleteByDureeEstime(double dureeEstime);

    int deleteByDescription(String description);


    double sumFormationContinue(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageFormationContinue(Long chercheurId, Long campagneId);

    FormationContinue save(FormationContinue formationContinue);
=======
    @Transactional
    int deleteByDureeEstime(double dureeEstime);

    @Transactional
    int deleteByDescription(String description);

    double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId , Long campagneId);

>>>>>>> origin/master
}
