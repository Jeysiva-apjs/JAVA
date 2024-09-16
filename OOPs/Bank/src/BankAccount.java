public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Current Balance: " + this.balance);
    }

    public void withdraw(double amount){
        if(amount < this.balance){
            System.out.println("Insufficient Balance");
            return;
        }
        this.balance -= amount;
        System.out.println("Current Balance: " + this.balance);
    }

    @Override
    public String toString() {
        return "Account Owner: " + this.owner + ", Account Balance: " + this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }
    
}
