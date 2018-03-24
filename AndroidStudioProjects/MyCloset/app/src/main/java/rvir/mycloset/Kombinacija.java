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
public class Kombinacija {
    private int id;
    private int poletje;
    private int pomlad;
    private int zima;
    private int jesen;
    private int priloznost;
    private Oblacilo povrhnje;
    private Oblacilo top;
    private Oblacilo bottom;

    public Kombinacija(int id, int poletje, int pomlad, int zima, int jesen, int priloznost, Oblacilo povrhnje, Oblacilo top, Oblacilo bottom) {
        this.id = id;
        this.poletje = poletje;
        this.pomlad = pomlad;
        this.zima = zima;
        this.jesen = jesen;
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
