package com.example.ird.service.facade;

import com.example.ird.bean.Campagne;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;

@Service
public interface CampagneService {


    Campagne save(Campagne campagne);

    List<Campagne> findByDateDebut(Date dateDebut);

    List<Campagne> findByDateFin(Date dateFin);

    @Transactional
    int deleteByDateDebut(Date dateDebut);

    @Transactional
    int deleteByDateFin(Date dateFin);

    List<Campagne> findByEtatCampagneCode(String code);

    List<Campagne> findAll();
}
