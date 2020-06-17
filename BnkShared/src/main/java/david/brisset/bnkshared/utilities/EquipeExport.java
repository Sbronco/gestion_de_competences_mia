/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;

/**
 * Classe représentant une équipe destinée à être exportée pour un client lourd
 *
 * @author David BRISSET
 */
public class EquipeExport implements Serializable {

    /**
     * Identifiant d'une equipe
     */
    private long id;

    /**
     * Nom de l'équipe
     */
    private String nom;

    /**
     * Constructeur par défaut
     */
    public EquipeExport() {
    }

    /**
     * Constructeur paramétrée
     *
     * @param id , identifiant de l'quipe
     * @param nom , nom de l'équipe
     */
    public EquipeExport(long id, String nom) {
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

}
