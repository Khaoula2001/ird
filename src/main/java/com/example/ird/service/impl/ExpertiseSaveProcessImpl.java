package com.example.ird.service.impl;

import com.example.ird.bean.*;
import com.example.ird.dao.ExpertiseDao;
import com.example.ird.service.facade.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertiseSaveProcessImpl implements ExpertiseSaveProcess {
    // Method save
    @Override
    public Expertise save(Expertise expertise) {
        prepare(expertise);
        int validate = validate(expertise);
        if (validate < 0) {
            return null;
        } else {
            handleprocess(expertise);
            return expertise;
        }
    }

    private void prepare(Expertise expertise) {
        try {
//            for (ConseilScientifique conseilScientifique : expertise.getScientifiques()) {
//                NatureExpertise natureExpertise = natureExpertiseService.findByCode(conseilScientifique.getNatureExpertise().getCode());
//                conseilScientifique.setNatureExpertise(natureExpertise);
//            }
            Chercheur chercheur = chercheurService.findByLogin("rr");
            expertise.setChercheur(chercheur);
            Campagne campagne = campagneService.findByEtatCampagneCode("en cours");
            expertise.setCampagne(campagne);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private int validate(Expertise expertise) {
        if (expertise == null) {
            return -1;
        } else if (expertise.getChercheur() == null) {
            return -2;
        } else
            return 1;
    }

    private void handleprocess(Expertise expertise) {
        expertiseDao.save(expertise);
    }
// End method save


    @Autowired
    private ExpertiseDao expertiseDao;
    @Autowired
    private ChercheurService chercheurService;
    @Autowired
    private CampagneService campagneService;
    @Autowired
    private NatureExpertiseService natureExpertiseService;


}
