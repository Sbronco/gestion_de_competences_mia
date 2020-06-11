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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author David BRISSET
 */
@Entity
public class FichePoste implements Serializable {

    @OneToOne(mappedBy = "ficheposte")
    private DmdComp dmdComp;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String descEnt;
    
    @NotNull
    private String descPost;
    
    @NotNull
    private String status;

    public FichePoste(){
        
    }
    
    public FichePoste(DmdComp dmdComp, String descEnt, String descPoste) {
        this.dmdComp = dmdComp;
        this.descEnt = descEnt;
        this.descPost = descPost;
        this.status = "Cree";
    }
    
    @NotNull
    public Long getId() {
        return id;
    }

    public DmdComp getDmdComp() {
        return dmdComp;
    }

    public void setDmdComp(DmdComp dmdComp) {
        this.dmdComp = dmdComp;
    }

    public Collection<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(Collection<Candidature> candidatures) {
        this.candidatures = candidatures;
    }
    
    @NotNull
    @OneToMany(mappedBy = "fichePoste")
    private Collection<Candidature> candidatures;

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescEnt() {
        return descEnt;
    }

    public void setDescEnt(String descEnt) {
        this.descEnt = descEnt;
    }

    public String getDescPost() {
        return descPost;
    }

    public void setDescPost(String descPost) {
        this.descPost = descPost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof FichePoste)) {
            return false;
        }
        FichePoste other = (FichePoste) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.miage.Entity.FichePoste[ id=" + id + " ]";
    }
    
}
