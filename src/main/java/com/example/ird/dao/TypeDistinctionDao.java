package com.example.ird.dao;

import com.example.ird.bean.TypeDistinction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDistinctionDao extends JpaRepository<TypeDistinction, Long> {
    TypeDistinction findByCode(String code);

    TypeDistinction findByLibelle(String libelle);

    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);

}
