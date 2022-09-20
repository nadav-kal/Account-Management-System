import java.util.HashMap;

public abstract class BankAccount {

    private int number;
//    private String name;
    private int balance;

    private boolean isBusinessAccount;

    public BankAccount(int number, int balance, boolean isBusinessAccount) {
        this.number = number;
        this.balance = balance;
        this.isBusinessAccount = isBusinessAccount;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    public void withdraw(int amount) {
        if(this.balance - amount < 0) {
            System.out.println("You can't withdraw this amount");
            return;
        }
        this.balance = this.balance - amount;
    }

    public abstract void getSpecialServices();
}
