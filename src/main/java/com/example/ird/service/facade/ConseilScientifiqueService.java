package com.example.ird.service.facade;



import com.example.ird.bean.ConseilScientifique;

import java.util.List;
import java.util.Optional;

public interface ConseilScientifiqueService {

    List<ConseilScientifique> findAll();

    int deleteById(Long id);

    ConseilScientifique findById(Long id);

    ConseilScientifique update(ConseilScientifique conseilScientifique);

    //    Search
    List<ConseilScientifique> findByCriteria(ConseilScientifique conseilScientifique);
}
