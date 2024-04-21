package TestPackage;

public class ClothingProduct extends Product {
    private String size;
    private String fabric;
    public ClothingProduct(int productId, String nameProduct, double productPrice, String size, String fabric) {
        super(productId, nameProduct, productPrice);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return "ClothingProduct{" +
                "Size: '" + size + '\'' +
                ", Fabric: '" + fabric + '\'' +
                ", ProductId: " + productId +
                ", NameProduct: '" + nameProduct + '\'' +
                ", ProductPrice: " + productPrice +
                '}';
    }
}
