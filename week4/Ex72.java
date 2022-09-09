package week4;

public class Ex72 {
    public static void main(String[] args) {

        Account mattAccount = new Account("Matt's account",1000.00);
        Account myAccount = new Account("My account",0.00);
        Account a = new Account("A",100.00);
        Account b = new Account("B",0.00);
        Account c = new Account("C",0.00);

        transfer(a, b, 50);
        transfer(b, c, 25);

        System.out.println("A's account balance is now: "+a.balance());
        System.out.println("B's account balance is now: "+b.balance());
        System.out.println("C's account balance is now: "+c.balance());



    }

    public static void transfer(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}
