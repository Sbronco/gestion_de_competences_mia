/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaweb.ws;

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
@WebService(serviceName = "WSLegCEO")
public class WSLegCEO {

    @EJB
    private ExpoLegLocal ejbRef;
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getNbCandidature")
    public int getNbCandidature(@WebParam(name="status") String status) {
        return this.ejbRef.getNbCandidature(status);
    }

    @WebMethod(operationName = "getNbCompetenceSouffrance")
    public int getNbCompetenceSouffrance() {
       return this.ejbRef.getNbCompetenceSouffrance();
    }

    @WebMethod(operationName = "getNbFichePoste")
    public int getNbFichePoste(@WebParam(name="status") String status) {
        return this.ejbRef.getNbFichePoste(status);
    }

    @WebMethod(operationName = "getNbCompetence")
    public int getNbCompetence() {
        return this.ejbRef.getNbCompetence();
    }
}
