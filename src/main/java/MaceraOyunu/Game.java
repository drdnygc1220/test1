package MaceraOyunu;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan=new Scanner(System.in);
    public void login(){
        //1-kullanıcıdan isim alacagız..
        Scanner scan=new Scanner(System.in);
        System.out.println("Macera oyununa hoş geldiniz...");
        System.out.print("Oyuna başlamadan önce isminizi giriniz: ");
        String playerName=scan.nextLine();
        //nesne giriyoruz
        player=new Player(playerName);
        //KARAKTERİ CAGIRACAGIM..
        player.selectCha();
        //7--oyuna başlayalım..
        start();

    }
    public void start(){
       while (true){
           System.out.println();
           System.out.println("=====================");
           System.out.println();
           System.out.println("lütfen bir yer seçiniz...");
           System.out.println("1.Güvenli Ev--> Size ait güvenli bir mekan.düşman yok !");
           System.out.println("2.Mağara--> Karşınıza Zombi cıkabilir !");
           System.out.println("3.Orman-->  Karşınıza Zombi cıkabilir !");
           System.out.println("4.Nehir-->  Karşınıza Zombi cıkabilir !");
           System.out.println("5.Mağaza--> Silah ve Zırh alabilirsiniz !");
           System.out.print("gitmek istediğiniz yer..");
           int selloct= scan.nextInt();
           while (selloct<0 || selloct>5){
               System.out.print("lütfen gecerli bir yer seciniz: ");
               selloct= scan.nextInt();
           }
           //13-
           switch (selloct){
               case 1:
                   location=new SafeHouse(player);
                   break;
               default:
                   location=new SafeHouse(player);
           }
          if(!location.getLocation()){
              System.out.println("Oyun Bitti! ");
              break;
          }

       }

    }

}
