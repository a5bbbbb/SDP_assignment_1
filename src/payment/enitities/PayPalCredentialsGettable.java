package payment.enitities;

public interface PayPalCredentialsGettable extends UserIdGettable {
    String getAccountUsername();
    String getAccountPassword();
}
