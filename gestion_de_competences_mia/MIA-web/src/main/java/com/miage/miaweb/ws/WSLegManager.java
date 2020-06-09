package com.miage.miaweb.ws;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.miage.miaejb.entity.Competence;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.miage.miaejb.exposition.ExpoLegLocal;

/**
 *
 * @author David BRISSET
 */
@WebService(serviceName = "WSLegManager")
public class WSLegManager {

    @EJB
    private ExpoLegLocal ejbRef;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "listerCompetences")
    public List<Competence> listerCompetences(@WebParam(name="idEquipe") String idEquipe){
        Long idE = Long.parseLong(idEquipe);
        return ejbRef.listerCompetences(idE);
    }

    @WebMethod(operationName = "demandeCompetence")
    @Oneway
    public void demandeCompetence(@WebParam(name="idEquipe") String idEquipe,@WebParam(name="idCompetence") String idCompetence){
        Long idE = Long.parseLong(idEquipe);
        Long idC = Long.parseLong(idCompetence);
        ejbRef.demandeCompetence(idE, idC);
    }
}
