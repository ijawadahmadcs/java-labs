public class BankAccountProcedural {
    static int balance;   // shared data

    static void setBalance(int b) {
        balance = b;
    }

    static void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    static void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public static void main(String[] args) {
        setBalance(1000);
        deposit(500);  
        withdraw(200); 
        withdraw(2000); 
    }
}
