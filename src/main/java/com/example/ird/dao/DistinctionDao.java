package com.example.ird.dao;

import com.example.ird.bean.Distinction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DistinctionDao extends JpaRepository<Distinction, Long> {

    @Query("SELECT SUM(d.dureeEstime) FROM Distinction d WHERE d.chercheur.id =:chercheurId AND d.campagne.id=:campagneId")
    double findSumDureeEstimeByChercheurIdAndCampagneId(Long chercheurId, Long campagneId);

    Distinction findByLibelle(String libelle);

    Distinction findByDescription(String description);

    List<Distinction> findByChercheurEmail(String email);

    List<Distinction> findByCampagneDateDebut(Date dateDebut);

    int deleteByLibelle(String libelle);

    @Query("select Sum(d.dureeEstime) from Distinction d where d.chercheur.id =: chercheurId and d.campagne.id =: campagneId")
    double findSumDureeEstimeByChercheurIdAndCampagneId(Long checheurId , Long campagneId);

}
