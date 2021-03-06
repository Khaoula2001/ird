package com.example.ird.dao;


import com.example.ird.bean.ConseilScientifique;
import com.example.ird.bean.NatureExpertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConseilScientifiqueDao extends JpaRepository<ConseilScientifique, Long> {

    List<ConseilScientifique> findAll();

    ConseilScientifique findByNatureExpertise(NatureExpertise natureExpertise);

}