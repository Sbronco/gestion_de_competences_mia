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
public class DmdCompExport implements Serializable{
    private long id;
    private String status;

    public DmdCompExport(long id, String status) {
        this.id = id;
        this.status = status;
    }

    public DmdCompExport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
