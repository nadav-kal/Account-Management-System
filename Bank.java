import java.util.HashMap;
import java.util.Scanner;

public class Bank {

    private HashMap<Integer, BankAccount> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    public HashMap<Integer, BankAccount> getAccounts() {
        return accounts;
    }

    public void createNewAccount() {

//        Scanner accountParams = new Scanner(System.in);
//        System.out.println("Enter account number:");
//        int number = accountParams.nextInt();
//        System.out.println("Enter name:");
//        accountParams.nextLine();
//        String name = accountParams.nextLine();
//        System.out.println("Enter balance:");
//        int balance = accountParams.nextInt();
//        System.out.println("Do you want to make it business account?:");
//        System.out.println("1. Yes");
//        System.out.println("2. No");
//        int busineesAccount = accountParams.nextInt();
        Object[] params = returnParams();
        int number = (int) params[0];
        String name = (String) params[1];
        int balance = (int) params[2];
        int busineesAccount = (int) params[3];
        if(accounts.containsKey(number)) {
            System.out.println("This account is already exists");
            return;
        }

        BankAccount account;
        if(busineesAccount == 1) {
            account = new BusinessAccount(number, name, balance, true);
        }
        else {
            account = new PrivateAccount(number, name, balance, false);
        }
        accounts.put(number, account);
    }

    public void withdraw() {
        int number = getAccountNumber();
        if(accountExists(number)) {
            int amount = getAmount("withdraw");
            accounts.get(number).withdraw(amount);
        }

    }

    public void deposit() {
        int number = getAccountNumber();
        if(accountExists(number)) {
            int amount = getAmount("deposit");
            accounts.get(number).deposit(amount);
        }
    }

    public void balance() {
        int number = getAccountNumber();
        if(accountExists(number)) {
            System.out.println(accounts.get(number).getBalance());
        }
    }

    public void specialServices() {
        int number = getAccountNumber();
        if(accountExists(number)) {
            accounts.get(number).getSpecialServices();
        }
    }

    public BankAccount findAccount(int account) {

        if(accounts.containsKey(account)) {
            return accounts.get(account);
        }
        System.out.println("Account not found");
        return null;
    }

    public int getAccountNumber() {
        System.out.println("Enter account number:");
        Scanner userNumber = new Scanner(System.in);
        return userNumber.nextInt();
    }

    public int getAmount(String operation) {
        System.out.println("Enter amount to " + operation + ":");
        Scanner userAmount = new Scanner(System.in);
        return userAmount.nextInt();
    }

    public boolean accountExists(int number) {
        if(!accounts.containsKey(number)) {
            System.out.println("This account doesn't exists");
            return false;
        }
        return true;
    }

    public Object[] returnParams() {
        Scanner accountParams = new Scanner(System.in);
        System.out.println("Enter account number:");
        int number = accountParams.nextInt();
        System.out.println("Enter name:");
        accountParams.nextLine();
        String name = accountParams.nextLine();
        System.out.println("Enter balance:");
        int balance = accountParams.nextInt();
        System.out.println("Do you want to make it business account?:");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int businessAccount = accountParams.nextInt();

        Object[] params = new Object[4];
        params[0] = number;
        params[1] = name;
        params[2] = balance;
        params[3] = businessAccount;

        return params;
    }
}
