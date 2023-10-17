package SsgENCAPSULATION;

public class C01_Okul {
    private String okulIsmı="Techpro koleji";
    private int ogrenciSayısı=80;
    private   int ogretmenSayısı=80;
    private String mudur="Ali Can";
    private int sınıfSayı=80;
    private String mudurYardımcısı="veli can";
    private   String mudurYardımcısı2="hasan can";

    public String getOkulIsmı() {//get parametresiz constructor,set parametreli constructor
        return okulIsmı;
    }

    public void setOkulIsmı(String okulIsmı) {
        this.okulIsmı = okulIsmı;
    }

    public int getOgrenciSayısı() {
        return ogrenciSayısı;
    }

    public void setOgrenciSayısı(int ogrenciSayısı) {
        this.ogrenciSayısı = ogrenciSayısı;
    }

    public int getOgretmenSayısı() {
        return ogretmenSayısı;
    }

    public void setOgretmenSayısı(int ogretmenSayısı) {
        this.ogretmenSayısı = ogretmenSayısı;
    }

    public String getMudur() {
        return mudur;
    }

    public void setMudur(String mudur) {
        this.mudur = mudur;
    }

    public String getMudurYardımcısı() {
        return mudurYardımcısı;
    }

    public void setMudurYardımcısı(String mudurYardımcısı) {
        this.mudurYardımcısı = mudurYardımcısı;
    }

    public String getMudurYardımcısı2() {
        return mudurYardımcısı2;
    }

    public void setMudurYardımcısı2(String mudurYardımcısı2) {
        this.mudurYardımcısı2 = mudurYardımcısı2;
    }

    @Override
    public String toString() {
        return "C01_Encapsulation{" +
                "okulIsmı='" + okulIsmı + '\'' +
                ", ogrenciSayısı=" + ogrenciSayısı +
                ", ogretmenSayısı=" + ogretmenSayısı +
                ", mudur='" + mudur + '\'' +
                ", sınıfSayı=" + sınıfSayı +
                ", mudurYardımcısı='" + mudurYardımcısı + '\'' +
                ", mudurYardımcısı2='" + mudurYardımcısı2 + '\'' +
                '}';
    }
}
