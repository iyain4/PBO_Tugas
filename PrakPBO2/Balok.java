package PrakPBO2;
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private float tinggi;
    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        setTinggi(tinggi);
    }
    public void setTinggi(int tinggi) {
        float t = (float) tinggi;
        this.tinggi = t;
    }
    public float getTinggi() {
        return tinggi;
    }
    @Override
    public float volume() {
        return ((super.luas())*(getTinggi()));
    }
    @Override
    public float luasPermukaan() {
        return ((2*(super.luas())) + (2*(super.getPanjang())*(getTinggi()))+(2*(super.getLebar())*(this.tinggi)));
    }
    
}