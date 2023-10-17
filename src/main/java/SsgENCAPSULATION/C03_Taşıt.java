package SsgENCAPSULATION;

public class C03_Taşıt {
    //4 tane variable ekledik....
    String tasıtTuru;
    boolean muayenesiVarmı;
    String vitesTuru;
    int kacVites;

    public String getTasıtTuru() {
        return tasıtTuru;
    }

    public void setTasıtTuru(String tasıtTuru) {
        this.tasıtTuru = tasıtTuru;
    }

    public boolean isMuayenesiVarmı() {
        return muayenesiVarmı;
    }

    public void setMuayenesiVarmı(boolean muayenesiVarmı) {
        this.muayenesiVarmı = muayenesiVarmı;
    }

    public String getVitesTuru() {
        return vitesTuru;
    }

    public void setVitesTuru(String vitesTuru) {
        this.vitesTuru = vitesTuru;
    }

    public int getKacVites() {
        return kacVites;
    }

    public void setKacVites(int kacVites) {
        this.kacVites = kacVites;
    }

    @Override
    public String toString() {
        return "C03_Encapsulation{" +
                "tasıtTuru='" + tasıtTuru + '\'' +
                ", muayenesiVarmı=" + muayenesiVarmı +
                ", vitesTuru='" + vitesTuru + '\'' +
                ", kacVites=" + kacVites +
                '}';
    }
}
