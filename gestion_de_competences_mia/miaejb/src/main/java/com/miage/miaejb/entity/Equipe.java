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
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Représente une équipe de collaborateur
 * @author David BRISSET
 */
@Entity
public class Equipe implements Serializable {

    /**
     * Liste des demandes de coméptence faites par l'équipe
     */
    @OneToMany(mappedBy = "equipe")
    @XmlTransient
    private List<DmdComp> dmdComps;

    private static final long serialVersionUID = 1L;
    
    /**
     * Identifiant d'une équipe
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Nom de l'équipe
     */
    private String nomEquipe;
    
    /**
     * Collaborateur travaillant dans l'équipe
     */
    @OneToMany(mappedBy = "equipe")
    @XmlTransient
    private Collection<Collaborateur> collaborateurs;
    
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    @XmlTransient
    public List<DmdComp> getDmdComps() {
        return dmdComps;
    }

    public void setDmdComps(List<DmdComp> dmdComps) {
        this.dmdComps = dmdComps;
    }

    @XmlTransient
    public Collection<Collaborateur> getCollaborateurs() {
        return collaborateurs;
    }

    public void setCollaborateurs(Collection<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
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
        if (!(object instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.miage.Entity.Equipe[ id=" + id + " ]";
    }
    
}
