package com.example.ird.ws.provided;

import com.example.ird.bean.ConseilScientifique;
import com.example.ird.service.facade.ConseilScientifiqueSaveProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/conseil-scientifique")
public class ConseilScientifiqueSaveProcessWs {


    @PostMapping("/")
    public ConseilScientifique save(@RequestBody ConseilScientifique natureexpertise) {
        return conseilScientifiqueSaveProcess.save(natureexpertise);
    }

    @Autowired
    private ConseilScientifiqueSaveProcess conseilScientifiqueSaveProcess;
}
