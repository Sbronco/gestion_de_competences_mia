/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author David BRISSET
 */
@Entity
public class Competence implements Serializable {

    @OneToMany(mappedBy = "competence")
    @XmlTransient
    private List<DmdComp> dmdComps;


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String nom;
    
    @ManyToMany
    @XmlTransient
    private Collection<Candidat> candidats;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlTransient
    public List<DmdComp> getDmdComps() {
        return dmdComps;
    }

    public void setDmdComps(List<DmdComp> dmdComps) {
        this.dmdComps = dmdComps;
    }

    @XmlTransient
    public Collection<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(Collection<Candidat> candidats) {
        this.candidats = candidats;
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
        if (!(object instanceof Competence)) {
            return false;
        }
        Competence other = (Competence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.miage.Entity.Competence[ id=" + id + " ]";
    }
    
}
