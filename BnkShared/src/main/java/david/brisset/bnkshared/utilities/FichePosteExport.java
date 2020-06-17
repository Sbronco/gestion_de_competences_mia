/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;

/**
 * Classe représentant une fiche de poste destinée à être exporté pour un client
 * lourd
 *
 * @author David BRISSET
 */
public class FichePosteExport implements Serializable {

    /**
     * Identifiant d'une fiche de poste
     */
    private long id;

    /**
     * Description de l'entreprise
     */
    private String descEnt;

    /**
     * Description du poste
     */
    private String descPoste;

    /**
     * Profil DmdCompExport associé la fiche de poste
     */
    private DmdCompExport dmdcomp;

    /**
     * Cosntructeur par défaut
     */
    public FichePosteExport() {
    }

    /**
     * Constructeur paramétrée
     *
     * @param id , identifiant de la fiche de psote
     * @param descEnt , description entreprise de la fiche d epsote
     * @param descPoste , description du psote de la fiche de psote
     * @param dmdcomp , profil DmdCompExport associé à la fiche de psote
     */
    public FichePosteExport(long id, String descEnt, String descPoste, DmdCompExport dmdcomp) {
        this.id = id;
        this.descEnt = descEnt;
        this.descPoste = descPoste;
        this.dmdcomp = dmdcomp;
    }

    public DmdCompExport getDmdcomp() {
        return dmdcomp;
    }

    public void setDmdcomp(DmdCompExport dmdcomp) {
        this.dmdcomp = dmdcomp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescEnt() {
        return descEnt;
    }

    public void setDescEnt(String descEnt) {
        this.descEnt = descEnt;
    }

    public String getDescPoste() {
        return descPoste;
    }

    public void setDescPoste(String descPoste) {
        this.descPoste = descPoste;
    }

}
