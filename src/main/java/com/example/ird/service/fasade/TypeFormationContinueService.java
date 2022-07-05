package com.example.ird.service.fasade;

import com.example.ird.bean.TypeFormationContinue;
import org.springframework.stereotype.Service;

@Service
public interface TypeFormationContinueService {
    TypeFormationContinue findByCode(String code);

    TypeFormationContinue findByLibelle(String libelle);

    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);

    TypeFormationContinue save(TypeFormationContinue typeFormationContinue);
}
