package SsgOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmKutuphanesi {
    //arama silme ekleme işlemleri yapacagız
    //kütüphane oluşturalım
    private List<Film> filmListesi;//oluşturdugumuz data pojo class ismini alırız genelde,biz oluşturduk

    public FilmKutuphanesi() {
        filmListesi = new ArrayList<>();
    }

    //methodlara geldik
    public void filmEkle(Film yeniFilm) {//parametre ekledik
        filmListesi.add(yeniFilm);
        System.out.println(yeniFilm.getIsim() + "film kutuphaneye basarılı bir şekilde eklendi");

    }

    //silme methodu
    public void filmSilme(Film eskiFilim) {
        filmListesi.remove(eskiFilim);
        System.out.println(eskiFilim.getIsim() + "flim kutuphaneden basarılı bir şekilde silinmiştir");

    }

    public void isimdenFlimSil(String flimAdı) {
        Film w = filmAra(flimAdı);
        if (w == null) {
            System.out.println("film bulunamadıgı için silinemedi");
        } else filmSilme(w);

    }
public void filmGüncelle(String filmAdı){
        for(Film w:filmListesi){
            if (w.getIsim().equalsIgnoreCase(filmAdı)){
                Scanner scan=new Scanner(System.in);
                System.out.println("filmin ismini ne olarak güncellemek istiyorsunuz?");
                String str= scan.nextLine();
                w.setIsim(str);
                w.filmBilgileri();
            }
        }

}



    public Film filmAra(String filmAdı){
        boolean bulundu= false;
        Film a=null;
        for(Film w:filmListesi){
          if (w.getIsim().equalsIgnoreCase(filmAdı)){
              w.filmBilgileri();
              bulundu=true;
              break;
          }

        }
        if(!bulundu){
            System.out.println("flim bulunamadı");
        }
       return a;

    }
    public void tumFlimleriListele(){
        if (filmListesi.isEmpty()){
            System.out.println("kutuphane boş");
        }else{
            for (Film w:filmListesi){
                w.filmBilgileri();
            }
        }

    }
}
