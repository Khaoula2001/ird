package com.example.ird.dao;

import com.example.ird.bean.Enseignement;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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


    @Query("SELECT SUM(e.dureeEstime) FROM Enseignement e WHERE e.chercheur.id =:chercheurId AND e.campagne.id=:campagneId")
    double findSumDureeEstimeByChercheurIdAndCampagneId(Long chercheurId, Long campagneId);


}
