package com.example.ird.service.facade;

import com.example.ird.bean.Chercheur;

import javax.transaction.Transactional;
import java.util.List;

public interface ChercheurService {
    Chercheur findByEmail(String email);

    Chercheur findByLogin(String login);

    List<Chercheur> findByPrenom(String prenom);

    List<Chercheur> findByNom(String nom);

    int deleteByLogin(String login);

    @Transactional
    int deleteByPrenom(String prenom);

    @Transactional
    int deleteByNom(String nom);

    @Transactional
    Chercheur save(Chercheur chercheur);

    List<Chercheur> findAll();
}
