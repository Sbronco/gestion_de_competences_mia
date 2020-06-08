/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.exposition;

import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.interfaces.GestionCompetenceLocal;
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
    
    @Override
    public List<Competence> listerCompetences(long idEquipe) {
        return this.gestionCompetenceLocal.listerCompetences(idEquipe);
    }

    @Override
    public void demandeCompetence(long idEquipe, long idCompetence) {
        this.gestionCompetenceLocal.demandeCompetence(idEquipe, idCompetence);
    }
}
