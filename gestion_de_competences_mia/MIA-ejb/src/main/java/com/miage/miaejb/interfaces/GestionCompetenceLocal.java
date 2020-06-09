/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.interfaces;

import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.entity.DmdComp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface GestionCompetenceLocal {
    public List<Competence> listerCompetences(long idEquipe);
    public void demandeCompetence(long idEquipe, long idCompetence);
    public List<Competence> listerCompetencesCollaborateur(long idCollaborateur);
    public List<DmdComp> listerDmdComp();
    public List<DmdComp> listerDmdComp(long idEquipe);
    public void validerCompetence (long idDmdCmp, String status);
    public int getNbCompetence();
    public int getNbCompetenceSouffrance();
    public List<DmdComp> listerDmdComp(String status);
}
