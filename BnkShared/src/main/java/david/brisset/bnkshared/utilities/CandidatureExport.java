/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe représentant une candidature destinée à être exportée pour un client
 * lourd
 *
 * @author David BRISSET
 */
public class CandidatureExport implements Serializable {

    /**
     * Identifiant d'une candidature
     */
    private long id;

    /**
     * Date de la candidature
     */
    private Date dateCandidature;

    /**
     * Status de la candidature
     */
    private String status;

    /**
     * Profil candidatExport de la candidature
     */
    private CandidatExport candidat;

    /**
     * FicheDePosteExport associé à la candidature
     */
    private FichePosteExport ficheposte;

    /**
     * Constructeure paramétrée
     *
     * @param id , identifiant de la candidature
     * @param dateCandidature , date de la candidature
     * @param status , status de la candidature
     * @param candidat , profil candidatExport associé à la candidature
     * @param ficheposte , profil fichedeposteExport associé à la candidature
     */
    public CandidatureExport(long id, Date dateCandidature, String status, CandidatExport candidat, FichePosteExport ficheposte) {
        this.id = id;
        this.dateCandidature = dateCandidature;
        this.status = status;
        this.candidat = candidat;
        this.ficheposte = ficheposte;
    }

    public FichePosteExport getFicheposte() {
        return ficheposte;
    }

    public void setFicheposte(FichePosteExport ficheposte) {
        this.ficheposte = ficheposte;
    }

    public Date getDateCandidature() {
        return dateCandidature;
    }

    public void setDateCandidature(Date dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CandidatExport getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatExport candidat) {
        this.candidat = candidat;
    }

    public CandidatureExport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.dateCandidature + this.status;
    }

}
