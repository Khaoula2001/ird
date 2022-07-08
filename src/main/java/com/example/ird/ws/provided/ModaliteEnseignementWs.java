package com.example.ird.ws.provided;


import com.example.ird.bean.ModaliteEnseignement;
import com.example.ird.service.facade.ModaliteEnseignementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/modaliteEnseignement")
public class ModaliteEnseignementWs {
    @Autowired
    private ModaliteEnseignementService modaliteEnseignementService;

    public ModaliteEnseignement findByCode(String code) {
        return modaliteEnseignementService.findByCode(code);
    }

    public ModaliteEnseignement findByLibelle(String libelle) {
        return modaliteEnseignementService.findByLibelle(libelle);
    }

    public int deleteByCode(String code) {
        return modaliteEnseignementService.deleteByCode(code);
    }

    public int deleteByLibelle(String Libelle) {
        return modaliteEnseignementService.deleteByLibelle(Libelle);
    }

    public ModaliteEnseignement save(ModaliteEnseignement modaliteEnseignement) {
        return modaliteEnseignementService.save(modaliteEnseignement);
    }
}
