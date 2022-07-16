package com.example.ird.ws.provided;


import com.example.ird.bean.Campagne;
import com.example.ird.service.facade.CampagneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/campagne")
public class CampagneWs {
    @Autowired
    private CampagneService campagneService;

    @GetMapping("/dateDebut/{dateDebut}")

    public List<Campagne> findByDateDebut(@PathVariable Date dateDebut) {
        return campagneService.findByDateDebut(dateDebut);
    }

    @GetMapping("/dateFin/{dateFin}")

    public List<Campagne> findByDateFin(@PathVariable Date dateFin) {
        return campagneService.findByDateFin(dateFin);
    }

    @DeleteMapping("/dateDebut/{dateDebut}")
    @Transactional

    public int deleteByDateDebut(@PathVariable Date dateDebut) {
        return campagneService.deleteByDateDebut(dateDebut);
    }

    @DeleteMapping("/dateFin/{dateFin}")
    @Transactional

    public int deleteByDateFin(@PathVariable Date dateFin) {
        return campagneService.deleteByDateFin(dateFin);
    }

    @PostMapping("/")

    public Campagne save(@RequestBody Campagne campagne) {
        return campagneService.save(campagne);
    }
}
