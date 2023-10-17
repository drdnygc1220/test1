package MaceraOyunu;

public abstract class NormalLoc extends Location {//constructorını yapmam lazım
    NormalLoc(Player player, String name) {
        super(player);
        this.name=name;//locationdan gelen parametre
    }

    @Override
    public boolean getLocation() {
        return false;
    }
}
