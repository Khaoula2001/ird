package com.example.ird.service.fasade;

import com.example.ird.bean.Distinction;
import org.springframework.stereotype.Service;

@Service
public interface DistinctionService {
    Distinction findByLibelle(String libelle);

    Distinction findByDescription(String description);


    int deleteByLibelle(String libelle);

    Distinction save(Distinction distinction);
}
