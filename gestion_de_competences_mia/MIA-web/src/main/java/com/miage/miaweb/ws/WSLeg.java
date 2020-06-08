package com.miage.miaweb.ws;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.miage.miaejb.entity.Competence;
import com.miage.miaejb.exposition.ExpoLegLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author David BRISSET
 */
@WebService(serviceName = "WSLeg", targetNamespace = "http://my.org/ns/")
public class WSLeg {

    @EJB
    private ExpoLegLocal ejbRef;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "listerCompetences")
    public List<Competence> listerCompetences(String idEquipe){
        Long idE = Long.parseLong(idEquipe);
        return ejbRef.listerCompetences(idE);
    }

    @WebMethod(operationName = "demandeCompetence")
    @Oneway
    public void demandeCompetence(String idEquipe, String idCompetence){
        Long idE = Long.parseLong(idEquipe);
        Long idC = Long.parseLong(idCompetence);
        ejbRef.demandeCompetence(idE, idC);
    }
}
