/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.interfremote;


import david.brisset.bnkshared.utilities.CandidatureExport;
import david.brisset.bnkshared.utilities.CompetenceExport;
import david.brisset.bnkshared.utilities.DmdCompExport;
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
    public void validerCandidature(long idCandidature, boolean decision, String flag, long idEquipe );
    public void creerFichePoste(long idDemandeCompetence, String descEnt, String descPoste);
    public List<CandidatureExport> listerCandidature();
}
