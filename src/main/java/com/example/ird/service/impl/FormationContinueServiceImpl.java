package com.example.ird.service.impl;


import com.example.ird.bean.FormationContinue;
import com.example.ird.dao.FormationContinueDao;
import com.example.ird.service.fasade.FormationContinueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class FormationContinueServiceImpl implements FormationContinueService {
    @Autowired
    private FormationContinueDao formationContinueDao;

    @Override
    public FormationContinue save(FormationContinue formationContinue) {
        return formationContinueDao.save(formationContinue);

    }

    @Override
    public FormationContinue findByDureeEstime(double dureeEstime) {
        return formationContinueDao.findByDureeEstime(dureeEstime);
    }

    @Override
    public FormationContinue findByDescription(String description) {
        return formationContinueDao.findByDescription(description);
    }

    @Override
    public List<FormationContinue> findByChercheurEmail(String email) {
        return formationContinueDao.findByChercheurEmail(email);
    }

    @Override
    public List<FormationContinue> findByCampagneDateDebut(Date dateDebut) {
        return formationContinueDao.findByCampagneDateDebut(dateDebut);
    }

    @Override
    @Transactional
    public int deleteByDureeEstime(double dureeEstime) {
        return formationContinueDao.deleteByDureeEstime(dureeEstime);
    }

    @Override
    @Transactional
    public int deleteByDescription(String description) {
        return formationContinueDao.deleteByDescription(description);
    }

    public List<FormationContinue> findAll() {
        return formationContinueDao.findAll();
    }
}
