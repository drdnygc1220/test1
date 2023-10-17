package MaceraOyunu;
//12-güvenli ev oluşturuyorum
public class SafeHouse extends NormalLoc {
    //Safehouse constructor oluşturyorum

    public SafeHouse(Player player) {//kullanıcıdan ismini girmesini istemiyorum
        super(player, "Güvenli ev");//kendim giiryorum
    }
    public boolean getLocation(){
        player.setHealthy(player.getrHealty());//başlangıçta saglıgını bilmiyrpurn
        System.out.println("Canınız iyileşti..");
        System.out.println("Şuan güvenli ev adlı yerdesiniz.");
        return  true;

    }
}
