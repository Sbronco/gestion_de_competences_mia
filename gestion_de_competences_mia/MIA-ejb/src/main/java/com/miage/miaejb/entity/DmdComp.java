/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author David BRISSET
 */
@Entity
public class DmdComp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne
    private Equipe equipe;
    
    @NotNull
    private String status;
    
    @NotNull
    @OneToOne
    private FichePoste ficheposte;
    

    @ManyToOne
    private Competence competence;

    
    public DmdComp(){
        
    }
    
    public DmdComp(Equipe equipe, Competence competence) {
        this.equipe = equipe;
        this.competence = competence;
        this.status = "Cree";
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FichePoste getFicheposte() {
        return ficheposte;
    }

    public void setFicheposte(FichePoste ficheposte) {
        this.ficheposte = ficheposte;
    }

    public Competence getCompetence() {
        return competence;
    }

    public void setCompetences(Competence competence) {
        this.competence = competence;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmdComp)) {
            return false;
        }
        DmdComp other = (DmdComp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.miage.Entity.DmdComp[ id=" + id + " ]";
    }
    
}
