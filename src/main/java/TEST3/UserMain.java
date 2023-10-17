package TEST3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 4- UserMain isminde main için bir class create ediniz.
        5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e atayiniz.
        active ve signedIn default olarak true, false atayabilirsiniz.
        id yi sistemde otomatik aliniz.,
        6- eğer password 6 dan küçük olursa yeniden kullanici girisi isteyin.passwordun
        6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.

 */
public class UserMain {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int ıd=100;
        String isim,soyad;
        List<String>user=new ArrayList<>();
        System.out.println("lütfen kullanıcı adınızı giriniz");
        String kullanıcıAdı=scan.nextLine();
        System.out.println("lütfen paswordunuzu giriniz..");
        int pasworrd=scan.nextInt();
        System.out.println();
        
     if(user.equals(kullanıcıAdı)&&user.equals(ıd)){
         System.out.println("giriş başarıyla gerceklerşmiştir..");
     }

    }
}
