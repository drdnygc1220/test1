package SsgINHERİTANCE;

public class C01_İnsanKaynakları {
    //kişisel bilgiler
    //private oldugunda get set kullanılır public varsa gerek yok
    private static int sayac=100;
    int id;
  public  String isim;
   public String Soyisim;
   public String telefon;
  public    String adres;

    public int idAtama(){
        id=sayac;
        sayac++;
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String soyisim) {
        Soyisim = soyisim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}

