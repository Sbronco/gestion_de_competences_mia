/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.sessionbeans;

import com.miage.miaejb.entity.FichePoste;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface FichePosteFacadeLocal {

    void create(FichePoste fichePoste);

    void edit(FichePoste fichePoste);

    void remove(FichePoste fichePoste);

    FichePoste find(Object id);

    List<FichePoste> findAll();

    List<FichePoste> findRange(int[] range);

    int count();
    
}
