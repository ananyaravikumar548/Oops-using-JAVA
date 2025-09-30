class BankAccount {
    private int balance = 1000;

    synchronized void withdraw(int amount, String name) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " completed withdrawal. Balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + name);
        }
    }
}

class Person extends Thread {
    BankAccount account;
    String name;
    int amount;

    Person(BankAccount acc, String n, int amt) {
        account = acc;
        name = n;
        amount = amt;
    }

    public void run() {
        account.withdraw(amount, name);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Person p1 = new Person(acc, "Alice", 700);
        Person p2 = new Person(acc, "Bob", 500);
        p1.start();
        p2.start();
    }
}
