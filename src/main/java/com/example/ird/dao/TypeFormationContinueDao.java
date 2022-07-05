
package com.example.ird.dao;

import com.example.ird.bean.TypeFormationContinue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeFormationContinueDao extends JpaRepository<TypeFormationContinue, Long> {

    TypeFormationContinue findByCode(String code);

    TypeFormationContinue findByLibelle(String libelle);

    int deleteByCode(String code);

    int deleteByLibelle(String Libelle);
}
