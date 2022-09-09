package week4;

import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = amountOfNumbers();
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double average = sum/ (double)amountOfNumbers;
        return average;
    }

}
