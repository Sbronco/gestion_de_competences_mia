/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.metier;

import com.miage.miaejb.entity.Collaborateur;
import com.miage.miaejb.entity.Equipe;
import com.miage.miaejb.interfaces.GestionCollaborateurLocal;
import com.miage.miaejb.sessionbeans.CollaborateurFacadeLocal;
import com.miage.miaejb.sessionbeans.EquipeFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author David BRISSET
 */
@Stateless
public class GestionCollaborateur implements GestionCollaborateurLocal {

    @EJB
    private CollaborateurFacadeLocal collaborateurFacade;

    @EJB
    private EquipeFacadeLocal equipeFacade;

    public List<Collaborateur> tousLesCollaborateurs() {
        return this.collaborateurFacade.findAll();
    }

    public List<Equipe> toutesLesEquipes() {
        return this.equipeFacade.findAll();
    }
}
