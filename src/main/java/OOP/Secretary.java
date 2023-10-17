package OOP;

public class Secretary extends Worker implements Bonus {
    //constructor ından acses modifieri degişebilir..


    public Secretary(int yas, int maaş, String departman) {
        this.yas = yas;
        this.maaş = maaş;
        this.departman = departman;
    }

    public Secretary() {
    }

    public Secretary(String name) {
        super.name =name;//super diğer classtan almaya yaradı
    }

    private int yas;//manajerde gözükmesini istemiyorum..
    int maaş;
    @Override
   int maasHesaplama(){
       System.out.println("secretary");
       return maaş+BONUS;
   }
    private String departman;
    /*
    interwi sorusu:
    private int yaş;(private olunca bu obje olur bunun degeri null olur..
    int yaş;(int olunca primivite data olur deger verilmemiş hali 0 dır..
    Integer yaş:(non-ptimitive olur buda null olur..
     */
    public  String giveMeDepartman(){
        //return this.departman;//this bu clasta demek
        return "******";
    }
}
