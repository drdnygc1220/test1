package MiniBookStore;

public interface ProductService {//TÜM SERVİCE CLASSLARI İMPLEMENT ZORUNLULUK VARDIR..ABSTRACT,BODY OLMAK ZORUNDA..polymorphism
    void processMenu();
    void listProduct();
    void addProduct();
    void deleteProduct();
    void filterProducts(String filter);

}
