package TEST1;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {


        String işlemSecenekleri="1-->Bakiye Görüntüleme" +
                "\n 2-->Para Cekmek"+
                "\n 3-->Para Yatırmak"+
                "\n 0-->Cıkış Yapmak";


        Scanner scan=new Scanner(System.in);
        double feyyazBakiye=5890;
        String feyyazAdı="feyyaz12";
        String parola1="1220";
        String ıban1="TR4565 7896 4976 4868 4675";


        double dürdaneBakiye=3067;
        String dürdaneAdı="dürdane";
        String parola2="456";
        String ıban2="TR5343 8754 3684 3648 3784";

        System.out.println("*****ATM 'YE HOŞGELDİNİZ..");
        System.out.println("lütfen kullanıcı adınızı giriniz..");
        String kullanıcıadı1=scan.nextLine();
        System.out.println("lütfen şifrenizi giriniz:");
        String parola=scan.nextLine();

        if(kullanıcıadı1.equals(feyyazAdı)&&parola.equals(parola1)){
            System.out.println("Feyyaz Yağcının Hesabına Giriş Yapıldı...");
            System.out.println("lütfen yapmak istediğiniz işlemi giriniz...");
            System.out.println(işlemSecenekleri);

            String ıslem=scan.nextLine();
            switch (ıslem){
                case "1":
                    System.out.println("mevcut bakiyeniz:"+feyyazBakiye);
                    break;
                case "2":
                    System.out.println("lütfen cekmek istediğiniz tutarı giriniz...");
                    double tutar=scan.nextDouble();
                    if(tutar<=feyyazBakiye){
                        System.out.println("cekilen tutar"+tutar);
                        feyyazBakiye-=tutar;
                        System.out.println("kalan bakiyeniz:"+feyyazBakiye);
                        System.out.println(işlemSecenekleri);

                    }else{
                        System.out.println("hesabınızda mu miktar bulunmamaktadır..");
                    }
                    break;
                case "3":
                    System.out.println("lütfen yatırmak istediğiniz tutarı giriniz..");
                    double yatırılacakTutar=scan.nextDouble();

                    if(yatırılacakTutar<=feyyazBakiye) {
                        System.out.println("ıban giriniz..");
                        scan.nextLine();
                        String yatırılacakIban = scan.nextLine();

                        if (yatırılacakIban.equals(ıban2)) {
                            System.out.println("Dürdane yağcı adına para gönderilmişitir..");
                            feyyazBakiye -= yatırılacakTutar;
                            dürdaneBakiye+=yatırılacakTutar;
                            System.out.println("Dürdane Hanım bakiyeniz :"+dürdaneBakiye);
                            System.out.println("Feyyaz Bey bakiyeniz :EŞİNİZ SİZİ COK SEVİYOR...:" + feyyazBakiye);

                        } else {
                            System.out.println("lütfen gecerli ıban giriniz..");
                        }
                    }
                    break;
                case "0":
                    System.out.println("cıkış için 0 basınız");

                    break;
                default:
                    System.out.println("hatalı giriş yapyınız lütfen tekrar deneyiniz..");
                    break;
            }






        }
        if(kullanıcıadı1.equals(dürdaneAdı)&&parola.equals(parola2)){
            System.out.println("Dürdene Yağcının Hesabına Giriş Yapıldı...");
            System.out.println("lütfen yapmak istediğiniz işlemi giriniz...");
            System.out.println(işlemSecenekleri);

            String ıslem=scan.nextLine();
            switch (ıslem){
                case "1":
                    System.out.println("mevcut bakiyeniz:"+dürdaneBakiye);
                    break;
                case "2":
                    System.out.println("lütfen cekmek istediğiniz tutarı giriniz...");
                    double tutar=scan.nextDouble();
                    if(tutar<=dürdaneBakiye){
                        System.out.println("cekilen tutar"+tutar);
                        feyyazBakiye-=tutar;
                        System.out.println("kalan bakiyeniz:"+dürdaneBakiye);
                        System.out.println(işlemSecenekleri);

                    }else{
                        System.out.println("hesabınızda mu miktar bulunmamaktadır..");
                    }
                    break;
                case "3":
                    System.out.println("lütfen yatırmak istediğiniz tutarı giriniz..");
                    double yatırılacakTutar=scan.nextDouble();

                    if(yatırılacakTutar<=dürdaneBakiye) {
                        System.out.println("ıban giriniz..");
                        scan.nextLine();
                        String yatırılacakIban = scan.nextLine();

                        if (yatırılacakIban.equals(ıban1)) {
                            System.out.println("Feyyaz yağcı adına para gönderilmiştir..");
                            feyyazBakiye += yatırılacakTutar;
                            dürdaneBakiye-=yatırılacakTutar;
                            System.out.println("Dürdane Hanım bakiyeniz :"+dürdaneBakiye);
                            System.out.println("Feyyaz Bey bakiyeniz :" + feyyazBakiye+"****EŞİNİZ SİZİ COK SEVİYOR...");

                        } else {
                            System.out.println("lütfen gecerli ıban giriniz..");
                        }
                    }
                    break;
                case "0":
                    System.out.println("cıkış için 0 basınız");
                    break;
                default:
                    System.out.println("hatalı giriş yapyınız lütfen tekrar deneyiniz..");
                    break;
            }






        }

    }




}



