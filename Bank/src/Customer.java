package bank;

public class Customer extends AccountHolder {

    private String CustomerUserName;
    private String CustomerPassword;

    public Customer() {

        this.CustomerUserName = null;
        this.CustomerPassword = null;

    }

    @Override
    public void setUserName(String CustomerUserName) {
        this.CustomerUserName = CustomerUserName;
    }

    @Override
    public String getUserName() {
        return CustomerUserName;
    }

    @Override
    public void setPassword(String CustomerPassword) {
        this.CustomerPassword = CustomerPassword;
    }

    @Override
    public String getPassword() {
        return CustomerPassword;
    }

}
