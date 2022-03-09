package PrakPBO2;
public class Tabung extends Lingkaran implements MenghitungRuang{
    
    private float tinggi;
    public Tabung(int tinggi, int jariJari) {
        super(jariJari);
        setTinggi(tinggi);
    }

    public void setTinggi(int tinggi) {
        float tin = (float) tinggi;
        this.tinggi = tin;
    }
    @Override
    public float volume() {
        return ((super.luas())*(this.tinggi));
    }
    @Override
    public float luasPermukaan() {
        return ((2* (super.luas()))+((this.tinggi)*(super.keliling())));
    }
}