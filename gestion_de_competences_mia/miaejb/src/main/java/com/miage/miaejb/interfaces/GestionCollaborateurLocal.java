/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.interfaces;

import com.miage.miaejb.entity.Collaborateur;
import com.miage.miaejb.entity.Equipe;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface GestionCollaborateurLocal {
    public List<Collaborateur> tousLesCollaborateurs();
    public List<Equipe> toutesLesEquipes();
}
