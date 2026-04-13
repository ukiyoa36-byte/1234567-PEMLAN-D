package aritmatika;
public class Aritmatika {
    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
        System.out.println("nilai penjumlahan adalah : "+nilai);
        hitungPerkalian(a, b); 
    }

    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
        System.out.println("nilai perkalian adalah : "+nilai);
    }

    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
        System.out.println("nilai pengurangan adalah : "+nilai);
    }

    public double hitungPembagian (String a, String b){
        double d = Double.parseDouble(a);
        double e = Double.parseDouble(b);
        double nilai = d/e;
        System.out.println("nilai pembagian adalah : "+nilai);
        return nilai;
    }
}
