package TEST2;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        String işlemSecenekleri="bakiye görüntülüme-->1"
                +"\npara cekmek-->2"
                +"\nfarklı hesaba gecmek için -->3"
                +"\ncıkış için-->4";

        Scanner scan=new Scanner(System.in);

        double bilalBakiye=2450;
        String bilalIban="TR7855 4785 4758 4658 48568";
        String bilalKullanıcı="bilal12";
        String bilalSifre="123";

        double enesBakiye=1200;
        String enesIban="TR7855 4785 4758 4658 6758";
        String enesKullanıcı="enes12";
        String enesSifre="456";

        System.out.println("ATM 'ye Hoşgeldiniz...");
        System.out.println("lütfen bilgilerinizi giriniz..");
        System.out.println("Kullanıcı Adı:");
        String kullanıcıAdı=scan.nextLine();//*****(kullanıcı adı)
        System.out.println("lütfen şifrenizi girniz..");
        String sifre=scan.nextLine();//****(sifre)


        if(kullanıcıAdı.equals(bilalKullanıcı) && sifre.equals(bilalSifre)){
            System.out.println("bilal camur hesabına giriş yapıldı..");
            System.out.println(işlemSecenekleri);

            System.out.println("lütfen bir secim yapınız..");
            String secim=scan.nextLine();

            switch (secim){
                case "1"://secimi string olarak atadıgım için cift tırnak yani string alıyorum..
                    System.out.println("bakiyeniz: "+bilalBakiye);
                    break;
                    //---------------
                case "2":
                    System.out.print("lütfen cekmek istediğiniz tutarı yazınız..");
                    int cekilecekTutar= scan.nextInt();
                    scan.nextLine();
                    if(cekilecekTutar<=bilalBakiye){
                        bilalBakiye-=cekilecekTutar;
                        System.out.println("kalan tutar: "+bilalBakiye);
                    }else{
                        System.out.println("bakiyenizden fazla para cekemezsiniz..");
                    }
                    break;
                    //----------------enesi ben yapayım..
                case "3":

                    System.out.println("Yatırmak istediğniz tutarı giriniz");
                    int yatırılacakTutar= scan.nextInt();

                    if(yatırılacakTutar<=bilalBakiye){
                        System.out.println("ıban giriniz..");
                        scan.nextLine();
                        String yatırılacakIban=scan.nextLine();
                        if(yatırılacakIban.equals(enesIban)){
                            System.out.println("para enes bayram adına yatırıldı...");
                            bilalBakiye-=yatırılacakTutar;
                            enesBakiye+=yatırılacakTutar;
                            System.out.println("bilal bakiyeniz: "+bilalBakiye);
                            System.out.println("enesin bakiye:"+enesBakiye);
                        }
                    }
                    break;
                case "4":
                    System.out.println("işleminiz başarıyla gercekleşti..iyi günler");
                    break;
            }




        }else if(kullanıcıAdı.equals(enesKullanıcı)&&sifre.equals(enesSifre)){
            System.out.println("enes bayram hesabına giriş yapıldı");
            System.out.println(işlemSecenekleri);
        }else{
            System.out.println("kullaıcı adı veya şifre yanlış girilmişitr..");
        }





    }
}
