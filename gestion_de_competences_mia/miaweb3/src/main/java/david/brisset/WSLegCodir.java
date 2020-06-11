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
 *
 * @author David BRISSET
 */
@WebService(serviceName = "WSLegCodir")
public class WSLegCodir {

    @EJB
    private ExpoLegLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "validerCompetence")
    public void validerCompetence(@WebParam(name="idDmdCmp") String idDmdCmp, @WebParam(name="status") String status) {
        long idD = Long.parseLong(idDmdCmp);
        this.ejbRef.validerCompetence(idD, status);
    }

    @WebMethod(operationName = "listerDmdComp")
    public List<DmdComp> listerDmdComp(@WebParam(name="status") String status) {
        return this.ejbRef.listerDmdComp(status);
    }

    @WebMethod(operationName = "prononcerCandidature")
    public void prononcerCandidature(@WebParam(name="idCandidature") String idCandidature, @WebParam(name="decision") boolean decision) {
        Long idC = Long.parseLong(idCandidature);
        this.ejbRef.prononcerCandidature(idC, decision);
    }

    
}
