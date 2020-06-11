/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.sessionbeans;

import com.miage.miaejb.entity.Competence;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface CompetenceFacadeLocal {

    void create(Competence competence);

    void edit(Competence competence);

    void remove(Competence competence);

    Competence find(Object id);

    List<Competence> findAll();

    List<Competence> findRange(int[] range);

    int count();
    
}
