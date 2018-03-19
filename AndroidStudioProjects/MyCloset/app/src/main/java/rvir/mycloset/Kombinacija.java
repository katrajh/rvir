package rvir.mycloset;

/**
 * Created by Eva on 19.3.2018.
 */

public class Kombinacija {
    private int id;
    private LetniCasi letniCasi;
    private int priloznost;
    private Oblacilo povrhnje;
    private Oblacilo top;
    private Oblacilo bottom;

    public Kombinacija(int id, LetniCasi letniCasi, int priloznost, Oblacilo povrhnje, Oblacilo top, Oblacilo bottom) {
        this.id = id;
        this.letniCasi = letniCasi;
        this.priloznost = priloznost;
        this.povrhnje = povrhnje;
        this.top = top;
        this.bottom = bottom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LetniCasi getLetniCasi() {
        return letniCasi;
    }

    public void setLetniCasi(LetniCasi letniCasi) {
        this.letniCasi = letniCasi;
    }

    public int getPriloznost() {
        return priloznost;
    }

    public void setPriloznost(int priloznost) {
        this.priloznost = priloznost;
    }

    public Oblacilo getPovrhnje() {
        return povrhnje;
    }

    public void setPovrhnje(Oblacilo povrhnje) {
        this.povrhnje = povrhnje;
    }

    public Oblacilo getTop() {
        return top;
    }

    public void setTop(Oblacilo top) {
        this.top = top;
    }

    public Oblacilo getBottom() {
        return bottom;
    }

    public void setBottom(Oblacilo bottom) {
        this.bottom = bottom;
    }
}
