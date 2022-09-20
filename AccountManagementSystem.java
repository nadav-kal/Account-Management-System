import java.util.Scanner;

public class AccountManagementSystem {

    public static void main(String[] args) {

        Bank bank = new Bank();

        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please select the requested action:");
            System.out.println("1. Create new account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Balance");
            System.out.println("5. Special services");
            System.out.println("6. Exit");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    bank.createNewAccount();
                    break;
                case 2:
                    bank.withdraw();
                    break;
                case 3:
                    bank.deposit();
                    break;
                case 4:
                    bank.balance();
                    break;
                case 5:
                    bank.specialServices();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}
