/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miage.miaejb.exposition;

import com.miage.miaejb.entity.Competence;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author David BRISSET
 */
@Local
public interface ExpoLegLocal {
    public List<Competence> listerCompetences(long idEquipe);

    public void demandeCompetence(long idEquipe, long idCompetence);
}
