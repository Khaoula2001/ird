package com.example.ird.ws.provided;


import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import com.example.ird.service.facade.CampagneChercheurOuvertureService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/campagneChercheurOuverture")

public class CampagneChercheurOuvertureWs {
    @Autowired
    private CampagneChercheurOuvertureService campagneChercheurOuvertureService;

    @GetMapping("/dateDebut/{dateDebut}")

    public List<CampagneChercheurOuverture> findByCampagneDateDebut(@PathVariable Date dateDebut) {
        return campagneChercheurOuvertureService.findByCampagneDateDebut(dateDebut);
    }

    @GetMapping("/dateFin/{dateFin}")


    public List<CampagneChercheurOuverture> findByCampagneDateFin(@PathVariable Date dateFin) {
        return campagneChercheurOuvertureService.findByCampagneDateFin(dateFin);
    }

    @DeleteMapping("/dateDebut/{dateDebut}")
    @Transactional
    public int deleteByCampagneDateDebut(@PathVariable Date dateDebut) {
        return campagneChercheurOuvertureService.deleteByCampagneDateDebut(dateDebut);
    }

    @DeleteMapping("/dateFin/{dateFin}")
    @Transactional

    public int deleteByCampagneDateFin(@PathVariable Date dateFin) {
        return campagneChercheurOuvertureService.deleteByCampagneDateFin(dateFin);
    }

    @GetMapping("/login/{login}")

    public Chercheur findByChercheurLogin(@PathVariable String login) {
        return campagneChercheurOuvertureService.findByChercheurLogin(login);
    }

    @GetMapping("/nom/{nom}")

    public Chercheur findByChercheurNom(@PathVariable String nom) {
        return campagneChercheurOuvertureService.findByChercheurNom(nom);
    }

    @GetMapping("/prenom/{prenom}")

    public Chercheur findByChercheurPrenom(@PathVariable String prenom) {
        return campagneChercheurOuvertureService.findByChercheurPrenom(prenom);
    }

    @GetMapping("/email/{email}")

    public Chercheur findByChercheurEmail(@PathVariable String email) {
        return campagneChercheurOuvertureService.findByChercheurEmail(email);
    }

    @DeleteMapping("/login/{login}")
    @Transactional

    public int deleteByChercheurLogin(@PathVariable String login) {
        return campagneChercheurOuvertureService.deleteByChercheurLogin(login);
    }

    @DeleteMapping("/nom/{nom}")
    @Transactional

    public int deleteByChercheurNom(@PathVariable String nom) {
        return campagneChercheurOuvertureService.deleteByChercheurNom(nom);
    }

    @DeleteMapping("/prenom/{prenom}")
    @Transactional

    public int deleteByChercheurPrenom(@PathVariable String prenom) {
        return campagneChercheurOuvertureService.deleteByChercheurPrenom(prenom);
    }

    @DeleteMapping("/email/{email}")
    @Transactional
    public int deleteByChercheurEmail(@PathVariable String email) {
        return campagneChercheurOuvertureService.deleteByChercheurEmail(email);
    }

    @PostMapping("/")

    public CampagneChercheurOuverture save(@RequestBody CampagneChercheurOuverture campagneChercheurOuverture) {
        return campagneChercheurOuvertureService.save(campagneChercheurOuverture);
    }
}
