package SsgINHERİTANCE;

public class C04_Memur extends C02_Muhasebe {
    public static void main(String[] args) {
        C04_Memur memur=new C04_Memur("FEYYAZ","YAĞCI","89768558695","TOKAT",12,150,16);
        System.out.println(memur);

    }

    @Override
    public String toString() {
        return "C04_Memur{" +
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

    public C04_Memur(String isim, String soyIsım, String telefon, String adres, int calışmaSaati, int saatlikUcreti, int kacGunCalıstı){
        this.id=idAtama();
        this.isim=isim;
        this.telefon=telefon;
        this.adres=adres;
        this.calışmaSati=calışmaSaati;
        this.saatUcreti=saatlikUcreti;
        this.kacGunCalıştı=kacGunCalıstı;
        this.maas=maasHesaplama();

    }


}
