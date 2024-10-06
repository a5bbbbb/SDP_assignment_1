package payment.enitities;

public final class CreditCard implements CardCredentialsGettable{

    private Integer userId;
    private String serviceProvider;
    private String number;
    private String expirationDate;
    private String owner;
    private Integer CVV;

    public CreditCard(Integer userId, String serviceProvider, String number, String expirationDate, String owner, Integer CVV) {
        this.userId = userId;
        this.serviceProvider = serviceProvider;
        this.number = number;
        this.expirationDate = expirationDate;
        this.owner = owner;
        this.CVV = CVV;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public String getNumber() {
        return number;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getCVV() {
        return CVV;
    }
}
