package fi.academy.forum;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Viesti {
    @Id @GeneratedValue
    private Integer id;
    private String teksti;
    private LocalDate aikaleima;

    @ManyToOne
    @JoinColumn
    public Kayttaja kayttaja;
    private Integer laskuri;
    private String otsikko;

    public Viesti() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeksti() {
        return teksti;
    }

    public void setTeksti(String teksti) {
        this.teksti = teksti;
    }

    public LocalDate getAikaleima() {
        return aikaleima;
    }

    public void setAikaleima(LocalDate aikaleima) {
        this.aikaleima = aikaleima;
    }


    public Integer getLaskuri() {
        return laskuri;
    }

    public void setLaskuri(Integer laskuri) {
        this.laskuri = laskuri;
    }

    public String getOtsikko() {
        return otsikko;
    }

    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    public Kayttaja getKayttaja() {
        return kayttaja;
    }

    public void setKayttaja(Kayttaja kayttaja) {
        this.kayttaja = kayttaja;
    }
}
