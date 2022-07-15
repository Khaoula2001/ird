package com.example.ird.service.impl;

import com.example.ird.bean.Campagne;
import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import com.example.ird.bean.EtatCampagne;
import com.example.ird.dao.CampagneDao;
import com.example.ird.service.facade.CampagneChercheurOuvertureService;
import com.example.ird.service.facade.CampagneSaveProcess;
import com.example.ird.service.facade.ChercheurService;
import com.example.ird.service.facade.EtatCampagneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampagneSaveProcessImpl  implements CampagneSaveProcess {

    @Override
    public int Exec(Campagne campagne) {
        prepareSave(campagne);
        int resultat = validateSave(campagne);
        if (resultat > 0) {
            handelProcessSave(campagne);
        }
        return resultat;
    }

    private void handelProcessSave(Campagne campagne) {
        campagneDao.save(campagne);
        for (CampagneChercheurOuverture c : campagne.getCampagneChercheurOuvertureList()) {
            c.setCampagne(campagne);
            campagneChercheurOuvertureService.save(c);
        }

    }

    private int validateSave(Campagne campagne) {
        if (campagne.getEtatCampagne() != null) {
            return -1;
        } else if (campagne.getCampagneChercheurOuvertureList() == null || campagne.getCampagneChercheurOuvertureList().isEmpty()) {
            return -2;
        } else if (countChercheurNotExist(campagne.getCampagneChercheurOuvertureList()) > 0) {
            return -3;
        } else {
            return 1;
        }
    }

    private int countChercheurNotExist(List<CampagneChercheurOuverture> campagneChercheurOuvertureList) {
        int cmp = 0;
        for (CampagneChercheurOuverture c : campagneChercheurOuvertureList) {
            if (c.getChercheur() == null) {
                cmp++;
            }
        }
        return cmp;
    }

    private void prepareSave(Campagne campagne) {
        EtatCampagne loadedEtatCampagne = etatCampagneService.findByCode(campagne.getEtatCampagne().getCode());
        campagne.setEtatCampagne(loadedEtatCampagne);
        for (CampagneChercheurOuverture c : campagne.getCampagneChercheurOuvertureList()) {
            Chercheur loadedchercheur = chercheurService.findByEmail(c.getChercheur().getEmail());
            c.setChercheur(loadedchercheur);
        }
    }


    @Override
    public Campagne findByEtatCampagneCode(String code) {
        return campagneDao.findByEtatCampagneCode(code);
    }


    @Autowired
    private CampagneDao campagneDao;
    @Autowired
    private EtatCampagneService etatCampagneService;
    @Autowired
    private ChercheurService chercheurService;
    @Autowired
    private CampagneChercheurOuvertureService campagneChercheurOuvertureService;
}