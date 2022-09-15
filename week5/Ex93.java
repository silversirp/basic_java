package week5;

public class Ex93 {
    public class Main {
        public static void main(String[] args) {
            Person pekka = new Person("Pekka", 15, 2, 1993);
            Person steve = new Person("Thomas", 1, 3, 1955);

            System.out.println( steve.getName() + " age " + steve.age() + " years");
            System.out.println( pekka.getName() + " age " + pekka.age() + " years");
        }
    }
}
