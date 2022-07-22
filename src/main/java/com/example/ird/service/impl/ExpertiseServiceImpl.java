package com.example.ird.service.impl;

import com.example.ird.bean.*;
import com.example.ird.dao.ExpertiseDao;
import com.example.ird.service.facade.CampagneService;
import com.example.ird.service.facade.ChercheurService;
import com.example.ird.service.facade.ExpertiseService;
import com.example.ird.service.facade.NatureExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertiseServiceImpl implements ExpertiseService {
    //    find all method8
    @Override
    public List<Expertise> findAll() {
        return expertiseDao.findAll();
    }

    //    Method delete
    public int delete(Expertise expertise){
        return 0;
    }

    @Autowired
    private ExpertiseDao expertiseDao;


}