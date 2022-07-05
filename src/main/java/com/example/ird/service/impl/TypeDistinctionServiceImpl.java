package com.example.ird.service.impl;

import com.example.ird.bean.TypeDistinction;
import com.example.ird.dao.TypeDistinctionDao;
import com.example.ird.service.fasade.TypeDistinctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TypeDistinctionServiceImpl implements TypeDistinctionService {
    @Autowired
    private TypeDistinctionDao typeDistinctionDao;

    @Override
    public TypeDistinction save(TypeDistinction typeDistinction) {
        return typeDistinctionDao.save(typeDistinction);

    }

    @Override
    public TypeDistinction findByCode(String code) {
        return typeDistinctionDao.findByCode(code);
    }

    @Override
    public TypeDistinction findByLibelle(String libelle) {
        return typeDistinctionDao.findByLibelle(libelle);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return typeDistinctionDao.deleteByCode(code);
    }

    @Override
    @Transactional
    public int deleteByLibelle(String Libelle) {
        return typeDistinctionDao.deleteByLibelle(Libelle);
    }

    public List<TypeDistinction> findAll() {
        return typeDistinctionDao.findAll();
    }
}
