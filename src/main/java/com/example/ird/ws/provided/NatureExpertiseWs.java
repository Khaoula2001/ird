package com.example.ird.ws.provided;

import com.example.ird.bean.NatureExpertise;
import com.example.ird.service.fasade.NatureExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nature-expertise")
public class NatureExpertiseWs {
    @PostMapping("/")
    public int save(@RequestBody NatureExpertise natureexpertise) {
        return natureExpertiseService.save(natureexpertise);
    }

    @GetMapping("/findAll")
    public List<NatureExpertise> findAll() {
        return natureExpertiseService.findAll();
    }

    @GetMapping("/findByCode/{code}")
    public NatureExpertise findByCode(@PathVariable String code) {
        return natureExpertiseService.findByCode(code);
    }
    @DeleteMapping("/delete/{code}")
    public int deleteByCode(@PathVariable String code) {
        return natureExpertiseService.deleteByCode(code);
    }

    @Autowired
    private NatureExpertiseService natureExpertiseService;
}
