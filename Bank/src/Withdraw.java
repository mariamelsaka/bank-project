package bank;

import java.io.IOException;

public class Withdraw extends AccountBalance implements BalanceCalculation {

    private double withdraw;

    Withdraw(double balance) {
        super(balance);
    }

    public void setWithdraw(double withdraw) throws AccountException {
        if (withdraw <= 0) {
            throw new AccountException(new IOException("invalid value"));
        }
        if (withdraw > balance) {
            throw new AccountException(new InsufficientFundsException());
        }
        this.withdraw = withdraw;
    }

    public double getWithdraw() {
        return withdraw;
    }

    @Override
    public double getBalance() {

        return balance - withdraw;

    }

}
