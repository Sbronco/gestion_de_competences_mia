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
 * Interface pour gérer des fonctions liées aux offres
 *
 * @author David BRISSET
 */
@Local
public interface GestionOffreLocal {

    /**
     * Permet d'obtenir la liste des offres
     *
     * @return , la liste des offres
     */
    public List<FichePoste> consulterOffres();

    /**
     * Permet d'obtenir les détails d'une offre
     *
     * @param idFichePoste , identifiant de l'offre
     * @return , l'offre a regarde
     */
    public FichePoste detailOffre(long idFichePoste);

    /**
     * Permet d'obtenir le nombre de fiche de poste suivant leur status
     *
     * @param status , status a filtrer
     * @return , nombre de fiche de poste filtré
     */
    public int getNbFichePoste(String status);

    /**
     * Permet à un candidat de candidater
     *
     * @param idFichePoste , identifiant d'une fiche de poste
     * @param idCandidat , identifiant d'un candidat
     */
    public void candidater(long idFichePoste, long idCandidat);
}
