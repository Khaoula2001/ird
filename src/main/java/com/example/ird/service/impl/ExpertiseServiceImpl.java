package com.example.ird.service.impl;

import com.example.ird.bean.*;
import com.example.ird.dao.ExpertiseDao;
import com.example.ird.service.facade.ExpertiseService;
import com.example.ird.service.util.SearchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ExpertiseServiceImpl implements ExpertiseService {
    //    find all method8
    @Override
    public List<Expertise> findAll() {
        return expertiseDao.findAll();
    }

    @Override
    public List<Expertise> findByCriteria(Expertise expertise) {
        String query = "SELECT o FROM Expertise o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", expertise.getId());
        query += SearchUtil.addConstraint("o", "tempsEstimal", "=", expertise.getTempsEstimal());
        query += SearchUtil.addConstraint("o", "annee", "=", expertise.getAnnee());
        query += SearchUtil.addConstraint("o", "libelle", "LIKE", expertise.getLibelle());
        return entityManager.createQuery(query).getResultList();
    }

    //    Method delete
    @Override
    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (expertiseDao.findById(id).isPresent()) {
            expertiseDao.deleteById(id);
            res = 1;
        }
        return res;
    }
    //

    @Override
    public Expertise findById(Long id) {
        Optional<Expertise> optExpertise = expertiseDao.findById(id);
        Expertise expertise = null;
        if (optExpertise.isPresent()) {
            expertise = optExpertise.get();
            return expertise;
        } else {
            return expertise;
        }

    }

    @Override
    public Expertise update(Expertise expertise) {
        if (findById(expertise.getId()) != null) {
            expertise.setId(expertise.getId());
            return expertiseDao.save(expertise);
        } else {
            return null;
        }
    }

    @Autowired
    private ExpertiseDao expertiseDao;
    @PersistenceContext
    private EntityManager entityManager;

}