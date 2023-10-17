package SsgENCAPSULATION;

public class CO2_OkulRunner {
    //main methodu okulturcagım
    public static  void main(String[] args) {
        //daha kolay atamak için ;constructor
        //daha kolay yazdırmak için;toString
        //CO1 CLASINDAN OKUL CLASI OLUŞTURACAGIM..
        C01_Okul okul=new C01_Okul();
        //okuldaki özellikleri getiriyorum
        System.out.println(okul);
        okul.setOkulIsmı("Feyyaz scholl");
        System.out.println(okul);
        okul.setMudur("FEYYAZ YAĞCI");
        System.out.println(okul);


    }


}
