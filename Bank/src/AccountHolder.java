package bank;

public abstract class AccountHolder {

    private final String userName;
    private final String password;

    public AccountHolder() {
        this.userName = null;

        this.password = null;
    }

    public abstract void setUserName(String userName);

    public abstract String getUserName();

    public abstract void setPassword(String password);

    public abstract String getPassword();

}
