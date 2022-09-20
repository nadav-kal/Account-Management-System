public class PrivateAccount extends BankAccount{

    protected String ownerName;

    public PrivateAccount(int number, String ownerName, int balance, boolean isBusinessAccount) {
        super(number, balance, isBusinessAccount);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void getSpecialServices() {
        System.out.println("Special services are available only for business customers");
    }
}
