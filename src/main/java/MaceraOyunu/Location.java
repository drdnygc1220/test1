package MaceraOyunu;

public abstract class Location {//abstrcat clas
    //8-canavarlarla savaşacak dolayısıya Player içindeki playeri aktaracagız
    protected Player player;//en üst class ve ben bu clastan ulaşmak isteyecegim getter ve setter methodlarıyla=protected
    protected String name;

    Location(Player player){
        this.player=player;//sadece playeri istiyoruz.
    }
    //9-location alt sınıflarda kullanmak için mecbur kılıyorum..
    public abstract boolean getLocation();//oyunun sonunda ölebilir..

    //getter-setter methodları
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //10-normal diye abstract class oluşturuyorum..
}
