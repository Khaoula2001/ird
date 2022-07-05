package com.example.ird.dao;

import com.example.ird.bean.FormationContinue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FormationContinueDao extends JpaRepository<FormationContinue, Long> {
    FormationContinue findByDureeEstime(double dureeEstime);

    FormationContinue findByDescription(String description);


    List<FormationContinue> findByChercheurEmail(String email);

    List<FormationContinue> findByCampagneDateDebut(Date dateDebut);


    int deleteByDureeEstime(double dureeEstime);

    int deleteByDescription(String description);
}
