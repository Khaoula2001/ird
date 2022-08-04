package com.example.ird.service.impl;

import com.example.ird.bean.*;
import com.example.ird.dao.ConseilScientifiqueDao;
import com.example.ird.service.facade.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConseilScientifiqueSaveProcessImpl implements ConseilScientifiqueSaveProcess {
    // beg save
    @Override
    public ConseilScientifique save(ConseilScientifique conseilScientifique) {
        prepare(conseilScientifique);
        int validate = validate(conseilScientifique);
        if(validate < 0) {
            return null;
        } else {
            handlprocess(conseilScientifique);
            return conseilScientifique;
        }
    }

    private void prepare(ConseilScientifique conseilScientifique) {
        try {
            NatureExpertise natureExpertise = natureExpertiseService.findByCode("c1");
            conseilScientifique.setNatureExpertise(natureExpertise);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private int validate(ConseilScientifique conseilScientifique) {
        if (conseilScientifique == null) {
            return -1;
        } else if (natureExpertiseService.findByCode(conseilScientifique.getNatureExpertise().getCode()) == null) {
            return -2;
        } else
            return 1;
    }

    private void handlprocess(ConseilScientifique conseilScientifique) {
        conseilScientifiqueDao.save(conseilScientifique);
    }
// end save



    @Autowired
    private ConseilScientifiqueDao conseilScientifiqueDao;
    @Autowired
    private NatureExpertiseService natureExpertiseService;


}
