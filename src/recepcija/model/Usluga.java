package recepcija.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table
public class Usluga {

    private int uslugaID;
    private String vrstaUsluge;
    private BigDecimal cijena;

    @Id
    @GeneratedValue

    public int getUslugaID() {
        return uslugaID;
    }

    public void setUslugaID(int uslugaID) {
        this.uslugaID = uslugaID;
    }

    public String getVrstaUsluge() {
        return vrstaUsluge;
    }

    public void setVrstaUsluge(String vrstaUsluge) {
        this.vrstaUsluge = vrstaUsluge;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

}
