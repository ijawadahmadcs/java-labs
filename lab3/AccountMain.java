class Account {
    double balance;

    Account() {
        balance = 0;   // default balance
    }

    Account(double b) {
        balance = b;   // user-defined balance
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(5000);

        a1.deposit(2000);
        a1.withdraw(500);

        a2.withdraw(1000);
        a2.deposit(1500);
    }
}
