package bank;

import java.io.IOException;

public class Admin extends AccountHolder {

    public String adminusername;
    public String adminpassword;
    public double interest;
    public double tax;

    public Admin() {
        this.adminusername = null;
        this.adminpassword = null;

    }

    @Override
    public String getUserName() {
        return adminusername;
    }

    @Override
    public String getPassword() {
        return adminpassword;
    }

    @Override
    public void setUserName(String adminusername) {
        this.adminusername = adminusername;
    }

    @Override
    public void setPassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public double getInterest() {
        return interest;
    }

    public double getTax() {
        return tax;
    }

    public void setInterest(double interest) throws AccountException {
        if (interest <= 0) {
            throw new AccountException(new IOException());
        }
        this.interest = interest;
    }

    public void setTax(double tax) throws AccountException {
        if (tax <= 0) {
            throw new AccountException(new IOException());
        }
        this.tax = tax;
    }

}
