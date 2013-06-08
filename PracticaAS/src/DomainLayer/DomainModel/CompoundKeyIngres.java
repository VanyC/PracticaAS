/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Vane
 */
public class CompoundKeyIngres implements Serializable{
    private Date dataInici;
    private String nTs;

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public String getnTs() {
        return nTs;
    }

    public void setnTs(String nTs) {
        this.nTs = nTs;
    }

    public CompoundKeyIngres(Date dataInici, String nTs) {
        this.dataInici = dataInici;
        this.nTs = nTs;
    }
}
