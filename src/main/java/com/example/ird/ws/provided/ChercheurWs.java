package com.example.ird.ws.provided;


import com.example.ird.bean.Chercheur;
import com.example.ird.service.fasade.ChercheurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/chercheur")
public class ChercheurWs {
    @Autowired
    private ChercheurService chercheurService;


    @GetMapping("/login/{login}")
    public Chercheur findByLogin(@PathVariable String login) {
        return chercheurService.findByLogin(login);
    }

    @GetMapping("/prenom/{prenom}")

    public List<Chercheur> findByPrenom(@PathVariable String prenom) {
        return chercheurService.findByPrenom(prenom);
    }


    @GetMapping("/nom/{nom}")

    public List<Chercheur> findByNom(@PathVariable String nom) {
        return chercheurService.findByNom(nom);
    }

    @DeleteMapping("/login/{login}")
    public int deleteByLogin(@PathVariable String login) {
        return chercheurService.deleteByLogin(login);
    }

    @DeleteMapping("/prenom/{prenom}")

    public int deleteByPrenom(@PathVariable String prenom) {
        return chercheurService.deleteByPrenom(prenom);
    }

    @DeleteMapping("/nom/{nom}")

    public int deleteByNom(@PathVariable String nom) {
        return chercheurService.deleteByNom(nom);
    }

    @PostMapping("/")
    public Chercheur save(@RequestBody Chercheur chercheur) {
        return chercheurService.save(chercheur);
    }
}
