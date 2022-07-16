package com.example.ird.service.impl;

import com.example.ird.bean.ConseilScientifique;
import com.example.ird.dao.ConseilScientifiqueDao;
import com.example.ird.service.facade.ConseilScientifiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConseilScientifiqueServiceImpl implements ConseilScientifiqueService {

    // beg save
    @Override
    public int save(ConseilScientifique natureexpertise) {
        prepare(natureexpertise);
        int validate = validate(natureexpertise);
        if (validate < 0) {
            return validate;
        } else {
            handlprocess(natureexpertise);
            return validate;
        }
    }

    private void prepare(ConseilScientifique natureexpertise) {
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

    @Autowired
    private ConseilScientifiqueDao conseilScientifiqueDao;
}
