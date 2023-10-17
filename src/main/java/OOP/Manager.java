package OOP;

public class Manager extends Secretary implements Bonus {
    /*
    String name;
    String isName;

     */
    int maaş;
    @Override
    int maasHesaplama(){
        System.out.println("manager");
        return maaş+BONUS;

    }

    public String giveMeDepartman(){//methodu kullansın ama override yapılmasın (final yaparız.)
        return "////";
    }
}
