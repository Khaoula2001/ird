package com.example.ird.process.facade;

import com.example.ird.bean.Campagne;
import org.springframework.stereotype.Service;

@Service
public interface CampagneSaveProcessService {
    int ExecSave(Campagne campagne);
}
