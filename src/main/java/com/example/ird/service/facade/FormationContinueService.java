package com.example.ird.service.facade;

import com.example.ird.bean.FormationContinue;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface FormationContinueService {


    FormationContinue findByDureeEstime(double dureeEstime);

    FormationContinue findByDescription(String description);


    List<FormationContinue> findByChercheurEmail(String email);

    List<FormationContinue> findByCampagneDateDebut(Date dateDebut);


    int deleteByDureeEstime(double dureeEstime);

    int deleteByDescription(String description);


    double sumFormationContinue(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageFormationContinue(Long chercheurId, Long campagneId);

    FormationContinue save(FormationContinue formationContinue);
}
