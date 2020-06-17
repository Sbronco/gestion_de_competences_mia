/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;
import java.util.List;

/**
 * Classe représentant une demande de compétence destinée à être exportée pour
 * un client lourd
 *
 * @author David BRISSET
 */
public class DmdCompExport implements Serializable {

    /**
     * Identifiant d'une DemandeDeCompetence
     */
    private long id;

    /**
     * Status de la demande de compétence
     */
    private String status;

    /**
     * CompetenceExport associée à la demande de compétence
     */
    private CompetenceExport competence;

    /**
     * EquipeExport associée à la demande de compétence
     */
    private EquipeExport equipe;

    /**
     * Constructeur paramétrée
     *
     * @param id , identifiant de la demande de compétence
     * @param status , status de la demande de compétence
     * @param competence , profil competenceExport associé à la demande de
     * compétence
     * @param equipe , profil equipeExport associé à la demande de compétence
     */
    public DmdCompExport(long id, String status, CompetenceExport competence, EquipeExport equipe) {
        this.id = id;
        this.status = status;
        this.competence = competence;
        this.equipe = equipe;
    }

    public EquipeExport getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeExport equipe) {
        this.equipe = equipe;
    }

    public CompetenceExport getCompetence() {
        return competence;
    }

    public void setCompetence(CompetenceExport competence) {
        this.competence = competence;
    }

    public DmdCompExport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
