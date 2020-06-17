/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;

/**
 * Classe représentant un candidat destiné à être exporté pour un client lourd
 *
 * @author David BRISSET
 */
public class CandidatExport implements Serializable {

    /**
     * Identifiant d'un candidat
     */
    private long id;

    /**
     * Nom d'un candidat
     */
    private String nom;

    /**
     * Prénom d'un candidat
     */
    private String prenom;

    /**
     * Constructeur par défaut
     */
    public CandidatExport() {
    }

    /**
     * Constructeur paramétrée
     *
     * @param id , identifiant du candidat
     * @param nom , nom du candidat
     * @param prenom , prenom du candidat
     */
    public CandidatExport(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

}
