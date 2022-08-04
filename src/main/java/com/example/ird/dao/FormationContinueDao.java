package com.example.ird.dao;

import com.example.ird.bean.FormationContinue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FormationContinueDao extends JpaRepository<FormationContinue, Long> {

    @Query("SELECT SUM(f.dureeEstime) FROM FormationContinue f WHERE f.chercheur.id =:chercheurId AND f.campagne.id=:campagneId")
    double findSumDureeEstimeByChercheurIdAndCampagneId(Long chercheurId, Long campagneId);

    FormationContinue findByDureeEstime(double dureeEstime);

    FormationContinue findByDescription(String description);


    List<FormationContinue> findByChercheurEmail(String email);

    List<FormationContinue> findByCampagneDateDebut(Date dateDebut);


    int deleteByDureeEstime(double dureeEstime);

    int deleteByDescription(String description);

}
