package payment.enitities;

public class BankTransferCredentials implements BankTransferCredentialsGettable{

    private Integer userId;
    private String accountNumber;
    private String accountKey;

    public BankTransferCredentials(Integer userId, String accountNumber, String accountKey) {
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.accountKey = accountKey;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAccountNumber() {
        return null;
    }

    public String getAccountKey() {
        return null;
    }
}
