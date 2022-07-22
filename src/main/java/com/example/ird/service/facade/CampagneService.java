package com.example.ird.service.facade;

import com.example.ird.bean.Campagne;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface CampagneService {
    Campagne save(Campagne campagne);
    Campagne findByEtatCampagneCode(String code);
    List<Campagne> findByDateDebut(Date dateDebut);

    List<Campagne> findByDateFin(Date dateFin);

    @Transactional
    int deleteByDateDebut(Date dateDebut);

    @Transactional
    int deleteByDateFin(Date dateFin);
}
