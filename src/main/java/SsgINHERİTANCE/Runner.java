package SsgINHERİTANCE;

public class Runner {
    public static void main(String[] args) {
        C03_İsci isci=new C03_İsci("FEYYAZ"," YAĞCI","5068799656","İSTANBUL",12,100,16);
        System.out.println(isci);

        isci.mesai=5;
        isci.ucret= isci.fazlaMesai();
        System.out.println(isci.maas + isci.ucret);


        C03_İsci isci1=new C03_İsci();
        isci1.id=isci1.idAtama();
        System.out.println(isci1);

        C04_Memur memur=new C04_Memur("FEYYAZ","YAĞCI","89768558695","TOKAT",12,150,16);
        System.out.println(memur);
    }
}
