package com.example.ird.ws.provided;


import com.example.ird.bean.ModaliteEnseignement;
import com.example.ird.service.facade.ModaliteEnseignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api/v1/modaliteEnseignement")
public class ModaliteEnseignementWs {
    @Autowired
    private ModaliteEnseignementService modaliteEnseignementService;

    @GetMapping("/code/{code}")
    public ModaliteEnseignement findByCode(@PathVariable String code) {
        return modaliteEnseignementService.findByCode(code);
    }

    @GetMapping("/libelle/{libelle}")

    public ModaliteEnseignement findByLibelle(@PathVariable String libelle) {
        return modaliteEnseignementService.findByLibelle(libelle);
    }

    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return modaliteEnseignementService.deleteByCode(code);
    }

    @DeleteMapping("/libelle/{libelle}")
    @Transactional
    public int deleteByLibelle(@PathVariable String libelle) {
        return modaliteEnseignementService.deleteByLibelle(libelle);
    }

    @PostMapping("/")
    public ModaliteEnseignement save(@RequestBody ModaliteEnseignement modaliteEnseignement) {
        return modaliteEnseignementService.save(modaliteEnseignement);
    }
}
