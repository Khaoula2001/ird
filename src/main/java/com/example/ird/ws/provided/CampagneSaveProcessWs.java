package com.example.ird.ws.provided;

import com.example.ird.bean.Campagne;
import com.example.ird.process.facade.CampagneSaveProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/campagneSaveProcess")
public class CampagneSaveProcessWs {
    @Autowired
    private CampagneSaveProcessService campagneSaveProcessService;

    @PostMapping("/")
    public int ExecSave(@RequestBody Campagne campagne) {
        return campagneSaveProcessService.ExecSave(campagne);
    }
}
