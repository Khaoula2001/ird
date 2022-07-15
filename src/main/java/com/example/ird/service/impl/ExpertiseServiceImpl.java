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
    // Method save
    @Override
    public int save(Expertise expertise) {
        prepare(expertise);
        int validate = validate(expertise);
        if (validate < 0) {
            return validate;
        } else {
            handleprocess(expertise);
            return 1;
        }
    }

    private void prepare(Expertise expertise) {
        try {
            for (ConseilScientifique conseilScientifique : expertise.getScientifiques()) {
                NatureExpertise natureExpertise = natureExpertiseService.findByCode(conseilScientifique.getNatureExpertise().getCode());
                conseilScientifique.setNatureExpertise(natureExpertise);
            }
            Chercheur chercheur = chercheurService.findByLogin(expertise.getChercheur().getLogin());
            expertise.setChercheur(chercheur);
            Campagne campagne = campagneService.findByEtatCampagneCode(expertise.getCampagne().getEtatCampagne().getCode());
            expertise.setCampagne(campagne);
        }  catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private int validate(Expertise expertise) {
        if (expertise == null) {
            return -1;
        } else if (expertise.getCampagne().getEtatCampagne().getCode() == null) {
            return -2;
        } else if (expertise.getChercheur().getLogin() == null) {
            return -3;
        } else
            return 1;
    }

    private void handleprocess(Expertise expertise) {
        expertiseDao.save(expertise);
    }
// End method save

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
    @Autowired
    private ChercheurService chercheurService;
    @Autowired
    private CampagneService campagneService;
    @Autowired
    private NatureExpertiseService natureExpertiseService;


}