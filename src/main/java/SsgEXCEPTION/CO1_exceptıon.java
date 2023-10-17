package SsgEXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CO1_exceptıon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir yaş giriniz");
        int yas = 0;//try da degeri kendim oluşturyorum//hata aldıgımızdan itibaren catch kısmını alıyor
        try {
            yas = scan.nextInt();
            System.out.println("try boşlugu basarılı bir sekilde gercekleşti");
        }catch(InputMismatchException e){
            System.out.println("deger atamanız yanlıştır");
        }catch (Exception e){
            System.out.println("hatanın ne oldugunu bilmiyorum");
        }
        System.out.println(yas);
    }
}
