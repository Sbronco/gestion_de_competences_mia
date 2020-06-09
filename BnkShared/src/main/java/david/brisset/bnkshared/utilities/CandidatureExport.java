/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david.brisset.bnkshared.utilities;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author David BRISSET
 */
public class CandidatureExport implements Serializable{
    private long id;
    private Date dateCandidature;
    private String status;

    public CandidatureExport(long id, Date dateCandidature, String status) {
        this.id = id;
        this.dateCandidature = dateCandidature;
        this.status = status;
    }

    public CandidatureExport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
