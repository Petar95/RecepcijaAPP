package recepcija.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Gost {

    private int gostID;
    private String ime;
    private String prezime;
    private int OIB;
    private String telefon;
    private Rezervacija rezervacija;

    @GeneratedValue
    @Id

    public int getGostID() {
        return gostID;
    }

    public void setGostID(int gostID) {
        this.gostID = gostID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getOIB() {
        return OIB;
    }

    public void setOIB(int OIB) {
        this.OIB = OIB;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Rezervacija getRezervacija() {
        return rezervacija;
    }

    public void setRezervacija(Rezervacija rezervacija) {
        this.rezervacija = rezervacija;
    }

}
