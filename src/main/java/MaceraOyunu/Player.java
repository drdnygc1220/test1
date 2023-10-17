package MaceraOyunu;

import java.util.Scanner;

public class Player {
    //player clasın hasar,saglık,parası olacak..
    private int damage;
    private int healthy;
    //13-yeni can oluşturacagız
    private int rHealty;
    private int money;
    //private int damage,healty,money..şeklindede yazılabilir..
    //karakter adı
    private String name;//OYUNCUNUN ADI
    private String cName;//KARAKTERİN ADI ;okcu ,samuray,şovelyemi
    //CLASS OLARAK OLUŞTURUDK..ınventory olacak(çanta gibi )kazandıklarını koyacak
    private Inventory inv;
   Scanner scan=new Scanner(System.in);



    //constructor oluşturuken sadece kullanıcıının ismini girmesini istiyoruz
    public Player(String name) {
        this.name = name;
    }
    public void selectCha(){//methodları daha parca parca oldun diye böldük.
        //5-karakteri secip geri döndürecek
        switch (chaMenu()){
            //6-switch de cok fazla tekrar var tekrar olan yerleri fonksiyona ceviriecegiz
            case 1:
                initPlayer("Samuray",5,21,15);
                /*
                setcName("Samuray");
               setDamage(5);
               setHealthy(21);
               setMoney(15);

                 */
               break;
            case 2:
                initPlayer("Okcu",7,18,20);
                break;
            case 3:
                initPlayer("Şovalye",8,24,5);
                break;
            default://hoca bir deger girmenin faydalı oldugunu söyledi
                initPlayer("Samuray",5,21,15);

        }
        //karakterlerimizin degerlerini yazdıralımm
        System.out.println("Karakter :" + getcName() +
                " ,Hasar : " + getDamage() +
                " ,Sağlık :" + getHealthy() +
                " ,Para :" + getMoney());
        //chaMenu();//karaekter menüsü tanımladık..
        //System.out.println(chaMenu());
    }
    //2-ekrana yazma işlemlerini yapacagız
    public  int chaMenu(){
        System.out.println("Lütfen karakter seciniz: ");
        System.out.println("1-Samuray \t Hasar:5    \t   Saglık:21 \t Para:15");
        System.out.println("2-Okcu    \t Hasar:7    \t   Saglık:18 \t Para:20");
        System.out.println("3-Şovalye \t Hasar:8    \t   Saglık:24 \t Para:5");
        //3-bunlardan biirini secmesi için scanner oluşturulacak en yukarıda yazıyoruz..
        System.out.println("Karakter Seçiminiz: ");
        int chaID=scan.nextInt();
        //1ve 3 arasında bir deger mi kontrol etmek istiyorum..
        while (chaID<1 || chaID>3){
            System.out.println("Lütfen gecerlli bir karakter secinz..");
            chaID=scan.nextInt();

        }

        //4-yukarıda void yerine int yapıp asaguda retun ettik çünkü yukardaki değerlerle yer degişitirecegiz..
        return chaID;

    }
    //6-a fonksiyon tanımlıyorum..
    public void initPlayer(String cName,int dmg,int hlty,int mny){
        setcName(cName);
        setDamage(dmg);
        setHealthy(hlty);
        setMoney(mny);
        setrHealty(hlty);

    }

    //getter-setter methodlarını yazalım..(encapsulation sarmalama işlemini gercekleştirdik.)

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public int getrHealty() {
        return rHealty;
    }

    public void setrHealty(int rHealty) {
        this.rHealty = rHealty;
    }
}
