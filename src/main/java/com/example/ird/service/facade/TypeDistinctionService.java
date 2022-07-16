package com.example.ird.service.facade;

import com.example.ird.bean.TypeDistinction;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

@Service
public interface TypeDistinctionService {

=======

import javax.transaction.Transactional;

public interface TypeDistinctionService {
    TypeDistinction save(TypeDistinction typeDistinction);
>>>>>>> origin/master

    TypeDistinction findByCode(String code);

    TypeDistinction findByLibelle(String libelle);

<<<<<<< HEAD
    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);

    TypeDistinction save(TypeDistinction typeDistinction);
=======
    @Transactional
    int deleteByCode(String code);

    @Transactional
    int deleteByLibelle(String Libelle);
>>>>>>> origin/master
}
