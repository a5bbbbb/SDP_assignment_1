package payment;

import payment.enitities.BankTransferCredentialsGettable;

public class BankTransferPayment implements PayableInterface{

    private String targetAccountNumber;

    BankTransferCredentialsGettable userCard;

    public BankTransferPayment(String targetAccountNumber, BankTransferCredentialsGettable userCard) {
        this.targetAccountNumber = targetAccountNumber;
        this.userCard = userCard;
    }

    public boolean pay(Double amount){
        System.out.println(userCard.getUserId() + " paid " + amount + " to account " + targetAccountNumber + " using bank transfer.");
        return true;
    }
}
