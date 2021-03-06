
package com.example.ird.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Campagne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    private EtatCampagne etatCampagne;
    @OneToMany(mappedBy = "campagne")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<CampagneChercheurOuverture> campagneChercheurOuvertureList;

    public Campagne() {
    }

    public EtatCampagne getEtatCampagne() {
        return etatCampagne;
    }

    public void setEtatCampagne(EtatCampagne etatCampagne) {
        this.etatCampagne = etatCampagne;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<CampagneChercheurOuverture> getCampagneChercheurOuvertureList() {
        return campagneChercheurOuvertureList;
    }

    public void setCampagneChercheurOuvertureList(List<CampagneChercheurOuverture> campagneChercheurOuvertureList) {
        this.campagneChercheurOuvertureList = campagneChercheurOuvertureList;
    }
}
