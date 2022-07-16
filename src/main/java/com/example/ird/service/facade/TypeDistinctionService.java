package com.example.ird.service.facade;

import com.example.ird.bean.TypeDistinction;
import org.springframework.stereotype.Service;

@Service
public interface TypeDistinctionService {


    TypeDistinction findByCode(String code);

    TypeDistinction findByLibelle(String libelle);

    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);

    TypeDistinction save(TypeDistinction typeDistinction);
}
