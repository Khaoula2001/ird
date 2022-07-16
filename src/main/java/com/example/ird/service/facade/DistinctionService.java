package com.example.ird.service.facade;

import com.example.ird.bean.Distinction;
import com.example.ird.service.vo.StatistiqueFormulaireVo;
import org.springframework.stereotype.Service;

@Service
public interface DistinctionService {

    double sumDistiction(Long chercheurId, Long campagneId);

    StatistiqueFormulaireVo pourcentageDistinction(Long chercheurId, Long campagneId);

    Distinction findByLibelle(String libelle);

    Distinction findByDescription(String description);


    int deleteByLibelle(String libelle);

    Distinction save(Distinction distinction);
}
