package PrakPBO2;
public class PersegiPanjang implements MenghitungBidang{
    private float panjang, lebar;
    public PersegiPanjang(int panjang, int lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }
    public void setPanjang(int panjang) {
        float panj = (float) panjang;
        this.panjang = panj;
    }
    public void setLebar(int lebar) {
        float leb = (float) lebar;
        this.lebar = leb;
    }
    public float getPanjang() {
        return panjang;
    }
    public float getLebar() {
        return lebar;
    }
    @Override
    public float luas() {
        return ((getPanjang()) * (getLebar()));
    }
    @Override
    public float keliling() {
        return ((2*(getPanjang()))+(2*(getLebar())));
    }
}