package TEST1;

import java.util.Scanner;

/*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/
public class BİLET {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Gitmek İstediğiniz Şehri Seçiniz : " +
                "\nB Şehri" +
                "\nC Şehri" +
                "\nD Şehri");
        char select = scan.nextLine().charAt(0);
        System.out.print("Yaşınız Giriniz : ");
        int age = scan.nextInt();
        scan.nextLine();

        switch (select) {
            case 'B':
                double b = Cities.B.getDistance() * 0.10;//km fiyat hesaplaması
                tekMiCiftMi(b,age);
                break;
            case 'C':
                double c = Cities.C.getDistance() * 0.10;
                tekMiCiftMi(c, age);
                break;
            case 'D':
                double d = Cities.D.getDistance();
                tekMiCiftMi(d, age);
                break;
            default:
                System.out.println("Böyle bir şehir yok");
                break;


        }


    }

    /*
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
     */




    private static void tekMiCiftMi(double kmPrice, int age) {
        System.out.println("1-Tek Yön" +
                "\n2-Çift Yön");
        int secim = scan.nextInt();
        if (secim == 1) {
            if (age >= 0 && age < 12) {
                System.out.println("Bilet Tutarınız :" + kmPrice * 0.5);
            } else if (age >= 12 && age < 24) {
                System.out.println("Bilet Tutarınız :" + kmPrice * 0.9);
            } else if (age >= 24 && age <= 65) {
                System.out.println("Bilet Tutarınız :" + kmPrice * 1);
            } else if (age > 65) {
                System.out.println("Bilet Tutarınız :" + kmPrice * 0.7);
            } else {
                System.out.println("Yaşınız 0'dan küçük olamaz.");
            }

        }
        if (secim == 2) {
            if (age >= 0 && age < 12) {
                System.out.println("Toplam Bilet Tutarınız :" + ((kmPrice * 0.5) * 0.8)*2);
            } else if (age >= 12 && age < 24) {
                System.out.println("Toplam Bilet Tutarınız :" + ((kmPrice * 0.9) * 0.8)*2);
            } else if (age >= 24 && age <= 65) {
                System.out.println("Toplam Bilet Tutarınız :" + ((kmPrice * 1) * 0.8)*2);
            } else if (age > 65) {
                System.out.println("Toplam Bilet Tutarınız :" + ((kmPrice * 0.7) * 0.8)*2);
            } else {
                System.out.println("Toplam Yaşınız 0'dan küçük olamaz.");
            }

        }


    }


}
