package SsgCONSTRUCTOR;

import java.sql.SQLOutput;

public class RunnerAraba {
    public static void main(String[] args) {
        C02Araba araba=new C02Araba("audio","A8",2023,"Kırmızı","Dizel","90000");//boş constructor olmadıgı için hata veriyor..
        System.out.println(araba);
        //hepsine özel tek tek yapmak zorundayım..
        C03Telefon telefon=new C03Telefon("ıphone","15pro max",94000);//variable yoksa boş constructor yapmmaıza gerek yok.içine deger girmek gerekir.
        C02Araba telefon1=new C02Araba("bmw","c5","sarı");
        System.out.println(telefon1);

    }

}
