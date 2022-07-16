package com.example.ird.service.facade;

import com.example.ird.bean.Chercheur;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.transaction.Transactional;

@Service
public interface ChercheurService {

    Chercheur findByEmail(String email);

    Chercheur findByLogin(String login);

    List<Chercheur> findByPrenom(String prenom);

    List<Chercheur> findByNom(String nom);

    int deleteByLogin(String login);

    Chercheur save(Chercheur chercheur);

    @Transactional
    int deleteByPrenom(String prenom);

    @Transactional
    int deleteByNom(String nom);

    List<Chercheur> findAll();
}
