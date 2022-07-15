package com.example.ird.service.impl;

import com.example.ird.bean.ConseilScientifique;
import com.example.ird.bean.Expertise;
import com.example.ird.bean.NatureExpertise;
import com.example.ird.dao.ConseilScientifiqueDao;
import com.example.ird.service.facade.ConseilScientifiqueService;
import com.example.ird.service.facade.ExpertiseService;
import com.example.ird.service.facade.NatureExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConseilScientifiqueServiceImpl implements ConseilScientifiqueService {

    // beg save
    @Override
    public int save(ConseilScientifique conseilScientifique) {
        prepare(conseilScientifique);
        int validate = validate(conseilScientifique);
        if (validate < 0) {
            return validate;
        } else {
            handlprocess(conseilScientifique);
            return validate;
        }
    }

    private void prepare(ConseilScientifique conseilScientifique) {
        NatureExpertise natureExpertise = natureExpertiseService.findByCode(conseilScientifique.getNatureExpertise().getCode());
        conseilScientifique.setNatureExpertise(natureExpertise);
    }

    private int validate(ConseilScientifique natureexpertise) {
        return 0;
    }

    private void handlprocess(ConseilScientifique natureexpertise) {
        conseilScientifiqueDao.save(natureexpertise);
    }
// end save

    @Override
    public List<ConseilScientifique> findAll() {
        return conseilScientifiqueDao.findAll();
    }

    public ConseilScientifique findByNatureExpertise(NatureExpertise natureExpertise) {
        return conseilScientifiqueDao.findByNatureExpertise(natureExpertise);
    }

    @Autowired
    private ConseilScientifiqueDao conseilScientifiqueDao;
    @Autowired
    private NatureExpertiseService natureExpertiseService;
    @Autowired
    private ExpertiseService expertiseService;
}