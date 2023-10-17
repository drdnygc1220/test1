package MiniBookStore;
//1--defter özellikleri=ürün öz+marka,yaprak sayısı,ürün kodu
public class NoteBook extends product {
    private String brand;
    private String sheet;
    private String code;


    //parametreli constructor
    public NoteBook(String name, String price, int stock,String brand,String sheet,String code) {
        super(name, price, stock);
    }

    //getter-setter methodları

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
