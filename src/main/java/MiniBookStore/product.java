package MiniBookStore;
//1-a-ortak olan özellikler:ıd,isim,birim fiyat,stok miktarı
public class product {

    //private yapmamızın sebebi gizlemek
    private static int counter=1;
    private int id;
    private String name;
    private String price;
    private int stock;



    //parametreli const
    public product(String name,String price,int stock){
        this.id=counter++;
        this.name=name;
        this.price=price;
        this.stock=stock;

    }
    //getter-setter


    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        product.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
