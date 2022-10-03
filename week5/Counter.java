package week5;

public class Counter {
    int startingValue;
    boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
    }

    public Counter(boolean check) {
        this.check = check;
    }
}
