package com.example.ird.dao;

import com.example.ird.bean.Enseignement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EnseignementDao extends JpaRepository<Enseignement, Long> {


    Enseignement findByIntitule(String intitule);

    Enseignement findByDescription(String description);


    List<Enseignement> findByChercheurEmail(String email);

    List<Enseignement> findByCampagneDateDebut(Date dateDebut);


    int deleteByIntitule(String intitule);

    int deleteByDescription(String description);


}
