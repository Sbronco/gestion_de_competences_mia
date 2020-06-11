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
import com.miage.miaejb.interfaces.GestionCollaborateurLocal;
import com.miage.miaejb.interfaces.GestionCompetenceLocal;
import com.miage.miaejb.interfaces.GestionOffreLocal;
import david.brisset.bnkshared.utilities.CandidatExport;
import david.brisset.bnkshared.utilities.CandidatureExport;
import david.brisset.bnkshared.utilities.CollaborateurExport;
import david.brisset.bnkshared.utilities.CompetenceExport;
import david.brisset.bnkshared.utilities.DmdCompExport;
import david.brisset.bnkshared.utilities.EquipeExport;
import david.brisset.bnkshared.utilities.FichePosteExport;
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
    private GestionCollaborateurLocal gestionCollaborateur;
    
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
            dmdCompExport.add(new DmdCompExport(d.getId(), d.getStatus(), new CompetenceExport(d.getCompetence().getId(), d.getCompetence().getNom()), new EquipeExport(d.getEquipe().getId(), d.getEquipe().getNomEquipe())));
        }
        return dmdCompExport;
    }

    @Override
    public List<DmdCompExport> listerDmdComp(long idEquipe) {
        List<DmdCompExport> dmdCompExport = new ArrayList<DmdCompExport>();
        for(DmdComp d : this.gestionCompetence.listerDmdComp(idEquipe)){
            dmdCompExport.add(new DmdCompExport(d.getId(), d.getStatus(), new CompetenceExport(d.getCompetence().getId(), d.getCompetence().getNom()), new EquipeExport(d.getEquipe().getId(), d.getEquipe().getNomEquipe())));
        }
        return dmdCompExport;
    }

    @Override
    public void validerCandidature(long idCandidature, String flag, long idEquipe) {
        this.gestionCandidature.validerCandidature(idCandidature, flag, idEquipe);
    }

    @Override
    public void creerFichePoste(long idDemandeCompetence, String descEnt, String descPoste) {
        this.gestionCandidature.creerFichePoste(idDemandeCompetence, descEnt, descPoste);
    }

    @Override
    public List<CandidatureExport> listerCandidature() {
        List<CandidatureExport> candidatureExport = new ArrayList<CandidatureExport>();
        for(Candidature c : this.gestionCandidature.listerCandidature()){
            candidatureExport.add(new CandidatureExport(c.getId(), c.getDateCandidature(), c.getStatus(), new CandidatExport(c.getCandidat().getId(), c.getCandidat().getNom(), c.getCandidat().getPrenom()), 
                    new FichePosteExport(c.getFichePoste().getId(),c.getFichePoste().getDescEnt(),c.getFichePoste().getDescPost(),
                            new DmdCompExport(c.getFichePoste().getDmdComp().getId(), c.getFichePoste().getDmdComp().getStatus(),
                                new CompetenceExport(c.getFichePoste().getDmdComp().getCompetence().getId(),c.getFichePoste().getDmdComp().getCompetence().getNom())
                            , new EquipeExport(c.getFichePoste().getDmdComp().getEquipe().getId(),c.getFichePoste().getDmdComp().getEquipe().getNomEquipe() ))) ));
        }
        return candidatureExport;
    } 

    @Override
    public List<DmdCompExport> listerDmdComp(String status) {
        List<DmdCompExport> listDmdCompExport = new ArrayList<DmdCompExport>();
        for(DmdComp d : this.gestionCompetence.listerDmdComp(status)){
            listDmdCompExport.add(new DmdCompExport(d.getId(), d.getStatus(), new CompetenceExport(d.getCompetence().getId(), d.getCompetence().getNom()), new EquipeExport(d.getEquipe().getId(), d.getEquipe().getNomEquipe())));
        }
        return listDmdCompExport;
    }

    @Override
    public List<CollaborateurExport> listerCollaborateur() {
        List<CollaborateurExport> listCollaborateur = new ArrayList<CollaborateurExport>();
        for(Collaborateur c : this.gestionCollaborateur.tousLesCollaborateurs()){
            listCollaborateur.add(new CollaborateurExport(c.getId(),new CandidatExport(c.getCandidat().getId(), c.getCandidat().getNom(), c.getCandidat().getPrenom())));
        }
        return listCollaborateur;
    }

    public List<EquipeExport> listerEquipe() {
        List<EquipeExport> listEquipe = new ArrayList<EquipeExport>();
        for(Equipe e : this.gestionCollaborateur.toutesLesEquipes()){
            listEquipe.add(new EquipeExport(e.getId(), e.getNomEquipe()));
        }
        return listEquipe;
    }

    public List<CandidatureExport> listerCandidature(String status) {
        List<CandidatureExport> candidatureExport = new ArrayList<CandidatureExport>();
        for(Candidature c : this.gestionCandidature.listerCandidature(status)){
            candidatureExport.add(new CandidatureExport(c.getId(), c.getDateCandidature(), c.getStatus(), new CandidatExport(c.getCandidat().getId(), c.getCandidat().getNom(), c.getCandidat().getPrenom()),
            new FichePosteExport(c.getFichePoste().getId(),c.getFichePoste().getDescEnt(),c.getFichePoste().getDescPost(),
                            new DmdCompExport(c.getFichePoste().getDmdComp().getId(), c.getFichePoste().getDmdComp().getStatus(),
                                new CompetenceExport(c.getFichePoste().getDmdComp().getCompetence().getId(),c.getFichePoste().getDmdComp().getCompetence().getNom())
                            , new EquipeExport(c.getFichePoste().getDmdComp().getEquipe().getId(),c.getFichePoste().getDmdComp().getEquipe().getNomEquipe())))));
        }
        return candidatureExport;
    }
}
