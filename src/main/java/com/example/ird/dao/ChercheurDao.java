package com.example.ird.dao;


import com.example.ird.bean.Chercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChercheurDao extends JpaRepository<Chercheur, Long> {
    Chercheur findByLogin(String login);

    List<Chercheur> findByPrenom(String prenom);

    List<Chercheur> findByNom(String nom);

    int deleteByLogin(String login);

    int deleteByPrenom(String prenom);

    int deleteByNom(String nom);
}
