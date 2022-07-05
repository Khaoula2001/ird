package com.example.ird.ws.provided;


import com.example.ird.bean.TypeDistinction;
import com.example.ird.service.fasade.TypeDistinctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/typeDistinction")
public class TypeDistinctionWs {
    @Autowired
    private TypeDistinctionService typeDistinctionService;

    public TypeDistinction findByCode(String code) {
        return typeDistinctionService.findByCode(code);
    }

    public TypeDistinction findByLibelle(String libelle) {
        return typeDistinctionService.findByLibelle(libelle);
    }

    public int deleteByCode(String code) {
        return typeDistinctionService.deleteByCode(code);
    }

    public int deleteByLibelle(String Libelle) {
        return typeDistinctionService.deleteByLibelle(Libelle);
    }

    public TypeDistinction save(TypeDistinction typeDistinction) {
        return typeDistinctionService.save(typeDistinction);
    }
}
