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
 * Interface pour gérer des fonctions liées aux collaborateurs
 *
 * @author David BRISSET
 */
@Local
public interface GestionCollaborateurLocal {

    /**
     * Permet d'obtenir la liste de tous les collaborateurs
     *
     * @return , liste des collaborateurs
     */
    public List<Collaborateur> tousLesCollaborateurs();

    /**
     * Permet d'obtenir la lsite des toutes les équipes
     *
     * @return , liste des équipes
     */
    public List<Equipe> toutesLesEquipes();
}
