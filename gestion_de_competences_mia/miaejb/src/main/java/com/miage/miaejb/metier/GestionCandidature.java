/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.metier;

import com.miage.miaejb.entity.Candidat;
import com.miage.miaejb.entity.Candidature;
import com.miage.miaejb.entity.Collaborateur;
import com.miage.miaejb.entity.DmdComp;
import com.miage.miaejb.entity.Equipe;
import com.miage.miaejb.entity.FichePoste;
import com.miage.miaejb.interfaces.GestionCandidatureLocal;
import com.miage.miaejb.sessionbeans.CandidatureFacadeLocal;
import com.miage.miaejb.sessionbeans.CollaborateurFacadeLocal;
import com.miage.miaejb.sessionbeans.DmdCompFacadeLocal;
import com.miage.miaejb.sessionbeans.EquipeFacadeLocal;
import com.miage.miaejb.sessionbeans.FichePosteFacadeLocal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author David BRISSET
 */
@Stateless
public class GestionCandidature implements GestionCandidatureLocal {

    @EJB
    private CollaborateurFacadeLocal collaborateurFacade;

    @EJB
    private CandidatureFacadeLocal candidatureFacade;

    @EJB
    private EquipeFacadeLocal equipeFacade;

    @EJB
    private DmdCompFacadeLocal dmdCompFacade;

    @EJB
    private FichePosteFacadeLocal fichePosteFacade;

    @Override
    public void creerFichePoste(long idDemandeCompetence, String descEnt, String descPoste) {
        DmdComp dmdComp = this.dmdCompFacade.find(idDemandeCompetence);
        dmdComp.setStatus("Archivee");
        FichePoste fichePoste = new FichePoste(dmdComp, descEnt, descPoste);
        dmdComp.setFicheposte(fichePoste);
        this.fichePosteFacade.create(fichePoste);
    }

    @Override
    public List<Candidature> listerCandidature() {
        return this.candidatureFacade.findAll();
    }

    @Override
    public List<Candidature> listerCandidature(String status) {
        List<Candidature> listCandidat = new ArrayList<Candidature>();
        for (Candidature c : this.candidatureFacade.findAll()) {
            if (c.getStatus().equals(status)) {
                listCandidat.add(c);
            }
        }
        return listCandidat;
    }

    @Override
    public int getNbCandidature(String status) {
        List<Candidature> lcandidatures = this.candidatureFacade.findAll();

        for (int i = 0; i < lcandidatures.size(); i++) {
            if (!lcandidatures.get(i).getStatus().equals(status)) {
                lcandidatures.remove(i);
                i--;
            }
        }
        return lcandidatures.size();
    }

    @Override
    public void validerCandidature(long idCandidature, String flag, long idEquipe) {
        Candidature candidature = this.candidatureFacade.find(idCandidature);
        Candidat candidat = candidature.getCandidat();
        Equipe equipe = equipeFacade.find(idEquipe);
        candidature.setStatus("Valide");
        Collaborateur collab = new Collaborateur(candidat, equipe, flag);
        this.collaborateurFacade.create(collab);
    }

    @Override
    public void prononcerCandidature(long idCandidature, boolean decision) {
        Candidature candidature = this.candidatureFacade.find(idCandidature);
        candidature.setStatus(decision);
        if (decision) {
            candidature.getFichePoste().setStatus("Archivee");
            this.candidatureFacade.edit(candidature);
        }
    }

}
