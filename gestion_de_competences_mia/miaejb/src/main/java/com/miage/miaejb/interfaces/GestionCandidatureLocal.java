/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.interfaces;

import com.miage.miaejb.entity.Candidature;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface GestionCandidatureLocal {
    public void validerCandidature(long idCandidature,String flag, long idEquipe );
    public void prononcerCandidature(long idCandidature, boolean decision);
    public void creerFichePoste(long idDemandeCompetence, String descEnt, String descPoste);
    public List<Candidature> listerCandidature();
    public List<Candidature> listerCandidature(String status);
    public int getNbCandidature(String status);
}
