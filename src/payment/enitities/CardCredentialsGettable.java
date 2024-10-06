package payment.enitities;

public interface CardCredentialsGettable extends UserIdGettable {
    String getServiceProvider();
    String getNumber();
    String getExpirationDate();
    String getOwner();
    Integer getCVV();
}
