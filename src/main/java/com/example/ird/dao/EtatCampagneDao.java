package com.example.ird.dao;

import com.example.ird.bean.EtatCampagne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatCampagneDao extends JpaRepository<EtatCampagne, Long> {
    EtatCampagne findByCode(String code);
    int deleteByCode(String code);

}
