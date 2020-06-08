/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.sessionbeans;

import com.miage.miaejb.entity.DmdComp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author David BRISSET
 */
@Stateless
public class DmdCompFacade extends AbstractFacade<DmdComp> implements DmdCompFacadeLocal {

    @PersistenceContext(unitName = "com.miage_MIA-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DmdCompFacade() {
        super(DmdComp.class);
    }
    
}
