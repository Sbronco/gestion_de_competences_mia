/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;

/**
 *
 * @author David BRISSET
 */
public class FichePosteExport implements Serializable{
    private long id;
    private String descEnt;
    private String descPoste;
    private DmdCompExport dmdcomp;
    
    public FichePosteExport() {
    }

    public FichePosteExport(long id, String descEnt, String descPoste, DmdCompExport dmdcomp) {
        this.id = id;
        this.descEnt = descEnt;
        this.descPoste = descPoste;
        this.dmdcomp = dmdcomp;
    }

    public DmdCompExport getDmdcomp() {
        return dmdcomp;
    }

    public void setDmdcomp(DmdCompExport dmdcomp) {
        this.dmdcomp = dmdcomp;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescEnt() {
        return descEnt;
    }

    public void setDescEnt(String descEnt) {
        this.descEnt = descEnt;
    }

    public String getDescPoste() {
        return descPoste;
    }

    public void setDescPoste(String descPoste) {
        this.descPoste = descPoste;
    }
    
    
}
