package rvir.mycloset;

/**
 * Created by Eva on 19.3.2018.
 */
/*vse spremenljivke lahko zasedejo vrednosti:
    0-oblačilo se ne nosi v določenem letnem času
    1-oblačilo se nosi v določenem letnem času
    2-oblačilo se nosi v določenem letnem času v kombinaciji
    z drugim oblačilom
 */
public class Oblacilo {
    private int id;
    private String slika;
    private String naziv;
    private int vrsta;
    private int priloznost;
    private int poletje;
    private int pomlad;
    private int zima;
    private int jesen;
    private Polica polica;

    public Oblacilo(int id, String slika, String naziv, int vrsta, int priloznost, int poletje, int pomlad, int zima, int jesen, Polica polica) {
        this.id = id;
        this.slika = slika;
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.priloznost = priloznost;
        this.poletje = poletje;
        this.pomlad = pomlad;
        this.zima = zima;
        this.jesen = jesen;
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

    public Polica getPolica() {
        return polica;
    }

    public void setPolica(Polica polica) {
        this.polica = polica;
    }

    public int getPoletje() {
        return poletje;
    }

    public void setPoletje(int poletje) {
        this.poletje = poletje;
    }

    public int getPomlad() {
        return pomlad;
    }

    public void setPomlad(int pomlad) {
        this.pomlad = pomlad;
    }

    public int getZima() {
        return zima;
    }

    public void setZima(int zima) {
        this.zima = zima;
    }

    public int getJesen() {
        return jesen;
    }

    public void setJesen(int jesen) {
        this.jesen = jesen;
    }
}
