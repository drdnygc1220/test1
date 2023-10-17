package SsgCONSTRUCTOR;

public class CO1Constructor {
    //id atama methodu
    static int sayac=100;
    int x;
    int y;
    int id;

    //constructor içinde işlem de yapılır..
    //objeye özellik,deger atamak ve yüklemek için bir yöntem
    //içinde işlemde yapılabilir
    //genellikle pojo classta kullanırız..
    public CO1Constructor(int x, int y) {
        id=sayac;
        this.x = x;
        this.y = y;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println("tüm degerler atandı");
    }
    public CO1Constructor(){
        id=idAtama();
        System.out.println("bu constructor boş oldugu için sadece ıd atama işlemi yapıldı");

    }
    public int idAtama(){
        id=sayac;
        sayac++;
        return id;
    }

    public static void main(String[] args) {
        CO1Constructor obje1=new CO1Constructor();
        CO1Constructor obje2=new CO1Constructor(2,5);
        System.out.println(obje1.id);
        System.out.println(obje2.id);

    }
}
