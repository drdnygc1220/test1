package SsgENCAPSULATION;

import java.util.Scanner;

public class C04_TasıtRunner {
    public static void main(String[] args) {
        //CO3 den bir tane taşıt oluşturalım..
        Scanner scan=new Scanner(System.in);
        C03_Taşıt tasıt=new C03_Taşıt();//obje oluşturdu..

        System.out.println("lütfen taşıt türünü giriniz..");
        tasıt.setTasıtTuru(scan.nextLine());//kullanıcıdan almak istediğimizde böyle yapıyoruz.

        System.out.println("lütfen taşıtın muayenesi var mı?");
        tasıt.setMuayenesiVarmı(scan.nextBoolean());
        scan.nextLine();//lampi..nextınt ve nextboolean dan sonra nextlıne girmek hayat kurtarır..

        System.out.println("vites turu");
        tasıt.setVitesTuru(scan.nextLine());

        System.out.println("kaç vites");
        tasıt.setKacVites(scan.nextInt());

        //liste nasıl oluşturulur: List<C03_Encapsulation>
        //MAP de nasıl oluşturulur:Map<Integer,C03_Encapsulation>...ınteger yerine ID kullanabiliriz..
        System.out.println(tasıt);









    }
}
