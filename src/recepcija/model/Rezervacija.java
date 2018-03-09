package recepcija.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// @author Petar
@Entity
@Table
public class Rezervacija implements Serializable {

    private int rezervacijaID;
    private Date datumPolaska;
    private Date datumDolaska;
    private int brojOsoba;
    private int brojSobe;
    @ManyToOne
    private Soba soba;

    @Id
    @GeneratedValue

    public int getRezervacijaID() {
        return rezervacijaID;
    }

    public void setRezervacijaID(int rezervacijaID) {
        this.rezervacijaID = rezervacijaID;
    }

    public Date getDatumPolaska() {
        return datumPolaska;
    }

    public void setDatumPolaska(Date datumPolaska) {
        this.datumPolaska = datumPolaska;
    }

    public Date getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(Date datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    public int getBrojOsoba() {
        return brojOsoba;
    }

    public void setBrojOsoba(int brojOsoba) {
        this.brojOsoba = brojOsoba;
    }

    public int getBrojSobe() {
        return brojSobe;
    }

    public void setBrojSobe(int brojSobe) {
        this.brojSobe = brojSobe;
    }

    public Soba getSoba() {
        return soba;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
    }
}
