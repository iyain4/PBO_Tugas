package PrakPBO2;
public class Lingkaran implements MenghitungBidang{
    private final float phi = 3.14f;
    private float jariJari;
    public Lingkaran(int jariJari) {
        setJariJari(jariJari);
    }
    public void setJariJari(int jariJari) {
        float r = (float) jariJari;
        this.jariJari = r;
    }
    @Override
    public float luas() {
        return ((this.phi)*(this.jariJari)*(this.jariJari));
    }
    @Override
    public float keliling() {
        return (2*(this.phi)*(this.jariJari));
    }
}