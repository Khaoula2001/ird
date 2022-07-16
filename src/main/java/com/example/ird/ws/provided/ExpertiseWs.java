package com.example.ird.ws.provided;

import com.example.ird.bean.Expertise;
import com.example.ird.service.facade.ExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expertise")
public class ExpertiseWs {

    @PostMapping("/")
    public int save(@RequestBody Expertise expertise) {
        return expertiseService.save(expertise);
    }

    @GetMapping("/findAll")
    public List<Expertise> findAll() {
        return expertiseService.findAll();
    }

    @Autowired
    private ExpertiseService expertiseService;
}
