package payment;

import payment.enitities.PayPalCredentialsGettable;

public class PayPalPayment implements PayableInterface{

    private String targetAccountNumber;

    PayPalCredentialsGettable userCard;

    public PayPalPayment(String targetAccountNumber, PayPalCredentialsGettable userCard) {
        this.targetAccountNumber = targetAccountNumber;
        this.userCard = userCard;
    }

    public boolean pay(Double amount){
        System.out.println(userCard.getUserId() + " paid " + amount + " to account " + targetAccountNumber + " using paypal.");
        return true;
    }

}
