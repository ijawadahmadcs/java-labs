class BankAccount {
    private int balance;  
    public void setBalance(int b) {
        balance = b;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.setBalance(1000);
        acc1.deposit(500);
        acc1.withdraw(200);
        BankAccount acc2 = new BankAccount();
        acc2.setBalance(2000);
        acc2.withdraw(1000); 
        acc2.deposit(300);  
    }
}

    

