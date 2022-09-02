package week1;

public class Ex5 {
    public static void main(String[] args) {
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        int secondsInAYear = days * hours * minutes * seconds;

        System.out.println("There are "+ secondsInAYear +" seconds in a year");
    }
}
