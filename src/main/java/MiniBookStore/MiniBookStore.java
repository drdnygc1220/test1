package MiniBookStore;

import java.util.Scanner;

public class MiniBookStore {
    public static void main(String[] args) {
        start();
    }
    //1--book class,notebook class oluşturduk
    //2--book ve notebook için ayrı-ayrı service class oluşturma(aynı service da olurdu fakat geliştirilebilir olmaz)


    private static void start() {//geriye dönüşü olmayan start methodu
        Scanner inp=new Scanner(System.in);
        int select;
        //service oluşturalımm
        ProductService bookService=new BookService();
        ProductService notebookService=new NotebookService();

        //10--kategori menüsü
        do{
            System.out.println("---mini book store---");
            System.out.println("ürün yönetim paneli");
            System.out.println("1-kitaplar");
            System.out.println("2-defterler");
            System.out.println("0-çıkış");
            System.out.println("seçiminiz:");
            select=inp.nextInt();
            inp.nextLine();

            ProductService service=select==1 ? bookService:notebookService;

       switch(select){
           case 1: case 2:
               service.processMenu();
               break;
               //case 2:bookService.processMenu yapsaydım bakımı onarımı zor olurdu aynı obje üzerinden yaptık..
           case 0:
               System.out.println("iyi günler...");
               break;
           default:
               System.out.println("hatalı giriş");
               break;


            }

    }
        while (select!=0);
     }
     }





