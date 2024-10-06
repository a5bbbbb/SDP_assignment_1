package payment.enitities;

public class PayPalCredentials implements PayPalCredentialsGettable{

    private Integer userId;
    private String accountUsername;
    private String accountPassword;

    public PayPalCredentials(Integer userId, String accountUsername, String accountPassword) {
        this.userId = userId;
        this.accountUsername = accountUsername;
        this.accountPassword = accountPassword;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public String getAccountPassword() {
        return accountPassword;
    }
}
