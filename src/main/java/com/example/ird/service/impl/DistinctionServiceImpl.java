package com.example.ird.service.impl;

import com.example.ird.bean.Distinction;
import com.example.ird.dao.DistinctionDao;
import com.example.ird.service.facade.DistinctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DistinctionServiceImpl implements DistinctionService {

    @Autowired
    private DistinctionDao distinctionDao;

    @Override
    public Distinction findByLibelle(String libelle) {
        return distinctionDao.findByLibelle(libelle);
    }

    @Override
    public Distinction findByDescription(String description) {
        return distinctionDao.findByDescription(description);
    }


    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
        return distinctionDao.deleteByLibelle(libelle);
    }

    @Override
    public Distinction save(Distinction distinction) {
        return distinctionDao.save(distinction);
    }

    public List<Distinction> findAll() {
        return distinctionDao.findAll();
    }

    @Override
    public double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId, Long campagneId) {
        return distinctionDao.findSumDureeEstimeByChercheurIdAndCampagneId(checheurId, campagneId);
    }
}
