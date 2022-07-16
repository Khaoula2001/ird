package com.example.ird.service.impl;


import com.example.ird.bean.Campagne;
import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import com.example.ird.bean.EtatCampagne;
import com.example.ird.dao.CampagneDao;
import com.example.ird.service.facade.CampagneChercheurOuvertureService;
import com.example.ird.service.facade.CampagneService;
import com.example.ird.service.facade.ChercheurService;
import com.example.ird.service.facade.EtatCampagneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CampagneServiceImpl implements CampagneService {
    @Autowired
    private CampagneDao campagneDao;



    @Override
    public Campagne save(Campagne campagne) {
        return campagneDao.save(campagne);
    }




    @Override
    public List<Campagne> findByDateDebut(Date dateDebut) {
        return campagneDao.findByDateDebut(dateDebut);
    }

    @Override
    public List<Campagne> findByEtatCampagneCode(String code) {
        return campagneDao.findByEtatCampagneCode(code);
    }

    @Override
    public List<Campagne> findByDateFin(Date dateFin) {
        return campagneDao.findByDateFin(dateFin);
    }

    @Override
    @Transactional
    public int deleteByDateDebut(Date dateDebut) {
        return campagneDao.deleteByDateDebut(dateDebut);
    }

    @Override
    @Transactional
    public int deleteByDateFin(Date dateFin) {
        return campagneDao.deleteByDateFin(dateFin);
    }

    public List<Campagne> findAll() {
        return campagneDao.findAll();
    }
}
