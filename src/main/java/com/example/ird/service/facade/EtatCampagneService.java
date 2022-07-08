package com.example.ird.service.facade;

import com.example.ird.bean.EtatCampagne;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EtatCampagneService {

    EtatCampagne findByCode(String code);
    int deleteByCode(String code);
}
