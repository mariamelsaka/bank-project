package bank;

public class Interest extends AccountBalance implements BalanceCalculation {

    private double amount;

    Interest() {
    }

    Interest(double balance) {
        super(balance);
    }

    public void getAmountOfInterest(Admin a) {
        amount = balance * (a.getInterest() / 100);

    }

    @Override
    public double getBalance() {
        return balance + amount;
    }

}
