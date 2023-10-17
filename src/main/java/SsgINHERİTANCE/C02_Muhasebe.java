package SsgINHERİTANCE;

public class C02_Muhasebe extends C01_İnsanKaynakları {
   public int saatUcreti;
   public int calışmaSati;
   public int kacGunCalıştı;
   public int maas;

   //maaş hesaplama methodu oluşturacagız..
    public int maasHesaplama(){
        maas=saatUcreti*calışmaSati*kacGunCalıştı;
        return maas;
    }

    public int getSaatUcreti() {
        return saatUcreti;
    }

    public void setSaatUcreti(int saatUcreti) {
        this.saatUcreti = saatUcreti;
    }

    public int getCalışmaSati() {
        return calışmaSati;
    }

    public void setCalışmaSati(int calışmaSati) {
        this.calışmaSati = calışmaSati;
    }

    public int getKacGunCalıştı() {
        return kacGunCalıştı;
    }

    public void setKacGunCalıştı(int kacGunCalıştı) {
        this.kacGunCalıştı = kacGunCalıştı;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    //toString burada yaparsak diğer dosya private oldugundan diğerlerini yazdırmaz..
    // o yüzden en altaki clasda yapacagız..
}
