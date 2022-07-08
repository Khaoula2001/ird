package com.example.ird.service.impl;

import com.example.ird.bean.Chercheur;
import com.example.ird.bean.Expertise;
import com.example.ird.dao.ExpertiseDao;
import com.example.ird.service.facade.CampagneService;
import com.example.ird.service.facade.ChercheurService;
import com.example.ird.service.facade.ExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertiseServiceImpl implements ExpertiseService {
// mth save
    @Override
    public int save(Expertise expertise){
        prepare(expertise);
        int validate = validate(expertise);
        if (validate < 0 ){
            return validate;
        }else {
            handleprocess(expertise);
            return 1;
        }
    }

    private void prepare(Expertise expertise){
        try{
            Chercheur chercheur = chercheurService.findByLogin(expertise.getChercheur().getLogin());
            expertise.setChercheur(chercheur);
        }catch (Exception ex){
            ex.printStackTrace();
        }
//        Campagne campagne = campagneService.findByDateDebut(expertise.getCampagne().getDateDebut());
//        expertise.setCampagne(campagne);
    }

    private int validate(Expertise expertise){
        if(expertise == null){
            return -1;
        }else if (expertise.getChercheur().getLogin() == null){
            return -2;
        }else
        return 1;
    }

    private void handleprocess(Expertise expertise){
        expertiseDao.save(expertise);
    }
// end mth save

    @Override
    public List<Expertise> findAll() {
        return expertiseDao.findAll();
    }


    @Autowired
    private ExpertiseDao expertiseDao;
    @Autowired
    private ChercheurService chercheurService;
    @Autowired
    private CampagneService campagneService;


}
