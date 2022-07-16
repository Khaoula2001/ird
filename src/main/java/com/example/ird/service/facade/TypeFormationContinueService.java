package com.example.ird.service.facade;

import com.example.ird.bean.TypeFormationContinue;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

@Service
public interface TypeFormationContinueService {
=======

import javax.transaction.Transactional;

public interface TypeFormationContinueService {
    TypeFormationContinue save(TypeFormationContinue typeFormationContinue);

>>>>>>> origin/master
    TypeFormationContinue findByCode(String code);

    TypeFormationContinue findByLibelle(String libelle);

<<<<<<< HEAD
    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);

    TypeFormationContinue save(TypeFormationContinue typeFormationContinue);
=======
    @Transactional
    int deleteByCode(String code);

    @Transactional
    int deleteByLibelle(String Libelle);
>>>>>>> origin/master
}
