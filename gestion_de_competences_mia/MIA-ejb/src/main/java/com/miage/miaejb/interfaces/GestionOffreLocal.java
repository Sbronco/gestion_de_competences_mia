/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.interfaces;

import com.miage.miaejb.entity.FichePoste;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface GestionOffreLocal {
    public List<FichePoste> consulterOffres();
    public FichePoste detailOffre(long idFichePoste);
    public int getNbFichePoste (String status);
    public void candidater(long idFichePoste, long idCandidat);
}
