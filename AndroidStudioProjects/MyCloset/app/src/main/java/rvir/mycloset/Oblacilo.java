package rvir.mycloset;

/**
 * Created by Eva on 19.3.2018.
 */

public class Oblacilo {
    private int id;
    private String slika;
    private String naziv;
    private int vrsta;
    private int priloznost;
    private LetniCasi letniCasi;
    private Polica polica;

    public Oblacilo(int id, String slika, String naziv, int vrsta, int priloznost, LetniCasi letniCasi, Polica polica) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.priloznost = priloznost;
        this.letniCasi = letniCasi;
        this.polica = polica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getVrsta() {
        return vrsta;
    }

    public void setVrsta(int vrsta) {
        this.vrsta = vrsta;
    }

    public int getPriloznost() {
        return priloznost;
    }

    public void setPriloznost(int priloznost) {
        this.priloznost = priloznost;
    }

    public LetniCasi getLetniCasi() {
        return letniCasi;
    }

    public void setLetniCasi(LetniCasi letniCasi) {
        this.letniCasi = letniCasi;
    }

    public Polica getPolica() {
        return polica;
    }

    public void setPolica(Polica polica) {
        this.polica = polica;
    }
}
