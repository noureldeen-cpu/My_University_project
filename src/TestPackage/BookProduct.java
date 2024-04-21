package TestPackage;

public class BookProduct extends Product {
    private String author;
    private String publisher;

    public BookProduct(int productId, String nameProduct, double productPrice, String author, String publisher) {
        super(productId, nameProduct, productPrice);
        this.author = author;
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "BookProduct{" +
                "Author: '" + author + '\'' +
                ", Publisher: '" + publisher + '\'' +
                ", ProductId: " + productId +
                ", NameProduct: '" + nameProduct + '\'' +
                ", ProductPrice: " + productPrice +
                '}';
    }
}
