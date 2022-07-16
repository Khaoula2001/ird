package com.example.ird.service.facade;

<<<<<<< HEAD

import com.example.ird.bean.ModaliteEnseignement;
import org.springframework.stereotype.Service;

@Service
public interface ModaliteEnseignementService {
=======
import com.example.ird.bean.ModaliteEnseignement;

import javax.transaction.Transactional;

public interface ModaliteEnseignementService {
    ModaliteEnseignement save(ModaliteEnseignement modaliteEnseignement);
>>>>>>> origin/master

    ModaliteEnseignement findByCode(String code);

    ModaliteEnseignement findByLibelle(String libelle);

<<<<<<< HEAD
    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);

    ModaliteEnseignement save(ModaliteEnseignement modaliteEnseignement);
=======
    @Transactional
    int deleteByCode(String code);

    @Transactional
    int deleteByLibelle(String Libelle);
>>>>>>> origin/master
}
