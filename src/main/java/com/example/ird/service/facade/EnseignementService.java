package com.example.ird.service.facade;

import com.example.ird.bean.Enseignement;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;

@Service
public interface EnseignementService {

    Enseignement save(Enseignement enseignement);

    Enseignement findByIntitule(String intitule);

    Enseignement findByDescription(String description);

    List<Enseignement> findByChercheurEmail(String email);

    List<Enseignement> findByCampagneDateDebut(Date dateDebut);

    double sumEnseignement(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageEnseignement(Long chercheurId, Long campagneId);

    @Transactional
    int deleteByIntitule(String intitule);

    @Transactional
    int deleteByDescription(String description);

    double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId , Long campagneId);
}
