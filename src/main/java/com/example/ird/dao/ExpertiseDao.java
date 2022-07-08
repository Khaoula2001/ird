package com.example.ird.dao;

import com.example.ird.bean.Expertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpertiseDao extends JpaRepository<Expertise, Long> {

    List<Expertise> findAll();
    Expertise findByCampagneEtatCampagneCode(String code);

}
