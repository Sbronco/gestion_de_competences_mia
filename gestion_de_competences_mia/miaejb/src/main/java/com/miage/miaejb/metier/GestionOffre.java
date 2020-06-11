/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.metier;

import com.miage.miaejb.entity.Candidat;
import com.miage.miaejb.entity.Candidature;
import com.miage.miaejb.entity.FichePoste;
import com.miage.miaejb.interfaces.GestionOffreLocal;
import com.miage.miaejb.sessionbeans.CandidatFacadeLocal;
import com.miage.miaejb.sessionbeans.CandidatureFacadeLocal;
import com.miage.miaejb.sessionbeans.FichePosteFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author David BRISSET
 */

@Stateless
public class GestionOffre implements GestionOffreLocal{

        @EJB
    private FichePosteFacadeLocal fichePosteFacade;
        
     @EJB
    private CandidatFacadeLocal candidatFacade;
        
         @EJB
    private CandidatureFacadeLocal candidatureFacade;    
    @Override
    public List<FichePoste> consulterOffres() {
        return this.fichePosteFacade.findAll();
    }

    @Override
    public FichePoste detailOffre(long idFichePoste) {
        return this.fichePosteFacade.find(idFichePoste);
    }

    @Override
    public int getNbFichePoste(String status) {
        List<FichePoste> lfichepostes = this.fichePosteFacade.findAll();
      
        for(int i = 0; i < lfichepostes.size(); i++){
            if(!lfichepostes.get(i).getStatus().equals(status)){
                lfichepostes.remove(i);
                i--;
            }
        }
        return lfichepostes.size();
    }
    
        @Override
    public void candidater(long idFichePoste, long idCandidat) {
        FichePoste fichePoste = this.fichePosteFacade.find(idFichePoste);
        Candidat candidat = this.candidatFacade.find(idCandidat);
        
        Candidature candidature = new Candidature(fichePoste, candidat);
        this.candidatureFacade.create(candidature);
        
    }
    
}
