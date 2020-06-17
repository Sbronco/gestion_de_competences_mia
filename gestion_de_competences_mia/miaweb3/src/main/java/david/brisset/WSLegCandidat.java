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
 * WebService proposant des fonctions destinées aux candidats
 *
 * @author David BRISSET
 */
@WebService(serviceName = "WSLegCandidat")
public class WSLegCandidat {

    @EJB
    private ExpoLegLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    /**
     * Permet d'obtenir la liste des offres
     *
     * @return , la liste des offres
     */
    @WebMethod(operationName = "consulterOffres")
    public List<FichePoste> consulterOffres() {
        return this.ejbRef.consulterOffres();
    }

    /**
     * Permet d'obtenir les détails d'une offre
     *
     * @param idFichePoste , identifiant de l'offre
     * @return , l'offre a regarde
     */
    @WebMethod(operationName = "detailOffre")
    public FichePoste detailOffre(@WebParam(name = "idFichePoste") String idFichePoste) {
        long idF = Long.parseLong(idFichePoste);
        return this.ejbRef.detailOffre(idF);
    }

    /**
     * Permet à un candidat de candidater
     *
     * @param idFichePoste , identifiant d'une fiche de poste
     * @param idCandidat , identifiant d'un candidat
     */
    @WebMethod(operationName = "candidater")
    @Oneway
    public void candidater(@WebParam(name = "idFichePoste") String idFichePoste, @WebParam(name = "idCandidat") String idCandidat) {
        long idF = Long.parseLong(idFichePoste);
        long idC = Long.parseLong(idCandidat);
        this.ejbRef.candidater(idF, idC);
    }
}
