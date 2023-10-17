package AppointmentApplication;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* 4-Doktor:
         -id, isim, branş, takvim
         -takvim: sistemin kullanıldığı günden 1 gün sonra başlamak üzere
         7 günlük uygun randevu tarihleri

 */
public class Doktor {
    private int id;
    private String isim;
    private String brans;
    //7 tane tarih ,birden fazla obje oldugunda array veya list olacak biz listten yaptık
    private List<String> dates=new ArrayList<>();

    public Doktor(int id, String isim, String brans) {
        //tarihi parametreden almadık. bir gün sonra başlayacak.sistemin bulundugu güne göre hesaplama yapacagım
        this.id = id;
        this.isim = isim;
        this.brans = brans;
        //4-doktor objesi oluştugunda sistemin tarihinden 1 gün sonra ile başlayan
        //7 günlük takvim oluşturun
        LocalDate day=LocalDate.now();//26.09
        for (int i=0;i<3;i++){//test için 3 e düşürdük..
            day=day.plusDays(1);//27.09,28.09,29.09,02.10,03.10
            if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
                day=day.plusDays(1);
            } else if (day.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
                day=day.plusDays(2);//02.10
            }
            this.dates.add(day.toString());
        }


    }
    //getter-setter methodları

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

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
