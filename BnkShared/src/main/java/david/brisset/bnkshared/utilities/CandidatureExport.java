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

    public CandidatureExport() {
    }

    public CandidatureExport(long id, Date dateCandidature, String status) {
        this.id = id;
        this.dateCandidature = dateCandidature;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateCandidature() {
        return dateCandidature;
    }

    public void setDateCandidature(Date dateCandidature) {
        this.dateCandidature = dateCandidature;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
