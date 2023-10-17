package SsgOOP;

public class Film {
    //constrıctor:daha kolay ulaşmak için
    private String isim;
    private String muzik;
    private double sure;
    private int yapımYılı;
    private double imdbPuanı;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMuzik() {
        return muzik;
    }

    public void setMuzik(String muzik) {
        this.muzik = muzik;
    }

    public double getSure() {
        return sure;
    }

    public void setSure(double sure) {
        this.sure = sure;
    }

    public int getYapımYılı() {
        return yapımYılı;
    }

    public void setYapımYılı(int yapımYılı) {
        this.yapımYılı = yapımYılı;
    }

    public double getImdbPuanı() {
        return imdbPuanı;
    }

    public void setImdbPuanı(double imdbPuanı) {
        this.imdbPuanı = imdbPuanı;
    }

    public Film(String isim, String muzik, double sure, int yapımYılı, double imdbPuanı) {
        this.isim = isim;
        this.muzik = muzik;
        this.sure = sure;
        this.yapımYılı = yapımYılı;
        this.imdbPuanı = imdbPuanı;
    }
    public void filmBilgileri(){
        System.out.println("Film adı: "+isim);
        System.out.println("Film muziği: "+muzik);
        System.out.println("Film suresi: "+sure);
        System.out.println("film yapım yılı: "+yapımYılı);
        System.out.println("film imdb: "+imdbPuanı);
    }
}
