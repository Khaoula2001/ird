package com.example.ird.dao;

import com.example.ird.bean.Distinction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DistinctionDao extends JpaRepository<Distinction, Long> {
    Distinction findByLibelle(String libelle);

    Distinction findByDescription(String description);

    List<Distinction> findByChercheurEmail(String email);

    List<Distinction> findByCampagneDateDebut(Date dateDebut);

    int deleteByLibelle(String libelle);

}
