package recepcija.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// @author Petar
@Entity
@Table
public class Rezervacija extends Entitet implements Serializable {

    @Id
    @GeneratedValue

    private Date datumPolaska;
    private Date datumDolaska;
    private int brojOsoba;

    @ManyToOne
    private Soba soba;

    @ManyToMany
    private List<Usluga> usluge = new ArrayList<>();

    @ManyToMany
    private List<Gost> gosti = new ArrayList<>();

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

    public Soba getSoba() {
        return soba;
    }

    public void setSoba(Soba soba) {
        this.soba = soba;
    }
}
