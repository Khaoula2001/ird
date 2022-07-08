package com.example.ird.service.facade;

import com.example.ird.bean.Enseignement;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface EnseignementService {
    Enseignement save(Enseignement enseignement);

    Enseignement findByIntitule(String intitule);

    Enseignement findByDescription(String description);

    List<Enseignement> findByChercheurEmail(String email);

    List<Enseignement> findByCampagneDateDebut(Date dateDebut);

    @Transactional
    int deleteByIntitule(String intitule);

    @Transactional
    int deleteByDescription(String description);
}
