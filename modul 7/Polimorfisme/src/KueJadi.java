public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga(){
        return super.harga * jumlah * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJumlah: " + jumlah + " pcs";
    }
}
