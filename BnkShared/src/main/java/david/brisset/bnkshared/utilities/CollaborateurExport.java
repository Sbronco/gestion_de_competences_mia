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
public class CollaborateurExport implements Serializable{
    private long id;
    private CandidatExport candidat;

    public CollaborateurExport() {
    }

    public CollaborateurExport(long id, CandidatExport candidat) {
        this.id = id;
        this.candidat = candidat;
    }

    public CandidatExport getCandidat() {
        return candidat;
    }

    public void setCandidat(CandidatExport candidat) {
        this.candidat = candidat;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
