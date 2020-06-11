/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.exposition;

import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.entity.DmdComp;
import com.miage.miaejb.entity.FichePoste;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface ExpoLegLocal {
    public List<Competence> listerCompetences(long idEquipe);
    public void demandeCompetence(long idEquipe, long idCompetence);
    public List<FichePoste> consulterOffres();
    public FichePoste detailOffre(long idFichePoste);
    public void candidater(long idFichePoste, long idCandidat);
    public int getNbCandidature(String status);
    public int getNbCompetenceSouffrance();
    public int getNbCompetence();
    public int getNbFichePoste(String status);
    public void validerCompetence(long idDmdCmp, String status);
    public List<DmdComp> listerDmdComp(String status);
    public void prononcerCandidature(long idCandidature, boolean decision);
    
}
