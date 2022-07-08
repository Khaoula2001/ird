package com.example.ird.ws.provided;

import com.example.ird.service.fasade.ConseilScientifiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ConseilScientifiqueWs {

    @Autowired
    private ConseilScientifiqueService conseilScientifiqueService;
}
