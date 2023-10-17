package depoProje;


import java.util.Scanner;

public class WHRunner {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner input=new Scanner(System.in);
        WarehouseSystem wareHouse=new WarehouseSystem();
        int select=-1;
        while(select!=0){
            System.out.println("----DEVO2 DEPOSU----"+
                    "\n 1-ürün listesi"+
                    "\n 2-ürün girişi"+
                    "\n 3-ürünü rafa koyma"+
                    "\n 4-ürün miktarı güncelleme"+
                    "\n 5-depodan ürün silme"+
                    "\n 0-sistemden çıkış"+
                    "\n işleminiz: ");
            select=input.nextInt();
            System.out.println("*****");
        }
    }
}
