/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.sessionbeans;

import com.miage.miaejb.entity.DmdComp;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface DmdCompFacadeLocal {

    void create(DmdComp dmdComp);

    void edit(DmdComp dmdComp);

    void remove(DmdComp dmdComp);

    DmdComp find(Object id);

    List<DmdComp> findAll();

    List<DmdComp> findRange(int[] range);

    int count();
    
}
