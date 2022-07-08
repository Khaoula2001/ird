package com.example.ird.ws.provided;


import com.example.ird.bean.FormationContinue;
import com.example.ird.service.facade.FormationContinueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/formationContinue")
public class FormationContinueWs {
    @Autowired
    private FormationContinueService formationContinueService;

    public FormationContinue findByDureeEstime(double dureeEstime) {
        return formationContinueService.findByDureeEstime(dureeEstime);
    }

    public FormationContinue findByDescription(String description) {
        return formationContinueService.findByDescription(description);
    }

    public List<FormationContinue> findByChercheurEmail(String email) {
        return formationContinueService.findByChercheurEmail(email);
    }

    public List<FormationContinue> findByCampagneDateDebut(Date dateDebut) {
        return formationContinueService.findByCampagneDateDebut(dateDebut);
    }

    public int deleteByDureeEstime(double dureeEstime) {
        return formationContinueService.deleteByDureeEstime(dureeEstime);
    }

    public int deleteByDescription(String description) {
        return formationContinueService.deleteByDescription(description);
    }

    public FormationContinue save(FormationContinue formationContinue) {
        return formationContinueService.save(formationContinue);
    }
}
