package TestPackage;

import java.util.Scanner;

public class EcommerceSystem {
    public static void welcomeMessage() {
        System.out.println("Welcome to our E-Commerce!");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product1 = new ElectronicProduct(1, "smart phone", 599.9, "Samsung", 1);
        Product product2 = new ClothingProduct(2, "T-shirt", 19.99, "Medium", "Cotton");
        Product product3 = new BookProduct(3, "OOP", 39.99, "O'Reilly", "X Publications");

        Cart cart1 = new Cart();

        welcomeMessage();

        System.out.print("Please enter your ID: ");
        int userId = input.nextInt();

        input.nextLine();

        System.out.print("Please enter your Name: ");
        String userName = input.nextLine();

        System.out.print("Please enter your address: ");
        String userAddress = input.nextLine();

        System.out.println("How many products you want to add to you cart?");
        int numberOfProducts = input.nextInt();

        Customer customer1 = new Customer(userId, userName, userAddress);

        cart1.setNumberOfProducts(numberOfProducts);

        System.out.println("Choose form this list:- ");
        System.out.println(
                """
                        1- smart phone.
                        2- T-shirt.
                        3- Book.
                        """
        );

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Enter your key products to put in the cart: ");
            int productKey = input.nextInt();
            switch (productKey) {
                case 1:
                    cart1.addProduct(product1, i);
                    System.out.println("The product added.\n");
                    break;

                case 2:
                    cart1.addProduct(product2, i);
                    System.out.println("The product added.\n");
                    break;
                case 3:
                    cart1.addProduct(product3, i);
                    System.out.println("The product added.\n");
                    break;
                default:
                    System.out.println("Invalid input!");
                    break;
            }
        }
        input.nextLine();

        System.out.println("Your total price is " + cart1.calculatePrice(cart1.getProducts()) + " $");

        System.out.println("Do you want to place order? (yes/no)");
        String userCheck = input.nextLine();

        if (cart1.placeOrder(userCheck)) {
            Order order = new Order(userId, cart1.getProducts(), 1);
            order.printOrderInfo();
        } else if (!cart1.placeOrder(userCheck) && userCheck.equals("No") || userCheck.equals("no") || userCheck.equals("N") || userCheck.equals("n")) {
            System.out.println("Do you want to remove a product from the cart or cancel the order? [yes (remove) / no (cancel)]");
            userCheck = input.nextLine();
            if (userCheck.equals("Yes") || userCheck.equals("yes") || userCheck.equals("Y") || userCheck.equals("y")) {
                System.out.println("Here your cart: ");
                cart1.printProducts();
                do {
                    System.out.println("Which product do you want to remove? ");
                    int userProductIndex = input.nextInt();

                    cart1.removeProduct((userProductIndex - 1), cart1.getProducts());

                    Order order = new Order(userId, cart1.getProducts(), 1);
                    order.printOrderInfo();

                    System.out.println();

                    input.nextLine();
                    System.out.println("Do want to remove any thing else from the cart? ");
                    userCheck = input.nextLine();

                } while (userCheck.equals("Yes") || userCheck.equals("yes") || userCheck.equals("Y") || userCheck.equals("y"));

                Order order = new Order(userId, cart1.getProducts(), 1);

                System.out.println();

                order.printOrderInfo();

            } else if (userCheck.equals("No") || userCheck.equals("no") || userCheck.equals("N") || userCheck.equals("n")) {
                System.out.println("The order is canceled.");
            }
        }
        System.out.println("Thank you for use our E-commerce system.");
    }
}
