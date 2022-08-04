package com.example.ird.service.facade;

import com.example.ird.bean.Expertise;

import javax.transaction.Transactional;
import java.util.List;

public interface ExpertiseService {
    List<Expertise> findAll();

    List<Expertise> findByCriteria(Expertise expertise);

    //
    @Transactional
    int deleteById(Long id);

    Expertise findById(Long id);

    Expertise update(Expertise expertise);
}