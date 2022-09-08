package week2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {

        System.out.println("Until what? ");
        Scanner reader = new Scanner(System.in);

        int i = 1;
        int until = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while (i <= until) {
            /*System.out.println("i: "+i);
            System.out.println("until: "+until);
            System.out.println("sum: "+sum);*/
            sum += i;
            i++;          // means the same as i = i+1;
        }

        System.out.println("Sum is: " + sum);

    }
}
