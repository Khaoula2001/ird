package com.example.ird.ws.provided;

import com.example.ird.bean.Enseignement;
import com.example.ird.service.facade.EnseignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/enseignement")
public class EnseignementWs {
    @Autowired
    private EnseignementService enseignementService;

    public Enseignement findByIntitule(String intitule) {
        return enseignementService.findByIntitule(intitule);
    }

    public Enseignement findByDescription(String description) {
        return enseignementService.findByDescription(description);
    }

    public List<Enseignement> findByChercheurEmail(String email) {
        return enseignementService.findByChercheurEmail(email);
    }

    public List<Enseignement> findByCampagneDateDebut(Date dateDebut) {
        return enseignementService.findByCampagneDateDebut(dateDebut);
    }

    public int deleteByIntitule(String intitule) {
        return enseignementService.deleteByIntitule(intitule);
    }

    public int deleteByDescription(String description) {
        return enseignementService.deleteByDescription(description);
    }

    public Enseignement save(Enseignement enseignement) {
        return enseignementService.save(enseignement);
    }
}
