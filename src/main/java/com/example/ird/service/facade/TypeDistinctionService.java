package com.example.ird.service.facade;

import com.example.ird.bean.TypeDistinction;

import javax.transaction.Transactional;

public interface TypeDistinctionService {
    TypeDistinction save(TypeDistinction typeDistinction);

    TypeDistinction findByCode(String code);

    TypeDistinction findByLibelle(String libelle);

    @Transactional
    int deleteByCode(String code);

    @Transactional
    int deleteByLibelle(String Libelle);
}
