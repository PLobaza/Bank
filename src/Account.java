public class Account {
 private String login;
 private float balance;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", balance=" + balance +
                '}';
    }
}
