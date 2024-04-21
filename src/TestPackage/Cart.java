package TestPackage;

public class Cart {
    private int numberOfProducts;
    private Product[] products;
    private int customerId;

    public Cart() {
    }

    public Cart(int customerId, int numberOfProducts) {
        this.customerId = Math.abs(customerId);
        this.numberOfProducts = Math.abs(numberOfProducts);
        this.products = new Product[numberOfProducts];
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
        products = new Product[numberOfProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Product[] addProduct(Product product, int index) {
        if (products[index] == null)
            this.products[index] = product;
        return products;
    }

    public Product[] removeProduct(int indexProductToDelete, Product[] product) {
        Product[] newProducts = new Product[product.length - 1];

        if (indexProductToDelete >= 0 && indexProductToDelete <= product.length) {
            System.arraycopy(product, 0, newProducts, 0, indexProductToDelete);

            if (numberOfProducts - (indexProductToDelete + 1) >= 0)
                System.arraycopy(product, indexProductToDelete + 1, newProducts, indexProductToDelete + 1 - 1, product.length - (indexProductToDelete + 1));
        } else {
            System.out.println("We can't found this in the cart!");
        }
        this.products = newProducts;
        return products;
    }

    public double calculatePrice(Product[] products) {
        double total = 0;
        for (Product product1 : products) {
            total += product1.getProductPrice();
        }
        return total;
    }

    public boolean placeOrder(String check) {
        if (check.equals("Yes") || check.equals("yes") || check.equals("Y") || check.equals("y"))
            return true;
        else if (check.equals("No") || check.equals("no") || check.equals("N") || check.equals("n"))
            return false;
        else
            System.out.println("Invalid Input!");
        return false;
    }

    public void printProducts() {
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println((i + 1) + "- " + products[i].getNameProduct() + " and the price is: " + products[i].getProductPrice() + " $");

        }
    }
}
