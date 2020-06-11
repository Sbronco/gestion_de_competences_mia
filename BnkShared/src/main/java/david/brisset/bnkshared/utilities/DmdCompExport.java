/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author David BRISSET
 */
public class DmdCompExport implements Serializable{
    private long id;
    private String status;
    private CompetenceExport competence;
    private EquipeExport equipe;

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
