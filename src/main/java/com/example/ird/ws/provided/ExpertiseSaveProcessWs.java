package com.example.ird.ws.provided;

import com.example.ird.bean.Expertise;
import com.example.ird.service.facade.ExpertiseSaveProcess;
import com.example.ird.service.facade.ExpertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expertise")
public class ExpertiseSaveProcessWs {

    @PostMapping("/")
    public Expertise save(@RequestBody Expertise expertise) {
        return expertiseSaveProcess.save(expertise);
    }

    @Autowired
    private ExpertiseSaveProcess expertiseSaveProcess;
}