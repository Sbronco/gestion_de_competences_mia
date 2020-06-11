/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author David BRISSET
 */
@Entity
public class Candidat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

        private String nom;
    
        private String prenom;
        
    @ManyToMany(mappedBy = "candidats")
    @XmlTransient
    private Collection<Competence> listCompetences;
    
    @OneToOne(mappedBy = "candidat")
    private Collaborateur collaborateur;
    
    @OneToMany(mappedBy = "candidat")
    @XmlTransient
    private Collection<Candidature> candidatures;

    
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @XmlTransient
    public Collection<Competence> getListCompetences() {
        return listCompetences;
    }

    public void setListCompetences(ArrayList<Competence> listCompetences) {
        this.listCompetences = listCompetences;
    }
    
    
        public void addCompetence(Competence c) {
            listCompetences.add(c);
    }

    public void removeCompetence (Competence c) {
        this.listCompetences.remove(c);
    }

    public Collaborateur getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    @XmlTransient
    public Collection<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(Collection<Candidature> candidatures) {
        this.candidatures = candidatures;
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
        if (!(object instanceof Candidat)) {
            return false;
        }
        Candidat other = (Candidat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.miage.Entity.Candidat[ id=" + id + " ]";
    }
    
}
