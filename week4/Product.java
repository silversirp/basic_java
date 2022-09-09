package week4;

public class Product {
    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public String printProduct() {
        return this.nameAtStart + ", price " + this.priceAtStart + ", amount " + this.amountAtStart;
    }
}
