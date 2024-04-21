package TestPackage;

public class Product {
    protected  int productId;
    protected String nameProduct;
    protected double productPrice;


    public Product() {
    }

    public Product(int productId, String nameProduct, double productPrice) {
        this.productId = Math.abs(productId);
        this.nameProduct = nameProduct;
        this.productPrice = Math.abs(productPrice);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = Math.abs(productPrice);
    }
}
