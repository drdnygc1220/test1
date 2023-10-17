package SsgINHERİTANCE;

public class ogretmen extends C02_Muhasebe{
    public static void main(String[] args) {
        ogretmen drdn=new ogretmen("FEYYAZ"," YAĞCI","5068799656","İSTANBUL",12,100,16);
        System.out.println(drdn);
        drdn.kacGunCalıştı=20;
        System.out.println(drdn);
        drdn.id=200;
        System.out.println(drdn);

    }

    @Override
    public String toString() {
        return "ogretmen{" +
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

    public ogretmen(String isim, String soyIsım, String telefon, String adres, int calışmaSaati, int saatlikUcreti, int kacGunCalıstı){
        this.id=idAtama();
        this.maas=maasHesaplama();
        this.adres=adres;
        this.saatUcreti=saatlikUcreti;
        this.calışmaSati=calışmaSaati;
        this.kacGunCalıştı=kacGunCalıstı;


    }
}
