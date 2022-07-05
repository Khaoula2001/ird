package com.example.ird.service.fasade;

import com.example.ird.bean.Enseignement;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface EnseignementService {

    Enseignement findByIntitule(String intitule);

    Enseignement findByDescription(String description);


    List<Enseignement> findByChercheurEmail(String email);

    List<Enseignement> findByCampagneDateDebut(Date dateDebut);


    int deleteByIntitule(String intitule);

    int deleteByDescription(String description);

    Enseignement save(Enseignement enseignement);


}
