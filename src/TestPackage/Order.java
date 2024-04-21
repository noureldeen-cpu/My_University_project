package TestPackage;

public class Order {
    private int orderId;  // there is more work on it
    private double totalPrice;
    private int customerId;
    private Product[] products;

    public Order() {

    }

    public Order(int customerId, Product[] products, int orderId) {
        this.products = products;
        this.customerId = customerId;
        this.orderId = orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        Cart cart = new Cart();
        this.totalPrice = cart.calculatePrice(products);
        return totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void printOrderInfo() {
        System.out.println("====Here's your order's summary==== ");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Order ID: " + getOrderId());

        System.out.println("===========================================");

        System.out.println("##### Products #####");
        for (Product product : products) {
            if (product != null)
                System.out.println(product.getNameProduct() + " -> " + product.getProductPrice() + " $.");
        }

        System.out.println("===========================================");

        System.out.println("Total Price: " + getTotalPrice() + " $.");

        System.out.println("===========================================");

    }

}
