package com.example.ird.service.fasade;

import com.example.ird.bean.FormationContinue;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface FormationContinueService {


    FormationContinue findByDureeEstime(double dureeEstime);

    FormationContinue findByDescription(String description);


    List<FormationContinue> findByChercheurEmail(String email);

    List<FormationContinue> findByCampagneDateDebut(Date dateDebut);


    int deleteByDureeEstime(double dureeEstime);

    int deleteByDescription(String description);

    FormationContinue save(FormationContinue formationContinue);
}
