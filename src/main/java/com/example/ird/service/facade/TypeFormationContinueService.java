package com.example.ird.service.facade;

import com.example.ird.bean.TypeFormationContinue;

import javax.transaction.Transactional;

public interface TypeFormationContinueService {
    TypeFormationContinue save(TypeFormationContinue typeFormationContinue);

    TypeFormationContinue findByCode(String code);

    TypeFormationContinue findByLibelle(String libelle);

    @Transactional
    int deleteByCode(String code);

    @Transactional
    int deleteByLibelle(String Libelle);
}
