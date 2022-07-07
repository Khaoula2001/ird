package com.example.ird.service.impl;


import com.example.ird.bean.Chercheur;
import com.example.ird.dao.ChercheurDao;
import com.example.ird.service.fasade.ChercheurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ChercheurServiceImpl implements ChercheurService {
    @Autowired
    private ChercheurDao chercheurDao;

    @Override
    public Chercheur findByLogin(String login) {
        return chercheurDao.findByLogin(login);
    }

    @Override
    public List<Chercheur> findByPrenom(String prenom) {
        return chercheurDao.findByPrenom(prenom);
    }

    @Override
    public List<Chercheur> findByNom(String nom) {
        return chercheurDao.findByNom(nom);
    }

    @Override
    public int deleteByLogin(String login) {
        return chercheurDao.deleteByLogin(login);
    }

    @Override
    @Transactional
    public int deleteByPrenom(String prenom) {
        return chercheurDao.deleteByPrenom(prenom);
    }

    @Override
    @Transactional
    public int deleteByNom(String nom) {
        return chercheurDao.deleteByNom(nom);
    }

    @Override
    @Transactional
    public Chercheur save(Chercheur chercheur) {

      return  chercheurDao.save(chercheur);

    }

    public List<Chercheur> findAll() {
        return chercheurDao.findAll();
    }
}
