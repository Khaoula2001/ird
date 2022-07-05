package com.example.ird.service.fasade;

import com.example.ird.bean.Campagne;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface CampagneService {
    List<Campagne> findByDateDebut(Date dateDebut);

    List<Campagne> findByDateFin(Date dateFin);

    int deleteByDateDebut(Date dateDebut);

    int deleteByDateFin(Date dateFin);

    Campagne save(Campagne campagne);
}
