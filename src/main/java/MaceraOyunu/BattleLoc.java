package MaceraOyunu;
//savaşların oldugu location
public abstract class BattleLoc extends Location {
    //11-canavar clasını oluşturyorum.
    Obstacle obstacle;

    BattleLoc(Player player,String name,Obstacle obstacle) {
        super(player);
        this.obstacle=obstacle;//dışarıdan aldıklarım
        this.name=name;//dışarıdan aldım
    }
    //savaşların oldugu methodu verecek location oluşturduk..
    public boolean getLocation(){

        return true;//içerde ölme işlemi olursa diğer tarafta false yapıp oyunu bitirecegiz..
    }
}
