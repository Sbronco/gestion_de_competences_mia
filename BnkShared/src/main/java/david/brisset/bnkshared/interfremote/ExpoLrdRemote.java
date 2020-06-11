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
 *
 * @author David BRISSET
 */
@Remote
public interface ExpoLrdRemote {
    public List<CompetenceExport> listerCompetencesCollaborateur(long idCollaborateur);
    public List<DmdCompExport> listerDmdComp();
    public List<DmdCompExport> listerDmdComp(long idEquipe);
    public void validerCandidature(long idCandidature, String flag, long idEquipe );
    public void creerFichePoste(long idDemandeCompetence, String descEnt, String descPoste);
    public List<CandidatureExport> listerCandidature();
    public List<CandidatureExport> listerCandidature(String status);
    public List<DmdCompExport> listerDmdComp(String status);
    public List<CollaborateurExport> listerCollaborateur();
    public List<EquipeExport> listerEquipe();
}
