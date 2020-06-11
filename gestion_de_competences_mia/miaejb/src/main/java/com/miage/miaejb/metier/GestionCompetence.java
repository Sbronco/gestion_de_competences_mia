/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.metier;

import com.miage.miaejb.entity.Collaborateur;
import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.entity.DmdComp;
import com.miage.miaejb.entity.Equipe;
import com.miage.miaejb.interfaces.GestionCompetenceLocal;
import com.miage.miaejb.sessionbeans.CollaborateurFacadeLocal;
import com.miage.miaejb.sessionbeans.CompetenceFacadeLocal;
import com.miage.miaejb.sessionbeans.DmdCompFacadeLocal;
import com.miage.miaejb.sessionbeans.EquipeFacadeLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author David BRISSET
 */

@Stateless
public class GestionCompetence implements GestionCompetenceLocal{

    @EJB
    private CompetenceFacadeLocal competenceFacade;
    
    @EJB
    private EquipeFacadeLocal equipeFacade;
    
    @EJB
    private DmdCompFacadeLocal dmdCompFacade;
    
    @EJB
    private CollaborateurFacadeLocal collaborateurFacade;
    
    @Override
    public List<Competence> listerCompetences(long idEquipe) {
        Equipe equipe = this.equipeFacade.find(idEquipe);
        List<Collaborateur> collaborateurs = (List<Collaborateur>) equipe.getCollaborateurs();
        List<Competence> competences = new ArrayList<Competence>();
        
        for(Collaborateur c : collaborateurs){
            for(Competence co : c.getCandidat().getListCompetences()){
                if(!competences.contains(co)){
                    competences.add(co);
                }
            }
        }
        
        return competences;
    }

    @Override
    public void demandeCompetence(long idEquipe, long idCompetence) {
        Equipe equipe = this.equipeFacade.find(idEquipe);
        Competence competence = this.competenceFacade.find(idCompetence);
        
        DmdComp dmdComp = new DmdComp(equipe, competence);
        this.dmdCompFacade.create(dmdComp);
        
    }

    @Override
    public void validerCompetence(long idDmdCmp, String status) {
        DmdComp dmdComp = this.dmdCompFacade.find(idDmdCmp);      
        dmdComp.setStatus(status);
        }

    @Override
    public int getNbCompetence() {
        return this.competenceFacade.findAll().size();
    }

    @Override
    public int getNbCompetenceSouffrance() {
        List<Competence> competences = new ArrayList<Competence>();
        
        for(DmdComp dmdComp : this.dmdCompFacade.findAll()){
            if(!competences.contains(dmdComp.getCompetence())){
                competences.add(dmdComp.getCompetence());
            }
        }
        
        return competences.size();
    }

    @Override
    public List<Competence> listerCompetencesCollaborateur(long idCollaborateur) {
        Collaborateur collab = this.collaborateurFacade.find(idCollaborateur);
        List<Competence> competences = new ArrayList<Competence>(collab.getCandidat().getListCompetences());
        return competences;
    }

    @Override
    public List<DmdComp> listerDmdComp() {
        return this.dmdCompFacade.findAll();
    }

    @Override
    public List<DmdComp> listerDmdComp(long idEquipe) {
        Equipe equipe = this.equipeFacade.find(idEquipe);
        List<DmdComp> dmdCompetences = new ArrayList<DmdComp>(equipe.getDmdComps());
        return dmdCompetences;
    }
    
    @Override
    public List<DmdComp> listerDmdComp(String status) {
        List<DmdComp> dmdCompetences = this.dmdCompFacade.findAll();
        List<DmdComp> dmdCompetencesfinal = new ArrayList<DmdComp>();
        
        for(DmdComp d: dmdCompetences){
            if(d.getStatus() == status){
                dmdCompetencesfinal.add(d);
            }
        }
        return dmdCompetencesfinal;
    }
    
    
}
