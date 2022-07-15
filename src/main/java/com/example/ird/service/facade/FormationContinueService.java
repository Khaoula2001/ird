package com.example.ird.service.facade;

import com.example.ird.bean.FormationContinue;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface FormationContinueService {
    FormationContinue save(FormationContinue formationContinue);

    FormationContinue findByDureeEstime(double dureeEstime);

    FormationContinue findByDescription(String description);

    List<FormationContinue> findByChercheurEmail(String email);

    List<FormationContinue> findByCampagneDateDebut(Date dateDebut);

    @Transactional
    int deleteByDureeEstime(double dureeEstime);

    @Transactional
    int deleteByDescription(String description);

    double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId , Long campagneId);

}
