/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset;

import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.entity.DmdComp;
import com.miage.miaejb.entity.FichePoste;
import com.miage.miaejb.exposition.ExpoLegLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * WebService proposant des fonctions destinées à la Codir
 *
 * @author David BRISSET
 */
@WebService(serviceName = "WSLegCodir")
public class WSLegCodir {

    @EJB
    private ExpoLegLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    /**
     * Permet de valider ou de refuser une demande de compétence
     *
     * @param idDmdCmp , identifiant de la demande de coméptence
     * @param status , status de la décision
     */
    @WebMethod(operationName = "validerCompetence")
    public void validerCompetence(@WebParam(name = "idDmdCmp") String idDmdCmp, @WebParam(name = "status") String status) {
        long idD = Long.parseLong(idDmdCmp);
        this.ejbRef.validerCompetence(idD, status);
    }

    /**
     * Permet d'obtenir la liste des demandes de compétence suivant leur status
     *
     * @param status , status à filter
     * @return , liste des demandes de compétences filtrées
     */
    @WebMethod(operationName = "listerDmdComp")
    public List<DmdComp> listerDmdComp(@WebParam(name = "status") String status) {
        return this.ejbRef.listerDmdComp(status);
    }

    /**
     * Permet au codir d'accepter ou de refuser une candidature
     *
     * @param idCandidature , identifiant d'une candidature
     * @param decision , représente la décision du codir (oui/non)
     */
    @WebMethod(operationName = "prononcerCandidature")
    public void prononcerCandidature(@WebParam(name = "idCandidature") String idCandidature, @WebParam(name = "decision") boolean decision) {
        Long idC = Long.parseLong(idCandidature);
        this.ejbRef.prononcerCandidature(idC, decision);
    }

}
