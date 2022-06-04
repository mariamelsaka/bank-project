package bank;

public class Tax extends AccountBalance implements BalanceCalculation {

    private double amount;

    Tax(double balance) {
        super(balance);
    }

    public double getAmountOfTax(Admin a) {
        amount = balance * (a.getTax() / 100);
        return amount;
    }

    @Override
    public double getBalance() {
        return balance - amount;
    }
}
