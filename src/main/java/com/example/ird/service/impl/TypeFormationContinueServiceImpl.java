package com.example.ird.service.impl;

import com.example.ird.bean.TypeFormationContinue;
import com.example.ird.dao.TypeFormationContinueDao;
import com.example.ird.service.facade.TypeFormationContinueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TypeFormationContinueServiceImpl implements TypeFormationContinueService {
    @Autowired
    private TypeFormationContinueDao typeFormationContinueDao;

    @Override
    public TypeFormationContinue save(TypeFormationContinue typeFormationContinue) {
        return typeFormationContinueDao.save(typeFormationContinue);

    }

    @Override
    public TypeFormationContinue findByCode(String code) {
        return typeFormationContinueDao.findByCode(code);
    }

    @Override
    public TypeFormationContinue findByLibelle(String libelle) {
        return typeFormationContinueDao.findByLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return typeFormationContinueDao.deleteByCode(code);
    }

    @Override
    @Transactional
    public int deleteByLibelle(String Libelle) {
        return typeFormationContinueDao.deleteByLibelle(Libelle);
    }

    public List<TypeFormationContinue> findAll() {
        return typeFormationContinueDao.findAll();
    }
}
