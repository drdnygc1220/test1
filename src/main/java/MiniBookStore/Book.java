package MiniBookStore;
//1-b kitap öz:ürün özel+yazar adı,yayın evi,isbn no
public class Book extends product{
    private String authorName;
    private String publisher;
    private String isbn;//her bir kitaba özel..unique

    //parametreli constructor yaptı
    public Book(String name, String price, int stock,String authorName,String publisher,String isbn) {
        super(name, price, stock);
        this.authorName=authorName;
        this.isbn=isbn;
        this.publisher=publisher;
    }

    //getter-setter methodları

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher() {
        this.publisher = publisher;
    }
}
