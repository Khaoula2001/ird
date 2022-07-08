package com.example.ird.service.impl;

import com.example.ird.bean.ModaliteEnseignement;
import com.example.ird.dao.ModaliteEnseignementDao;
import com.example.ird.service.facade.ModaliteEnseignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ModaliteEnseignementServiceImpl implements ModaliteEnseignementService {
    @Autowired
    private ModaliteEnseignementDao modaliteEnseignementDao;

    @Override
    public ModaliteEnseignement save(ModaliteEnseignement modaliteEnseignement) {
        return modaliteEnseignementDao.save(modaliteEnseignement);

    }

    @Override
    public ModaliteEnseignement findByCode(String code) {
        return modaliteEnseignementDao.findByCode(code);
    }

    @Override
    public ModaliteEnseignement findByLibelle(String libelle) {
        return modaliteEnseignementDao.findByLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return modaliteEnseignementDao.deleteByCode(code);
    }

    @Override
    @Transactional
    public int deleteByLibelle(String Libelle) {
        return modaliteEnseignementDao.deleteByLibelle(Libelle);
    }

    public List<ModaliteEnseignement> findAll() {
        return modaliteEnseignementDao.findAll();
    }
}
