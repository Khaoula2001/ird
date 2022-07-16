package com.example.ird.service.facade;

import com.example.ird.bean.Chercheur;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChercheurService {
=======

import javax.transaction.Transactional;
import java.util.List;

public interface ChercheurService {
    Chercheur findByEmail(String email);

>>>>>>> origin/master
    Chercheur findByLogin(String login);

    List<Chercheur> findByPrenom(String prenom);

    List<Chercheur> findByNom(String nom);

    int deleteByLogin(String login);

<<<<<<< HEAD
    int deleteByPrenom(String prenom);

    int deleteByNom(String nom);

    Chercheur save(Chercheur chercheur);

    Chercheur findByEmail(String email);

=======
    @Transactional
    int deleteByPrenom(String prenom);

    @Transactional
    int deleteByNom(String nom);

    @Transactional
    Chercheur save(Chercheur chercheur);

>>>>>>> origin/master
    List<Chercheur> findAll();
}
