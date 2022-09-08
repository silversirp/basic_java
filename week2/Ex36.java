package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        System.out.println("Type number: ");
        Scanner reader = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                break;
            }
            sum += number;
            count++;
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Thank you and see you later");
        System.out.println("Sum is: " + sum);
        System.out.println("How many numbers: " + count);
        double average = (double)sum / count;
        System.out.println("Average is: " + average);
        System.out.println("Even count: " +even);
        System.out.println("Odd count: " +odd);
    }
}
