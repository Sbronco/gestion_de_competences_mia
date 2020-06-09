/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.exposition;

import david.brisset.bnkshared.interfremote.ExpoLrdRemote;
import com.miage.miaejb.entity.Candidature;
import com.miage.miaejb.entity.Collaborateur;
import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.entity.DmdComp;
import com.miage.miaejb.entity.Equipe;
import com.miage.miaejb.interfaces.GestionCandidatureLocal;
import com.miage.miaejb.interfaces.GestionCompetenceLocal;
import com.miage.miaejb.interfaces.GestionOffreLocal;
import david.brisset.bnkshared.utilities.CandidatureExport;
import david.brisset.bnkshared.utilities.CompetenceExport;
import david.brisset.bnkshared.utilities.DmdCompExport;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
/**
 *
 * @author David BRISSET
 */
@Stateless
public class ExpoLrd implements ExpoLrdRemote {

    
    @EJB
    private GestionCandidatureLocal gestionCandidature;
    
    @EJB
    private GestionCompetenceLocal gestionCompetence;
    
        @EJB
    private GestionOffreLocal gestionOffre;
        
        
    @Override
    public List<CompetenceExport> listerCompetencesCollaborateur(long idCollaborateur) {
        List<CompetenceExport> competencesExport = new ArrayList<CompetenceExport>();
        for(Competence c : this.gestionCompetence.listerCompetencesCollaborateur(idCollaborateur)){
            competencesExport.add(new CompetenceExport(c.getId(), c.getNom()));
        }
        return competencesExport;
    }

    @Override
    public List<DmdCompExport> listerDmdComp() {
        List<DmdCompExport> dmdCompExport = new ArrayList<DmdCompExport>();
        for(DmdComp d : this.gestionCompetence.listerDmdComp()){
            dmdCompExport.add(new DmdCompExport(d.getId(), d.getStatus()));
        }
        return dmdCompExport;
    }

    @Override
    public List<DmdCompExport> listerDmdComp(long idEquipe) {
        List<DmdCompExport> dmdCompExport = new ArrayList<DmdCompExport>();
        for(DmdComp d : this.gestionCompetence.listerDmdComp(idEquipe)){
            dmdCompExport.add(new DmdCompExport(d.getId(), d.getStatus()));
        }
        return dmdCompExport;
    }

    @Override
    public void validerCandidature(long idCandidature, boolean decision, String flag, long idEquipe) {
        this.gestionCandidature.validerCandidature(idCandidature, decision, flag, idEquipe);
    }

    @Override
    public void creerFichePoste(long idDemandeCompetence, String descEnt, String descPoste) {
        this.gestionCandidature.creerFichePoste(idDemandeCompetence, descEnt, descPoste);
    }

    @Override
    public List<CandidatureExport> listerCandidature() {
        List<CandidatureExport> candidatureExport = new ArrayList<CandidatureExport>();
        for(Candidature c : this.gestionCandidature.listerCandidature()){
            candidatureExport.add(new CandidatureExport(c.getId(), c.getDateCandidature(), c.getStatus()));
        }
        return candidatureExport;
    } 
}
