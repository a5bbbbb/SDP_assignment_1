package payment.enitities;

public interface BankTransferCredentialsGettable extends UserIdGettable {
    String getAccountNumber();
    String getAccountKey();
}
