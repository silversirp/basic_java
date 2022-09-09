package week4;

import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = amountOfNumbers();
    }

    public void addNumber(int number) {
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

}
