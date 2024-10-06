package payment;

import payment.enitities.CardCredentialsGettable;

public class CreditCardPayment implements PayableInterface{

    private String targetAccountNumber;

    CardCredentialsGettable userCard;

    public CreditCardPayment(String targetAccountNumber, CardCredentialsGettable userCard) {
        this.targetAccountNumber = targetAccountNumber;
        this.userCard = userCard;
    }

    public boolean pay(Double amount){
        System.out.println(userCard.getUserId() + " paid " + amount + " to account " + targetAccountNumber + " using credit card.");
        return true;
    }

}
