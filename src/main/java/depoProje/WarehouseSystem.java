package depoProje;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class WarehouseSystem {
    static Map<Integer, POJOProduct> productList = new TreeMap<>();


    static Scanner input = new Scanner(System.in);


    public static  void urunTanımlama(){
        POJOProduct product1 = new POJOProduct("E5", "Samsung", 10, "cep telefonu", "Tuslu Telefon");
        POJOProduct product2 = new POJOProduct("S9", "Samsung", 20, "Cep Telefonu", "Akıllı Telefon");
        POJOProduct product3 = new POJOProduct("Oppo s152", "Oppo", 30,"Telefon Aksesuarlari", "Batarya");
        POJOProduct product4 = new POJOProduct("Galaxy Tab S8 Ultra", "Samsung", 40,"Tablet", "Tablet");

        productList.put(1001, product1);
        productList.put(1002, product2);
        productList.put(1003, product3);
        productList.put(1004, product4);

    }

    public static void urunListeleme(){

        System.out.printf("%-3s    %-20s    %-10s    %-6s    %-20s    %-4s\n", "ID", "İsmi", "Üretici", "Miktar", "Cinsi", "Raf");
        System.out.printf("%-3s    %-20s    %-10s    %-6s    %-20s    %-4s\n", "---", "----", "--------", "------", "------", "---");

        Set<Map.Entry<Integer, POJOProduct>> entrySet = productList.entrySet();
        for (Map.Entry<Integer, POJOProduct> w : entrySet) {

            System.out.printf("%-3d   %-20s   %-10s       %-6d  %-20s   %-4s\n",
                    w.getKey(), w.getValue().getProductName(), w.getValue().getProducer(), w.getValue().getAmount(), w.getValue().getProductType(), w.getValue().getShelf());

        }

    }

    public WarehouseSystem() {//constructor oluşturduk.burada ki bütün methodların urun tanımlamyı görmesi için
        urunTanımlama();
    }
}
