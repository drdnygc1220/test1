package depoProje;

public class POJOProduct {

    private static int nextProductID=1005;//product=ürün,producer=üretici,amount=miktar,shelf=raf,product.Type=ürün tipi
    private static Integer productID;
    private String productName;
    private String producer;
    private Integer amount;
    private String  productType;
    private String shelf="-";

    //ID static yapmadık parametrenin içine almadı..


    public POJOProduct(String productName, String producer, Integer amount, String productType, String shelf) {
        this.productName = productName;
        this.producer = producer;
        this.amount = amount;
        this.productType = productType;
        this.shelf = shelf;
    }

    //get methodu yukarıda private olarak yazdıgımız fieldların okunmasını saglıyor,görüntülene bilmesini saglıyor
    //set ediyor..
    public POJOProduct() {
    }

    public static int NextProductID() {
        return nextProductID++;//kendiliğinden eklesin diye böyle yaptık
    }

    public static void setNextProductID(int nextProductID) {
        POJOProduct.nextProductID = nextProductID;
    }

    public static Integer getProductID() {
        return productID;
    }

    public static void setProductID(Integer productID) {
        POJOProduct.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "POJOProduct{" +
                "productName='" + productName + '\'' +
                ", producer='" + producer + '\'' +
                ", amount=" + amount +
                ", productType='" + productType + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}

