package com.example.ird.dao;


import com.example.ird.bean.ModaliteEnseignement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModaliteEnseignementDao extends JpaRepository<ModaliteEnseignement, Long> {
    ModaliteEnseignement findByCode(String code);

    ModaliteEnseignement findByLibelle(String libelle);

    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);
}
