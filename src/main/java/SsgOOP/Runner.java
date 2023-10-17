package SsgOOP;

public class Runner {
    public static void main(String[] args) {
        FilmKutuphanesi kutuphane=new FilmKutuphanesi();
       Film film1=new Film("yüzüklerin efendisi","main theme",240.30,2001,9.6);
        Film film2=new Film("yüzüklerin efendisi2","father song",240.30,2001,9.6);

        kutuphane.filmEkle(film1);
        kutuphane.filmEkle(film2);
        kutuphane.filmAra("yüzüklerin efendisi");
        kutuphane.isimdenFlimSil("yüzüklerin efendisi");
        kutuphane.filmGüncelle("yüzüklerin efendisi2");
        kutuphane.tumFlimleriListele();




    }
}
