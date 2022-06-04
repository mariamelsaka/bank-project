package bank;

public class AccountBalance implements BalanceCalculation {

    protected double balance;

    private Customer customer;

    AccountBalance() {
    }

    AccountBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public AccountHolder getCustomer() {
        return customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {

        return balance;
    }

}
