package com.example.ird.service.facade;

import com.example.ird.bean.Distinction;

import javax.transaction.Transactional;

public interface DistinctionService {
    Distinction findByLibelle(String libelle);

    Distinction findByDescription(String description);

    @Transactional
    int deleteByLibelle(String libelle);

    Distinction save(Distinction distinction);
}
