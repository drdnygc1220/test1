package SsgCONSTRUCTOR;

public class C02Araba {
   static CO1Constructor obje=new CO1Constructor();
    String marka;
    String model;
    int yıl;
    String renk;
    String yakıtTipi;
    String fiyat;
    int id;
    //id methodunu constructor ismiyle alalım.


    public C02Araba(String marka, String model, String renk) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        System.out.println("fiyat belirtilmedi..");

    }

    public C02Araba(String marka, String model, int yıl, String renk, String yakıtTipi, String fiyat) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
        this.renk = renk;
        this.yakıtTipi = yakıtTipi;
        this.fiyat = fiyat;
        //obje üzerinden cektik
        id= obje.idAtama();//co1 den cektik

    }

    public C02Araba() {
    }

    @Override
    public String toString() {
        return "C02Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yıl=" + yıl +
                ", renk='" + renk + '\'' +
                ", yakıtTipi='" + yakıtTipi + '\'' +
                ", fiyat='" + fiyat + '\'' +
                ", id=" + id +
                '}';
    }
    //methodların oldugu classta kullanılabilir...
    public void yaz(){
        System.out.println(obje);
    }
}
