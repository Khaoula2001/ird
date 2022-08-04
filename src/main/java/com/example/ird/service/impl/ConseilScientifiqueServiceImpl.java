package com.example.ird.service.impl;

import com.example.ird.bean.ConseilScientifique;
import com.example.ird.bean.Expertise;
import com.example.ird.dao.ConseilScientifiqueDao;
import com.example.ird.service.facade.ConseilScientifiqueService;
import com.example.ird.service.util.SearchUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ConseilScientifiqueServiceImpl implements ConseilScientifiqueService {

    @Override
    public List<ConseilScientifique> findAll() {
        return conseilScientifiqueDao.findAll();
    }

    @Override
    @Transactional
    public int deleteById(Long id) {
        int res = 0;
        if (conseilScientifiqueDao.findById(id).isPresent()) {
            conseilScientifiqueDao.deleteById(id);
            res = 1;
        }
        return res;
    }

    @Override
    public ConseilScientifique findById(Long id) {
        Optional<ConseilScientifique> optConseilScientifique = conseilScientifiqueDao.findById(id);
        ConseilScientifique conseilScientifique = null;
        if (optConseilScientifique.isPresent()) {
            conseilScientifique = optConseilScientifique.get();
            return conseilScientifique;
        } else {
            return conseilScientifique;
        }

    }

    @Override
    public ConseilScientifique update(ConseilScientifique conseilScientifique) {
        if (findById(conseilScientifique.getId()) != null) {
            conseilScientifique.setId(conseilScientifique.getId());
            return conseilScientifiqueDao.save(conseilScientifique);
        } else {
            return null;
        }
    }

    //    Search
    @Override
    public List<ConseilScientifique> findByCriteria(ConseilScientifique conseilScientifique) {
        String query = "SELECT o FROM ConseilScientifique o where 1=1 ";

        query += SearchUtil.addConstraint("o", "id", "=", conseilScientifique.getId());
        query += SearchUtil.addConstraint("o", "descriptif", "LIKE", conseilScientifique.getDescriptif());
        query += SearchUtil.addConstraint("o", "intitule", "LIKE", conseilScientifique.getIntitule());
        return entityManager.createQuery(query).getResultList();
    }

    @Autowired
    private ConseilScientifiqueDao conseilScientifiqueDao;
    @PersistenceContext
    private EntityManager entityManager;
}
