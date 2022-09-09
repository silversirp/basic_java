package week4;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {

        NumberStatistics stats = new NumberStatistics();

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");

        int number;
        //System.out.println(number);
        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            } else {
                stats.addNumber(number);
            }
        }


        //System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        //System.out.println("average: " + stats.average());

    }


}
