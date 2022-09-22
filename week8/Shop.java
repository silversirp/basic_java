package week8;

import java.util.Scanner;

public class Shop {

    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    // the method to deal with a customer in the shop
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");

        for (String product : store.products()) {
            System.out.println( product );
        }

        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }

            // here, you write the code to add a product to the shopping basket, if the storehouse is not empty
            // and decreases the storehouse stocks
            // do not touch the rest of the code!

            System.out.println("Is product in stock? (Anna): " + store.products().contains(product));
            System.out.println("Is product in stock? (Silver): " + store.stock(product));
            if (this.store.stock(product) > 0){
                System.out.println("Yes. Amount of " + product + " in stock: " + store.stock(product));
                if (this.store.take(product)) {
                    basket.add(product, this.store.price(product));
                }
            } else {
                System.out.println("Stock is empty!");
            }

        }

        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }
}
