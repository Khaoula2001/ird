package com.example.ird.service.facade;

import com.example.ird.bean.Expertise;
import com.example.ird.bean.NatureExpertise;

import java.util.List;

public interface NatureExpertiseService {
    int save(NatureExpertise natureexpertise);
    int deleteByCode(String code);

    int update(String code, NatureExpertise natureExpertise);

    NatureExpertise findByCode(String code);
    List<NatureExpertise> findAll();
}

