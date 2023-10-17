package SsgINHERİTANCE;

import MaceraOyunu.Main;

public class C03_İsci extends C02_Muhasebe{
    public static void main(String[] args) {
        C03_İsci isci=new C03_İsci("FEYYAZ"," YAĞCI","5068799656","İSTANBUL",12,100,16);
        System.out.println(isci);

    }

    @Override
    public String toString() {
        return "C03_İsci{" +
                "saatUcreti=" + saatUcreti +
                ", calışmaSati=" + calışmaSati +
                ", kacGunCalıştı=" + kacGunCalıştı +
                ", maas=" + maas +
                ", id=" + id +
                ", isim='" + isim + '\'' +
                ", Soyisim='" + Soyisim + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
    int mesai;
    int ucret;
    public int fazlaMesai(){
        ucret=mesai*saatUcreti*2;
        return ucret;

    }
    public C03_İsci(){//bos methodu diğer runner clasında daha kolay obje oluşturmak için kullanıyoruz..

    }

    //constructor oluşturduk
    public C03_İsci(String isim,String soyIsım,String telefon,String adres,int calışmaSaati,int saatlikUcreti,int kacGunCalıstı) {
        this.id=idAtama();//insan kaynaklarından geliyor..KENDİMİZ ALDIK..

        this.isim=isim;
        this.Soyisim=soyIsım;//insan kay.soyime,constructor içindeki soyisme eşitliyoruz..

        this.adres=adres;
        //C02 clasından cektik bunları..
        this.telefon=telefon;
        this.calışmaSati=calışmaSaati;
        this.saatUcreti=saatlikUcreti;
        this.kacGunCalıştı=kacGunCalıstı;
        this.maas=maasHesaplama();

    }
}
