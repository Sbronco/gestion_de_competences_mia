/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaweb.ws;

import com.miage.miaejb.entity.DmdComp;
import com.miage.miaejb.exposition.ExpoLegLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author David BRISSET
 */
@WebService(serviceName = "WSLegCodir")
public class WSLegCodir {

    @EJB
    private ExpoLegLocal ejbRef;

    /**
     * This is a sample web service operation
     */

    @WebMethod(operationName = "validerCompetence")
    public void validerCompetence(@WebParam(name="idDmdCmp") String idDmdCmp, @WebParam(name="status") String status) {
        long idD = Long.parseLong(idDmdCmp);
        this.ejbRef.validerCompetence(idD, status);
    }

    @WebMethod(operationName = "listerDmdComp")
    public List<DmdComp> listerDmdComp(@WebParam(name="status") String status) {
        return this.ejbRef.listerDmdComp(status);
    }

    @WebMethod(operationName = "validerCandidature")
    public void validerCandidature(@WebParam(name="idCandidature") String idCandidature, @WebParam(name="decision") boolean decision, @WebParam(name="flag") String flag, @WebParam(name="idEquipe") String idEquipe) {
        Long idC = Long.parseLong(idCandidature);
        Long idE = Long.parseLong(idEquipe);
        this.ejbRef.validerCandidature(idC, decision, flag, idE);
    }

}
