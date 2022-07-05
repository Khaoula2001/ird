package com.example.ird.service.fasade;

import com.example.ird.bean.Chercheur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChercheurService {
    Chercheur findByLogin(String login);

    List<Chercheur> findByPrenom(String prenom);

    List<Chercheur> findByNom(String nom);

    int deleteByLogin(String login);

    int deleteByPrenom(String prenom);

    int deleteByNom(String nom);

    Chercheur save(Chercheur chercheur);

}
