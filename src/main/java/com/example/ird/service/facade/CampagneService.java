package com.example.ird.service.facade;

import com.example.ird.bean.Campagne;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface CampagneService {

=======

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface CampagneService {
    Campagne save(Campagne campagne);
>>>>>>> origin/master

    List<Campagne> findByDateDebut(Date dateDebut);

    List<Campagne> findByDateFin(Date dateFin);

<<<<<<< HEAD
    int deleteByDateDebut(Date dateDebut);

    int deleteByDateFin(Date dateFin);

    Campagne save(Campagne campagne);
=======
    @Transactional
    int deleteByDateDebut(Date dateDebut);

    @Transactional
    int deleteByDateFin(Date dateFin);

    Campagne findByEtatCampagneCode(String code);

    List<Campagne> findAll();
>>>>>>> origin/master
}
