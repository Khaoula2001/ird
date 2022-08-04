package com.example.ird.ws.provided;


import com.example.ird.bean.FormationContinue;
import com.example.ird.service.facade.FormationContinueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/formationContinue")
public class FormationContinueWs {
    @Autowired
    private FormationContinueService formationContinueService;

    @GetMapping("/dureeEstime/{dureeEstime}")
    public FormationContinue findByDureeEstime(@PathVariable double dureeEstime) {
        return formationContinueService.findByDureeEstime(dureeEstime);
    }

    @GetMapping("/description/{description}")

    public FormationContinue findByDescription(@PathVariable String description) {
        return formationContinueService.findByDescription(description);
    }

    @GetMapping("/email/{email}")

    public List<FormationContinue> findByChercheurEmail(@PathVariable String email) {
        return formationContinueService.findByChercheurEmail(email);
    }

    @GetMapping("/dateDebut/{dateDebut}")

    public List<FormationContinue> findByCampagneDateDebut(@PathVariable Date dateDebut) {
        return formationContinueService.findByCampagneDateDebut(dateDebut);
    }

    @DeleteMapping("/dureeEstime/{dureeEstime}")
    @Transactional
    public int deleteByDureeEstime(@PathVariable double dureeEstime) {
        return formationContinueService.deleteByDureeEstime(dureeEstime);
    }

    @DeleteMapping("/description/{description}")
    @Transactional
    public int deleteByDescription(@PathVariable String description) {
        return formationContinueService.deleteByDescription(description);
    }

    @PostMapping("/")
    public FormationContinue save(@RequestBody FormationContinue formationContinue) {
        return formationContinueService.save(formationContinue);
    }
}
