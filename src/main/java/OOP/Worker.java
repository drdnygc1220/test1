package OOP;

public class Worker extends People implements Bonus {
    /*
    String name;
    String isName;
    int yas;

     */
    int maaş;
    //BONUS geldikten sonra bunu degiştirdik.
    /*
    void maasHesaplama(){
    }
     */
    @Override
    int maasHesaplama(){
        System.out.println("worker");//bu methoduları cagırdıgımızda görmek için yapıyoruz..
        return maaş+BONUS;


    }
    private String giveMeName(){
        return this.name;//this bu clasta demek
    }
}
