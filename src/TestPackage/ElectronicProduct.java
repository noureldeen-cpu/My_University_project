package TestPackage;

public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;


    public ElectronicProduct(int productId, String nameProduct, double productPrice, String brand, int warrantyPeriod) {
        super(productId, nameProduct, productPrice);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "Brand: '" + brand + '\'' +
                ", WarrantyPeriod: " + warrantyPeriod +
                ", ProductId: " + productId +
                ", NameProduct: '" + nameProduct + '\'' +
                ", ProductPrice: " + productPrice +
                '}';
    }
}
