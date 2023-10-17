package TEST2;

public class Kuruyemiş {
    public static void main(String[] args) {
        //fiyatlar
        double leblebi=3.5;
        double fındık=15.7;
        double badem=22;
        //maliyet hesaplama
        double maliyetTutar=(leblebi*12)+(fındık*25)+(badem*40);

        //ürün satmak istiyoruz..
        //leblebinin kilosunu %50(150/100=1.5),fındık %40,badem %60 fazlasını satmış..
        double satışTutar=((leblebi*1.5)*12)+((fındık*1.4)*25)+((badem*1.6)*40);

        //karını hesapla..
        double karTutar=satışTutar-maliyetTutar;
        if(karTutar>500){
            System.out.println("Kirayı ödeyebilirsin..");
        }else{
            System.out.println("yaterli paranız yoktur..");
        }
        System.out.println("maliyet tutar:"+maliyetTutar);
        System.out.println("satış tutar:"+satışTutar);
        System.out.println("kar tutar:"+karTutar);




    }
}
