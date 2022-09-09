package week4;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

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
                if (number % 2 == 0) {
                    even.addNumber(number);
                } else {
                    odd.addNumber(number);
                }
            }
        }


        System.out.println("sum of all: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());


    }


}
