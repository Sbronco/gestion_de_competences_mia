/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.exposition;

import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.entity.DmdComp;
import com.miage.miaejb.entity.FichePoste;
import com.miage.miaejb.interfaces.GestionCandidatureLocal;
import com.miage.miaejb.interfaces.GestionCompetenceLocal;
import com.miage.miaejb.interfaces.GestionOffreLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author David BRISSET
 */
@Stateless
public class ExpoLeg implements ExpoLegLocal {

    @EJB
    private GestionCompetenceLocal gestionCompetenceLocal;
    
    @EJB
    private GestionOffreLocal gestionOffreLocal;
    
    @EJB
    private GestionCandidatureLocal gestionCandidatureLocal;
    
    @Override
    public List<Competence> listerCompetences(long idEquipe) {
        return this.gestionCompetenceLocal.listerCompetences(idEquipe);
    }

    @Override
    public void demandeCompetence(long idEquipe, long idCompetence) {
        this.gestionCompetenceLocal.demandeCompetence(idEquipe, idCompetence);
    }

    @Override
    public List<FichePoste> consulterOffres() {
        return this.gestionOffreLocal.consulterOffres();
    }

    @Override
    public FichePoste detailOffre(long idFichePoste) {
        return this.gestionOffreLocal.detailOffre(idFichePoste);
    }

    @Override
    public void candidater(long idFichePoste, long idCandidat) {
        this.gestionOffreLocal.candidater(idFichePoste, idCandidat);
    }

    @Override
    public int getNbCandidature(String status) {
        return this.gestionCandidatureLocal.getNbCandidature(status);
    }

    @Override
    public int getNbCompetenceSouffrance() {
       return this.gestionCompetenceLocal.getNbCompetenceSouffrance();
    }

    @Override
    public int getNbFichePoste(String status) {
        return this.gestionOffreLocal.getNbFichePoste(status);
    }

    @Override
    public int getNbCompetence() {
        return this.gestionCompetenceLocal.getNbCompetence();
    }

    @Override
    public void validerCompetence(long idDmdCmp, String status) {
        this.gestionCompetenceLocal.validerCompetence(idDmdCmp, status);
    }

    @Override
    public List<DmdComp> listerDmdComp(String status) {
        return this.gestionCompetenceLocal.listerDmdComp(status);
    }

    @Override
    public void prononcerCandidature(long idCandidature, boolean decision) {
        this.gestionCandidatureLocal.prononcerCandidature(idCandidature, decision);
    }
}
