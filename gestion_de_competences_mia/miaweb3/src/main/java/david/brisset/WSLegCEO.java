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
 * WebService proposant des fonctions destinées au CEO
 *
 * @author David BRISSET
 */
@WebService(serviceName = "WSLegCEO")
public class WSLegCEO {

    @EJB
    private ExpoLegLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    /**
     * Permet d'obtenir le nombre de candidature filtré par leur status
     *
     * @param status , status des candidatures qu'on souhaite garder
     * @return , le nombre de candidature filtré
     */
    @WebMethod(operationName = "getNbCandidature")
    public int getNbCandidature(@WebParam(name = "status") String status) {
        return this.ejbRef.getNbCandidature(status);
    }

    /**
     * Permet d'obtenir le nombre de compétence en souffrance
     *
     * @return , le nombre de compétence en souffrance
     */
    @WebMethod(operationName = "getNbCompetenceSouffrance")
    public int getNbCompetenceSouffrance() {
        return this.ejbRef.getNbCompetenceSouffrance();
    }

    /**
     * Permet d'obtenir le nombre de fiche de poste suivant leur status
     *
     * @param status , status a filtrer
     * @return , nombre de fiche de poste filtré
     */
    @WebMethod(operationName = "getNbFichePoste")
    public int getNbFichePoste(@WebParam(name = "status") String status) {
        return this.ejbRef.getNbFichePoste(status);
    }

    /**
     * Permet d'obtenir le nombre de compétence
     *
     * @return , le nombre de compétence
     */
    @WebMethod(operationName = "getNbCompetence")
    public int getNbCompetence() {
        return this.ejbRef.getNbCompetence();
    }
}
