package com.example.ird.ws.provided;


import com.example.ird.bean.Distinction;
import com.example.ird.service.facade.DistinctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/Distinction")
public class DistinctionWs {
    @Autowired
    private DistinctionService distinctionService;

    @GetMapping("/libelle/{libelle}")
    public Distinction findByLibelle(String libelle) {
        return distinctionService.findByLibelle(libelle);
    }

    @GetMapping("/description/{description}")

    public Distinction findByDescription(String description) {
        return distinctionService.findByDescription(description);
    }


    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(String libelle) {
        return distinctionService.deleteByLibelle(libelle);
    }

    @PostMapping("/")
    public Distinction save(Distinction distinction) {
        return distinctionService.save(distinction);
    }
}
