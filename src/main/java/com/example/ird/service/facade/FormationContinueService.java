package com.example.ird.service.facade;

import com.example.ird.bean.FormationContinue;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;

@Service
public interface FormationContinueService {

    FormationContinue save(FormationContinue formationContinue);

    FormationContinue findByDureeEstime(double dureeEstime);

    FormationContinue findByDescription(String description);

    List<FormationContinue> findByChercheurEmail(String email);

    List<FormationContinue> findByCampagneDateDebut(Date dateDebut);

    double sumFormationContinue(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageFormationContinue(Long chercheurId, Long campagneId);

    @Transactional
    int deleteByDureeEstime(double dureeEstime);

    @Transactional
    int deleteByDescription(String description);

    double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId , Long campagneId);

}
