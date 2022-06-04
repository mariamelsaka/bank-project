package bank;

public class Deposit extends AccountBalance implements BalanceCalculation {

    private double deposit;

    Deposit() {
    }

    Deposit(double balance) {
        super(balance);
    }

    public void setDeposite(double deposit) {
        this.deposit = deposit;
    }

    public double getDeposite() {
        return deposit;
    }

    @Override
    public double getBalance() {

        return balance + deposit;
    }

}
