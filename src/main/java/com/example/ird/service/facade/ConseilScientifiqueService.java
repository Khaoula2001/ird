package com.example.ird.service.facade;



import com.example.ird.bean.ConseilScientifique;

import java.util.List;
import java.util.Optional;

public interface ConseilScientifiqueService {

    // beg save
    int save(ConseilScientifique natureexpertise);

    List<ConseilScientifique> findAll();
}
