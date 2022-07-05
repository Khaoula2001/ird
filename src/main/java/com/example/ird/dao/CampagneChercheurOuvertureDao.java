
package com.example.ird.dao;

import com.example.ird.bean.CampagneChercheurOuverture;
import com.example.ird.bean.Chercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CampagneChercheurOuvertureDao extends JpaRepository<CampagneChercheurOuverture, Long> {

    List<CampagneChercheurOuverture> findByCampagneDateDebut(Date dateDebut);

    List<CampagneChercheurOuverture> findByCampagneDateFin(Date dateFin);

    int deleteByCampagneDateDebut(Date dateDebut);

    int deleteByCampagneDateFin(Date dateFin);

    Chercheur findByChercheurLogin(String login);

    Chercheur findByChercheurNom(String nom);

    Chercheur findByChercheurPrenom(String prenom);

    Chercheur findByChercheurEmail(String email);

    int deleteByChercheurLogin(String login);

    int deleteByChercheurNom(String nom);

    int deleteByChercheurPrenom(String prenom);

    int deleteByChercheurEmail(String email);
}
