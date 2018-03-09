package recepcija.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Petar
 */
@Entity
@Table
public class Soba implements Serializable {

    @Id
    @GeneratedValue
    private int sobaID;

    private boolean telefon;
    private boolean internet;
    private int brojLezaja;
    private int kat;
    private int brojObroka;

    @OneToMany(mappedBy = "soba")
    private List<Rezervacija> rezervacije;

    public List<Rezervacija> getRezervacije() {
        return rezervacije;
    }

    public void setRezervacije(List<Rezervacija> rezervacije) {
        this.rezervacije = rezervacije;
    }

    public int getSobaID() {
        return sobaID;
    }

    public void setSobaID(int sobaID) {
        this.sobaID = sobaID;
    }

    public boolean isTelefon() {
        return telefon;
    }

    public void setTelefon(boolean telefon) {
        this.telefon = telefon;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public int getBrojLezaja() {
        return brojLezaja;
    }

    public void setBrojLezaja(int brojLezaja) {
        this.brojLezaja = brojLezaja;
    }

    public int getKat() {
        return kat;
    }

    public void setKat(int kat) {
        this.kat = kat;
    }

    public int getBrojObroka() {
        return brojObroka;
    }

    public void setBrojObroka(int brojObroka) {
        this.brojObroka = brojObroka;
    }
}
