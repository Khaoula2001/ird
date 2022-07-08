package com.example.ird.service.facade;

import com.example.ird.bean.Expertise;

import java.util.List;

public interface ExpertiseService {
    int save(Expertise expertise);

    List<Expertise> findAll();
}
