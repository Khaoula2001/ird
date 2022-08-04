package com.example.ird.ws.provided;

import com.example.ird.bean.Enseignement;
import com.example.ird.service.facade.EnseignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/enseignement")
public class EnseignementWs {
    @Autowired
    private EnseignementService enseignementService;

    @GetMapping("/intitule/{intitule}")

    public Enseignement findByIntitule(@PathVariable String intitule) {
        return enseignementService.findByIntitule(intitule);
    }

    @GetMapping("/description/{description}")

    public Enseignement findByDescription(@PathVariable String description) {
        return enseignementService.findByDescription(description);
    }

    @GetMapping("/email/{email}")

    public List<Enseignement> findByChercheurEmail(@PathVariable String email) {
        return enseignementService.findByChercheurEmail(email);
    }

    @GetMapping("/dateDebut/{dateDebut}")

    public List<Enseignement> findByCampagneDateDebut(@PathVariable Date dateDebut) {
        return enseignementService.findByCampagneDateDebut(dateDebut);
    }

    @DeleteMapping("/intitule/{intitule}")
    @Transactional
    public int deleteByIntitule(@PathVariable String intitule) {
        return enseignementService.deleteByIntitule(intitule);
    }

    @DeleteMapping("/description/{description}")
    @Transactional
    public int deleteByDescription(@PathVariable String description) {
        return enseignementService.deleteByDescription(description);
    }

    @PostMapping("/")
    public Enseignement save(@RequestBody Enseignement enseignement) {
        return enseignementService.save(enseignement);
    }
}
