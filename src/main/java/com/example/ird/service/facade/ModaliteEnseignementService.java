package com.example.ird.service.facade;

import com.example.ird.bean.ModaliteEnseignement;

import javax.transaction.Transactional;

public interface ModaliteEnseignementService {
    ModaliteEnseignement save(ModaliteEnseignement modaliteEnseignement);

    ModaliteEnseignement findByCode(String code);

    ModaliteEnseignement findByLibelle(String libelle);

    @Transactional
    int deleteByCode(String code);

    @Transactional
    int deleteByLibelle(String Libelle);
}
