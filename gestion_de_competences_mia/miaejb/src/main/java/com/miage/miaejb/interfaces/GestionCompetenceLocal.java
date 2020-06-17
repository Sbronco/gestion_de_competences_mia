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
 * Interface pour gérer des fonctions liées aux compétences
 *
 * @author David BRISSET
 */
@Local
public interface GestionCompetenceLocal {

    /**
     * Retourne la liste des compétences présente dans une équipe
     *
     * @param idEquipe , identifiant de l'équipe
     * @return , liste des compétences suivant une équipe
     */
    public List<Competence> listerCompetences(long idEquipe);

    /**
     * Permet de créer une demande de compétence
     *
     * @param idEquipe , identifiant de l'équipe qui fait la demande de
     * compétence
     * @param idCompetence , identifiant de la compétence demandée
     */
    public void demandeCompetence(long idEquipe, long idCompetence);

    /**
     * Obtenir les coméptences d'un collaborateur
     *
     * @param idCollaborateur , identifiant du collabrateur
     * @return , liste des compétences suivant le collaborateur
     */
    public List<Competence> listerCompetencesCollaborateur(long idCollaborateur);

    /**
     * Permet d'obtenir toutes les demande de compétences
     *
     * @return , liste des demande de coméptences
     */
    public List<DmdComp> listerDmdComp();

    /**
     * Permet d'obtenir toutes les demande de compétences suivant une équipe
     *
     * @param idEquipe , identifiant d'une équipe
     * @return , liste des demandes de compétence suivant une équipe
     */
    public List<DmdComp> listerDmdComp(long idEquipe);

    /**
     * Permet de valider ou de refuser une demande de compétence
     *
     * @param idDmdCmp , identifiant de la demande de coméptence
     * @param status , status de la décision
     */
    public void validerCompetence(long idDmdCmp, String status);

    /**
     * Permet d'obtenir le nombre de compétence
     *
     * @return , le nombre de compétence
     */
    public int getNbCompetence();

    /**
     * Permet d'obtenir le nombre de compétence en souffrance
     *
     * @return , le nombre de compétence en souffrance
     */
    public int getNbCompetenceSouffrance();

    /**
     * Permet d'obtenir la liste des demandes de compétence suivant leur status
     *
     * @param status , status à filter
     * @return , liste des demandes de compétences filtrées
     */
    public List<DmdComp> listerDmdComp(String status);
}
