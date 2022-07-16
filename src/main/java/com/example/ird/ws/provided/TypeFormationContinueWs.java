package com.example.ird.ws.provided;


import com.example.ird.bean.TypeDistinction;
import com.example.ird.service.facade.TypeDistinctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/api/v1/typeFormationContinue")
public class TypeFormationContinueWs {
    @Autowired
    private TypeDistinctionService typeDistinctionService;

    @GetMapping("/code/{code}")

    public TypeDistinction findByCode(@PathVariable String code) {
        return typeDistinctionService.findByCode(code);
    }

    @GetMapping("/libelle/{libelle}")

    public TypeDistinction findByLibelle(@PathVariable String libelle) {
        return typeDistinctionService.findByLibelle(libelle);
    }

    @DeleteMapping("/code/{code}")
    @Transactional
    public int deleteByCode(@PathVariable String code) {
        return typeDistinctionService.deleteByCode(code);
    }

    @DeleteMapping("/libelle/{libelle}")
    @Transactional
    public int deleteByLibelle(@PathVariable String libelle) {
        return typeDistinctionService.deleteByLibelle(libelle);
    }

    @PostMapping("/")

    public TypeDistinction save(@RequestBody TypeDistinction typeDistinction) {
        return typeDistinctionService.save(typeDistinction);
    }
}
