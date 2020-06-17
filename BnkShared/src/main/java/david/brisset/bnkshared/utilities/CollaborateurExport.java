/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;

/**
 * Classe représentant un collaborateur destiné à être exporté pour un client
 * lourd
 *
 * @author David BRISSET
 */
public class CollaborateurExport implements Serializable {

    /**
     * Identifiant d'un collaborateur
     */
    private long id;

    /**
     * Profil candidatExport du collaborateur
     */
    private CandidatExport candidat;

    /**
     * Constructeur par défaut
     */
    public CollaborateurExport() {
    }

    /**
     * Constructeur paramétrée
     *
     * @param id , identifiant du collaborateur
     * @param candidat , profil candidatExport du collaborateur
     */
    public CollaborateurExport(long id, CandidatExport candidat) {
        this.id = id;
        this.candidat = candidat;
    }

    public CandidatExport getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatExport candidat) {
        this.candidat = candidat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
