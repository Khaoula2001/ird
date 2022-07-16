package com.example.ird.service.facade;

import com.example.ird.bean.Campagne;

public interface CampagneSaveProcess {
    int Exec(Campagne campagne);

    Campagne findByEtatCampagneCode(String code);
}
