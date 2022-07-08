package com.example.ird.service.impl;

import com.example.ird.bean.NatureExpertise;
import com.example.ird.dao.NatureExpertiseDao;
import com.example.ird.service.facade.NatureExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NatureExpertiseServiceImpl implements NatureExpertiseService {
    // beg save
    @Override
    public int save(NatureExpertise natureexpertise) {
        prepare(natureexpertise);
        int validate = validate(natureexpertise);
        if (validate < 0) {
            return validate;
        } else {
            handlprocess(natureexpertise);
            return validate;
        }
    }

    private void handlprocess(NatureExpertise natureexpertise) {
        natureExpertiseDao.save(natureexpertise);
    }

    private void prepare(NatureExpertise natureexpertise) {
    }

    private int validate(NatureExpertise natureexpertise) {
        if (natureExpertiseDao.findByCode(natureexpertise.getCode()) != null) {
            return -1;
        } else
            return 1;
    }
// end save

    @Override
    public List<NatureExpertise> findAll() {
        return natureExpertiseDao.findAll();
    }

    @Override
    public NatureExpertise findByCode(String code) {
        return natureExpertiseDao.findByCode(code);
    }

    @Transactional
    @Override
    public int deleteByCode(String code) {
        return natureExpertiseDao.deleteByCode(code);
    }

    @Autowired
    private NatureExpertiseDao natureExpertiseDao;
}
