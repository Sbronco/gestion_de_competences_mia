/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Représente un collaborateur de l'entreprise
 *
 * @author David BRISSET
 */
@Entity
public class Collaborateur implements Serializable {

    /**
     * Profil du collaborateur quand il était encore candidat
     */
    @OneToOne
    private Candidat candidat;

    private static final long serialVersionUID = 1L;

    /**
     * Identifiant d'un collaborateur
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Représente le status du collaborateur (Manager, Codir, ou les 2)
     */
    private String flag;

    /**
     * L'équipe où est affecté le collaborateur
     */
    @ManyToOne
    private Equipe equipe;

    /**
     * Constructeur par défaut
     */
    public Collaborateur() {

    }

    /**
     * Constructeur avec paramètre
     *
     * @param candidat , profil du candidat du collaborateur
     * @param equipe , équipe ou se trouve le collaborateur
     * @param flag , le status du collaborateur
     */
    public Collaborateur(Candidat candidat, Equipe equipe, String flag) {
        this.candidat = candidat;
        this.flag = flag;
        this.equipe = equipe;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Collaborateur)) {
            return false;
        }
        Collaborateur other = (Collaborateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.miage.Entity.Collaborateur[ id=" + id + " ]";
    }

}
