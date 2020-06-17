/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;

/**
 * Classe représentant une compétence destinée à être exportée pour un client
 * lourd
 *
 * @author David BRISSET
 */
public class CompetenceExport implements Serializable {

    /**
     * Identifiant d'une competence
     */
    private long id;

    /**
     * Nom d'une compétence
     */
    private String nom;

    /**
     * Constructeur par défaut
     */
    public CompetenceExport() {
    }

    /**
     * Constructeur paramétrée
     *
     * @param id , identifiant de la compétence
     * @param nom , nom de la compétence
     */
    public CompetenceExport(long id, String nom) {
        this.id = id;
        this.nom = nom;
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

    @Override
    public String toString() {
        return this.nom;
    }
}
