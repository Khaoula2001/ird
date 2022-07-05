package com.example.ird.dao;


import com.example.ird.bean.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CampagneDao extends JpaRepository<Campagne, Long> {
    List<Campagne> findByDateDebut(Date dateDebut);

    List<Campagne> findByDateFin(Date dateFin);

    int deleteByDateDebut(Date dateDebut);

    int deleteByDateFin(Date dateFin);

}
