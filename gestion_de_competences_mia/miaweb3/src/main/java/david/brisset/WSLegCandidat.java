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
@WebService(serviceName = "WSLegCandidat")
public class WSLegCandidat {

    @EJB
    private ExpoLegLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "consulterOffres")
    public List<FichePoste> consulterOffres() {
        return this.ejbRef.consulterOffres();
    }

    @WebMethod(operationName = "detailOffre")
    public FichePoste detailOffre(@WebParam(name = "idFichePoste") String idFichePoste) {
        long idF = Long.parseLong(idFichePoste);
        return this.ejbRef.detailOffre(idF);
    }

    @WebMethod(operationName = "candidater")
    @Oneway
    public void candidater(@WebParam(name = "idFichePoste") String idFichePoste, @WebParam(name = "idCandidat") String idCandidat) {
        long idF = Long.parseLong(idFichePoste);
        long idC = Long.parseLong(idCandidat);
        this.ejbRef.candidater(idF, idC);
    }
}
