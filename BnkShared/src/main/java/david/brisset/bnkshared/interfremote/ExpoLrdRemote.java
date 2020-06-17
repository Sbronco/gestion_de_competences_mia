/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.interfremote;

import david.brisset.bnkshared.utilities.CandidatureExport;
import david.brisset.bnkshared.utilities.CollaborateurExport;
import david.brisset.bnkshared.utilities.CompetenceExport;
import david.brisset.bnkshared.utilities.DmdCompExport;
import david.brisset.bnkshared.utilities.EquipeExport;
import java.util.List;
import javax.ejb.Remote;

/**
 * Interface mettant en exposition des fonctions pour les clients lourds
 *
 * @author David BRISSET
 */
@Remote
public interface ExpoLrdRemote {

    /**
     * Obtenir les coméptences d'un collaborateur
     *
     * @param idCollaborateur , identifiant du collabrateur
     * @return , liste des compétences suivant le collaborateur
     */
    public List<CompetenceExport> listerCompetencesCollaborateur(long idCollaborateur);

    /**
     * Permet d'obtenir toutes les demande de compétences
     *
     * @return , liste des demande de coméptences
     */
    public List<DmdCompExport> listerDmdComp();

    /**
     * Permet d'obtenir toutes les demande de compétences suivant une équipe
     *
     * @param idEquipe , identifiant d'une équipe
     * @return , liste des demandes de compétence suivant une équipe
     */
    public List<DmdCompExport> listerDmdComp(long idEquipe);

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
    public List<CandidatureExport> listerCandidature();

    /**
     * Permet d'obtenir la liste des candidatures filtrée par leur status
     *
     * @param status , status des candidatures qu'on souhaite garder
     * @return , la liste des candidatures filtrée
     */
    public List<CandidatureExport> listerCandidature(String status);

    /**
     * Permet d'obtenir la liste des demandes de compétence suivant leur status
     *
     * @param status , status à filter
     * @return , liste des demandes de compétences filtrées
     */
    public List<DmdCompExport> listerDmdComp(String status);

    /**
     * Permet d'obtenir la liste de tous les collaborateurs
     *
     * @return , liste des collaborateurs
     */
    public List<CollaborateurExport> listerCollaborateur();

    /**
     * Permet d'obtenir la lsite des toutes les équipes
     *
     * @return , liste des équipes
     */
    public List<EquipeExport> listerEquipe();
}
