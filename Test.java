import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double kdv;
        double kdvsizFiyat,KDVliFiyat;




        Scanner inp = new Scanner(System.in);
        System.out.print("Fiyat giriniz:");

        kdvsizFiyat = inp.nextInt();
        double tutar = (kdvsizFiyat >= 1000) ? 0.08 : 0.18;

        KDVliFiyat = (kdvsizFiyat * tutar)+kdvsizFiyat;
        System.out.println("KDVli Fiyat:" + KDVliFiyat);
        System.out.println("KDVsiz Fiyat:" + kdvsizFiyat);
        System.out.println("KDV Tutari:" + tutar);





    }
}
