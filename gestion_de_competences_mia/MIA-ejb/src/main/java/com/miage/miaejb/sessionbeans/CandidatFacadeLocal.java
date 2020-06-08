/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.sessionbeans;

import com.miage.miaejb.entity.Candidat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface CandidatFacadeLocal {

    void create(Candidat candidat);

    void edit(Candidat candidat);

    void remove(Candidat candidat);

    Candidat find(Object id);

    List<Candidat> findAll();

    List<Candidat> findRange(int[] range);

    int count();
    
}
