package com.example.ird.ws.provided;


import com.example.ird.bean.Campagne;
import com.example.ird.service.facade.CampagneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/campagne")
public class CampagneWs {
    @Autowired
    private CampagneService campagneService;

    public List<Campagne> findByDateDebut(Date dateDebut) {
        return campagneService.findByDateDebut(dateDebut);
    }

    public List<Campagne> findByDateFin(Date dateFin) {
        return campagneService.findByDateFin(dateFin);
    }

    public int deleteByDateDebut(Date dateDebut) {
        return campagneService.deleteByDateDebut(dateDebut);
    }

    public int deleteByDateFin(Date dateFin) {
        return campagneService.deleteByDateFin(dateFin);
    }

    public Campagne save(Campagne campagne) {
        return campagneService.save(campagne);
    }
}
