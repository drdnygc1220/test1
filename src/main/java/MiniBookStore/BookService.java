package MiniBookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2--kitaplarla yapılacak işlemler
public class BookService implements ProductService{//implement edildi:override etmek zorunlulugu var
    //kullanıcdan bilgi alacagım hepsinde yazmamık için public yapıyoruz

    public Scanner inp=new Scanner(System.in);

    //3-kitapları kaydetmek,saklamak  için list oluşturalım...
    public List<Book> bookList=new ArrayList<>();

    //4--sistemde başlangıçta mevcut olan kitaplar olsun..kolaylık olsun diye biz oluşturduk..add ile eklememiz lazım normalde
    //constructor tanımlayacagım
    public BookService(){
        Book book1=new Book("fareler ve insanlar","150",15,"j.Steinbeck","penguin","A11");
        Book book2=new Book("Suç ve Ceza","250",25,"Dostoyevski","Penguin","A222");
        Book book3=new Book("sefiller","170",15,"V.Hugo","Dream","A333");
        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
    }

    //5--işlem secim menüsü
    @Override
    public void processMenu() {
        //tekrar tekrar göstermek için
        int choice;
        do{
            System.out.println("-------------------");
            System.out.println("1-kitapları listele");
            System.out.println("2-kitap ekle");
            System.out.println("3-kitabı sil");
            System.out.println("4-yayınevine göre filtrele");
            System.out.println("0-geri dön");
            System.out.println("seçiminiz");
            choice=inp.nextInt();
            inp.nextInt();//yeni satıra gecmek için
            switch (choice){//choice kontrol et
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("yayınevi bilgisini gir");
                    String publisher=inp.nextLine();
                   // filterProducts();
                    break;
                case 0:
                    System.out.println("ana menüye yönlendiriliyorsunuz.");
                    break;
                default:
                    System.out.println("hatalı giriş");
                    break;

            }

        }while (choice!=0);

    }

    //6--kitapları formatla listele...
    @Override
    public void listProduct() {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-3s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s | \n","ID","Kitap Adı","Yazar Adı","Yayınevi",
                "ISBN","Birim Fiyat","Stok");
        System.out.println("-----------------------------------------------------------------------------------");
        this.bookList.forEach(book -> System.out.printf("%-3s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s | \n",
                book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getIsbn(),
                book.getPrice()+" Lira",book.getStock()));
        System.out.println("-----------------------------------------------------------------------------------");


    }

    @Override
    public void addProduct() {
            System.out.println("ISBN : ");
            String isbn=inp.nextLine();
            boolean isExists=false;
            for (Book book:this.bookList){
                if (book.getIsbn().equals(isbn)){
                    System.out.println("Bu kitap sistemde kayıtlı, lütfen ürün güncelleme yapınız.");//stok güncelleme:ÖDEV
                    isExists=true;
                    break;
                }
            }
            if (!isExists){
                System.out.println("Kitap Adı :");
                String name=inp.nextLine();
                System.out.println("Yazar Adı :");
                String author=inp.nextLine();
                System.out.println("Yayınevi:");
                String publisher=inp.nextLine();
                System.out.println("Birim Fiyat :");
                String price=inp.nextLine();
                System.out.println("Stok : ");
                int stock= inp.nextInt();
                inp.nextLine();

                Book newBook=new Book(name,price,stock,author,publisher,isbn);
                this.bookList.add(newBook);
            }
            listProduct();//tüm kitapları görmek için
        }
//8--kullanıcıdan alınan id ile silme işlemi
    @Override
    public void deleteProduct() {
        boolean isFound=true;
        System.out.println("kitap id: ");
        int id=inp.nextInt();
        for(Book book:this.bookList){
            if(book.getId()==id){
                this.bookList.remove(book);
                System.out.println("ürün silindi");
                isFound=true;
                break;
            }
            else {
                isFound=false;
                //tüm listeyi gezsin tek tek yazmasın kitap yok diye
                //boolean degişken atıyorum
            }
        }
        if(!isFound){

            System.out.println("ürün bulunamadı");
        }

    }

    //9.yayınevine göre filtreleme
    @Override
    public void filterProducts(String filter) {
        int counter=0;
        for (Book book:this.bookList){ //kitap listemizde geziyoruz..
            if(book.getPublisher().equals(filter)){


                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s | \n",
                        book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getIsbn(),
                        book.getPrice()+" Lira",book.getStock());
                counter++;

            }

        }
        if(counter==0){
            System.out.println("eşleşen ürün bulunamadı");
        }





    }
}
