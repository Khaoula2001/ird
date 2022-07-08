package com.example.ird.service.impl;

import com.example.ird.bean.EtatCampagne;
import com.example.ird.dao.EtatCampagneDao;
import com.example.ird.service.facade.EtatCampagneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtatCampagneServiceImpl implements EtatCampagneService {
    @Autowired
    private EtatCampagneDao etatCampagneDao;

    @Override
    public EtatCampagne findByCode(String code) {
        return etatCampagneDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return etatCampagneDao.deleteByCode(code);
    }

    public List<EtatCampagne> findAll() {
        return etatCampagneDao.findAll();
    }


}
