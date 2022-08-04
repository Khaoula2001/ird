package com.example.ird.ws.provided;

import com.example.ird.bean.ConseilScientifique;
import com.example.ird.service.facade.ConseilScientifiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/conseil-scientifique")
public class ConseilScientifiqueWs {

    @GetMapping("/findAll")
    public List<ConseilScientifique> findAll() {
        return conseilScientifiqueService.findAll();
    }

    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable Long id) {
        return conseilScientifiqueService.deleteById(id);
    }

    @GetMapping("/findById/{id}")
    public ConseilScientifique findById(@PathVariable Long id) {
        return conseilScientifiqueService.findById(id);
    }

    @PutMapping("/update")
    public ConseilScientifique update(@RequestBody ConseilScientifique conseilScientifique) {
        return conseilScientifiqueService.update(conseilScientifique);
    }

    @PostMapping("/search")
    public List<ConseilScientifique> findByCriteria(@RequestBody ConseilScientifique conseilScientifique) {
        return conseilScientifiqueService.findByCriteria(conseilScientifique);
    }

    @Autowired
    private ConseilScientifiqueService conseilScientifiqueService;
}
