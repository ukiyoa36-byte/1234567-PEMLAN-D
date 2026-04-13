public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga(){
        return super.harga * berat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBerat: " + berat + " kg";
    }
}
