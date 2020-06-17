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
 * Interface pour gérer des fonctions liées aux candidatures
 *
 * @author David BRISSET
 */
@Local
public interface GestionCandidatureLocal {

    /**
     * Permet de valider une candidature et transformer le candidat en
     * collaborateur
     *
     * @param idCandidature , identifiant d'une candidature
     * @param flag , status du futur collaborateur (Codir, manager, les 2)
     * @param idEquipe , identifiant de l'équipe où va être affectée le
     * collaborateur
     */
    public void validerCandidature(long idCandidature, String flag, long idEquipe);

    /**
     * Permet au codir d'accepter ou de refuser une candidature
     *
     * @param idCandidature , identifiant d'une candidature
     * @param decision , représente la décision du codir (oui/non)
     */
    public void prononcerCandidature(long idCandidature, boolean decision);

    /**
     * Permet de créer une fiche de psote à partir d'une demande de compétence
     *
     * @param idDemandeCompetence , identifiant d'une demande de compétence
     * @param descEnt , description entreprise d'une fiche de psote
     * @param descPoste , description poste d'une fiche de poste
     */
    public void creerFichePoste(long idDemandeCompetence, String descEnt, String descPoste);

    /**
     * Permet d'obtenir la liste de toutes les candidatures
     *
     * @return , la liste des candidatures
     */
    public List<Candidature> listerCandidature();

    /**
     * Permet d'obtenir la liste des candidatures filtrée par leur status
     *
     * @param status , status des candidatures qu'on souhaite garder
     * @return , la liste des candidatures filtrée
     */
    public List<Candidature> listerCandidature(String status);

    /**
     * Permet d'obtenir le nombre de candidature filtré par leur status
     *
     * @param status , status des candidatures qu'on souhaite garder
     * @return , le nombre de candidature filtré
     */
    public int getNbCandidature(String status);
}
