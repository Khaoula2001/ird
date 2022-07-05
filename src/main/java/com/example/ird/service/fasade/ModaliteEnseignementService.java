package com.example.ird.service.fasade;


import com.example.ird.bean.ModaliteEnseignement;
import org.springframework.stereotype.Service;

@Service
public interface ModaliteEnseignementService {

    ModaliteEnseignement findByCode(String code);

    ModaliteEnseignement findByLibelle(String libelle);

    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);

    ModaliteEnseignement save(ModaliteEnseignement modaliteEnseignement);
}
