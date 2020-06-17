/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Représente la candidature d'un candidat à une fiche de poste
 *
 * @author David BRISSET
 */
@Entity
public class Candidature implements Serializable {

    /**
     * Candidat qui fait la candidature
     */
    @ManyToOne
    private Candidat candidat;

    /**
     * Fiche de poste associée à la candidature
     */
    @ManyToOne
    private FichePoste fichePoste;

    private static final long serialVersionUID = 1L;

    /**
     * L'identifiant d'une candidature
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * La date de la candidature
     */
    private Date dateCandidature;

    /**
     * Le status d'une candidature
     */
    private String status;

    /**
     * Constructeur par défaut d'une candidature
     */
    public Candidature() {

    }

    /**
     * Constructeur d'une candidature avec parametre
     *
     * @param fichePoste , Fiche de poste de la candidature
     * @param candidat , Candidat de la candidature
     */
    public Candidature(FichePoste fichePoste, Candidat candidat) {
        this.fichePoste = fichePoste;
        this.candidat = candidat;
        this.dateCandidature = new Date();
        this.status = "Cree";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCandidature() {
        return dateCandidature;
    }

    public void setDateCandidature(Date dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public FichePoste getFichePoste() {
        return fichePoste;
    }

    public void setFichePoste(FichePoste fichePoste) {
        this.fichePoste = fichePoste;
    }

    public String getStatus() {
        return status;
    }

    /**
     * Setter particulier, on passe en paramètre un boolean et suivant sa valeur
     * on va mettre un status particulier
     *
     * @param status , boolean pour dire si la candidature est accepté ou non
     * par le codir
     */
    public void setStatus(boolean status) {
        if (status) {
            this.status = "Accepte";
        } else {
            this.status = "Refuse";
        }
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
        if (!(object instanceof Candidature)) {
            return false;
        }
        Candidature other = (Candidature) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.miage.Entity.Candidature[ id=" + id + " ]";
    }

}
