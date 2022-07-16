package com.example.ird.service.facade;

import com.example.ird.bean.TypeDistinction;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public interface TypeDistinctionService {

    TypeDistinction save(TypeDistinction typeDistinction);

    TypeDistinction findByCode(String code);

    TypeDistinction findByLibelle(String libelle);

    @Transactional
    int deleteByCode(String code);

    @Transactional
    int deleteByLibelle(String Libelle);
}
