/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainLayer.DomainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author Vane
 */
@Embeddable
public class CompoundKeyIngres implements Serializable{
    @Column(name="dataInici")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInici;
    @Column(name="nTs")
    private String nTs;

    public CompoundKeyIngres() {
    }

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
