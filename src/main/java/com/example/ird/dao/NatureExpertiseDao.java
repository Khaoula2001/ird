package com.example.ird.dao;

import com.example.ird.bean.Expertise;
import com.example.ird.bean.NatureExpertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NatureExpertiseDao extends JpaRepository<NatureExpertise, Long> {
    int deleteByCode(String code);

    List<NatureExpertise> findAll();

    NatureExpertise findByCode(String code);
}

