public class BusinessAccount extends BankAccount{

    protected String companyName;
    public BusinessAccount(int number, String companyName, int balance, boolean isBusinessAccount) {
        super(number, balance, isBusinessAccount);
        this.companyName = companyName;
    }

    public void getSpecialServices() {
        System.out.println("Our representatives take care in your issues and will call you back");
    }

    public String getCompanyName() {
        return companyName;
    }
}
