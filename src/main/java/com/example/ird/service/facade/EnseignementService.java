package com.example.ird.service.facade;

import com.example.ird.bean.Enseignement;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface EnseignementService {

    Enseignement findByIntitule(String intitule);

    Enseignement findByDescription(String description);


    List<Enseignement> findByChercheurEmail(String email);

    List<Enseignement> findByCampagneDateDebut(Date dateDebut);


    int deleteByIntitule(String intitule);

    int deleteByDescription(String description);

    double sumEnseignement(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageEnseignement(Long chercheurId, Long campagneId);

    Enseignement save(Enseignement enseignement);


}
