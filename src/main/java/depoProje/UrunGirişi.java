package depoProje;

import java.util.Scanner;

import static depoProje.WarehouseSystem.productList;
import static depoProje.WarehouseSystem.urunListeleme;

public class UrunGirişi {
    public static void urunGirişi(){
        Scanner input=new Scanner(System.in);
        //her girişte yeni bir ürün eklemek için method içinde obje oluşturdum..
        POJOProduct newproduct=new POJOProduct();
        System.out.println("Depoya eklemek istediğiniz ürünün adını giriniz..");
        String urunismi=input.nextLine();
        System.out.println("Ürünün firma adını giriniz..");
        String uretici=input.nextLine();
        System.out.println("Ürünün tipini giriniz..");
        String birimcinsi=input.nextLine();
        System.out.println("Ürünün konulacagı rafı giriniz..");
        String raf=input.nextLine();
        System.out.println("Ürünün miktarını giriniz..");
        int miktar=input.nextInt();

        //yeni oluşturdugumuz ürünü set methodu ile cagırıyoruz
        newproduct.setProductName(urunismi);
        newproduct.setProducer(uretici);
        newproduct.setProductType(birimcinsi);
        newproduct.setShelf(raf);
        newproduct.setAmount(miktar);

        //set ettiğimiz dataları Map listemize ekliyoruz..(warehouseSystem) clası oluşturuyorum..
        productList.put(newproduct.getProductID(),newproduct);
        urunListeleme();



    }


}
