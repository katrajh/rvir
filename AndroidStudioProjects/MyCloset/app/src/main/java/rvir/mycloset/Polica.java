package rvir.mycloset;

/**
 * Created by Eva on 19.3.2018.
 */

public class Polica {
    private int id;
    private int kapaciteta;
    private Omara omara;

    public Polica(int id, int kapaciteta, Omara omara) {
        this.id = id;
        this.kapaciteta = kapaciteta;
        this.omara = omara;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKapaciteta() {
        return kapaciteta;
    }

    public void setKapaciteta(int kapaciteta) {
        this.kapaciteta = kapaciteta;
    }

    public Omara getOmara() {
        return omara;
    }

    public void setOmara(Omara omara) {
        this.omara = omara;
    }
}
