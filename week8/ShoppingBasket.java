package week8;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }

    public void add(String product, int price){
        Purchase purchase = new Purchase(product, 1, price);
        if (this.purchases.indexOf(purchase) == -1) {
            this.purchases.add(new Purchase(product, 1, price));
        } else {
            this.purchases.get(this.purchases.indexOf(purchase)).increaseAmount();
        }

    }

    public int price(){
        int price = 0;
        for (Purchase purchase:
             this.purchases) {
            price += purchase.price();
        }
        return price;
    }

    public void print(){
        for (Purchase purchase:
                this.purchases) {
            System.out.println(purchase);
        }
    }
}
