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
 * Interface mettant en exposition des fonctions pour les clients légés
 *
 * @author David BRISSET
 */
@Local
public interface ExpoLegLocal {

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
     * Permet d'obtenir la liste des offres
     *
     * @return , la liste des offres
     */
    public List<FichePoste> consulterOffres();

    /**
     * Permet d'obtenir les détails d'une offre
     *
     * @param idFichePoste , identifiant de l'offre
     * @return , l'offre a regarde
     */
    public FichePoste detailOffre(long idFichePoste);

    /**
     * Permet à un candidat de candidater
     *
     * @param idFichePoste , identifiant d'une fiche de poste
     * @param idCandidat , identifiant d'un candidat
     */
    public void candidater(long idFichePoste, long idCandidat);

    /**
     * Permet d'obtenir le nombre de candidature filtré par leur status
     *
     * @param status , status des candidatures qu'on souhaite garder
     * @return , le nombre de candidature filtré
     */
    public int getNbCandidature(String status);

    /**
     * Permet d'obtenir le nombre de compétence en souffrance
     *
     * @return , le nombre de compétence en souffrance
     */
    public int getNbCompetenceSouffrance();

    /**
     * Permet d'obtenir le nombre de compétence
     *
     * @return , le nombre de compétence
     */
    public int getNbCompetence();

    /**
     * Permet d'obtenir le nombre de fiche de poste suivant leur status
     *
     * @param status , status a filtrer
     * @return , nombre de fiche de poste filtré
     */
    public int getNbFichePoste(String status);

    /**
     * Permet de valider ou de refuser une demande de compétence
     *
     * @param idDmdCmp , identifiant de la demande de coméptence
     * @param status , status de la décision
     */
    public void validerCompetence(long idDmdCmp, String status);

    /**
     * Permet d'obtenir la liste des demandes de compétence suivant leur status
     *
     * @param status , status à filter
     * @return , liste des demandes de compétences filtrées
     */
    public List<DmdComp> listerDmdComp(String status);

    /**
     * Permet au codir d'accepter ou de refuser une candidature
     *
     * @param idCandidature , identifiant d'une candidature
     * @param decision , représente la décision du codir (oui/non)
     */
    public void prononcerCandidature(long idCandidature, boolean decision);

}
