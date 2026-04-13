public class MainKue {
    public static void main(String[] args) {
        Kue [] kue = new Kue [20];

        kue[0] = new KueJadi("Nastar", 2000, 20);
        kue[1] = new KueJadi("Kastengel", 10000, 10);
        kue[2] = new KueJadi("Putri salju", 24000, 3);
        kue[3] = new KueJadi("Lapis Legit", 29000, 2);
        kue[4] = new KueJadi("Kue Cubit", 20000, 40);
        kue[5] = new KueJadi("Klepon", 32000, 10);
        kue[6] = new KueJadi("Onde-Onde", 2000, 10);
        kue[7] = new KueJadi("Donat", 42000, 60);
        kue[8] = new KueJadi("Brownies", 42000, 24);
        kue[9] = new KueJadi("Bolu Kukus", 52000, 26);
        kue[10] = new KueJadi("Bolu Panggang", 82000, 20);
        kue[11] = new KuePesanan("Kue Lumpur", 2000, 10);
        kue[12] = new KuePesanan("Serabi", 2900, 10);
        kue[13] = new KuePesanan("Dadar Gulung", 5000, 10);
        kue[14] = new KuePesanan("Kue Sus", 20000, 10);
        kue[15] = new KuePesanan("Pie Buah", 30000, 10);
        kue[16] = new KuePesanan("Kue Talam", 2000, 10);
        kue[17] = new KuePesanan("Kue Apem", 1000, 10);
        kue[18] = new KuePesanan("Kue Pancong", 2500, 10);
        kue[19] = new KuePesanan("Kue Bika Ambon", 20000, 10);

        double maxHarga = 0;
        Kue kueTermahal = null;
        for (int i = 0; i < kue.length; i++) {
            if(kue[i] instanceof KueJadi){
                System.out.println("Kue Jadi");
            } else if (kue[i] instanceof KuePesanan) {
                System.out.println("Kue Pesanan");
            }
            
            double harga = kue[i].hitungHarga();
            if (harga > maxHarga) {
                maxHarga = harga;
                kueTermahal = kue[i];
            }
            System.out.println(kue[i].toString());
            System.out.println("Harga Total: " + kue[i].hitungHarga());
            System.out.println();
        }

        System.out.println("=== KUE TERMAHAL ===");
        System.out.println(kueTermahal);
        System.out.println("Harga Akhir: " + maxHarga);
        
    }
}
