package TEST1;

public enum Cities {//ŞEHİR
    B(500,"B"),C(700,"C"),D(900,"D");

    private final int distance;//MESAFE
    private final String cityName;
   private int age;



    Cities(int distance, String cityName) {
        this.distance = distance;
        this.cityName = cityName;
    }

    public int getDistance() {
        return distance;
    }

    public String getCityName() {
        return cityName;
    }


}
