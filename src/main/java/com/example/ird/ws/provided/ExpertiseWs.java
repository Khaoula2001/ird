package com.example.ird.ws.provided;

import com.example.ird.bean.ConseilScientifique;
import com.example.ird.bean.Expertise;
import com.example.ird.service.facade.ExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expertise")
public class ExpertiseWs {

    @GetMapping("/findAll")
    public List<Expertise> findAll() {
        return expertiseService.findAll();
    }
    @DeleteMapping("/deleteById/{id}")
    public int deleteById(@PathVariable Long id) {
        return expertiseService.deleteById(id);
    }

    @GetMapping("/findById/{id}")
    public Expertise findById(@PathVariable Long id) {
        return expertiseService.findById(id);
    }

    @PutMapping("/update")
        public Expertise update(@RequestBody Expertise expertise) {
        return expertiseService.update(expertise);
    }

    @PostMapping("/search")
    public List<Expertise> findByCriteria(@RequestBody Expertise expertise) {
        return expertiseService.findByCriteria(expertise);
    }

    @Autowired
    private ExpertiseService expertiseService;
}