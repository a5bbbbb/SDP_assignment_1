import notification.*;
import payment.BankTransferPayment;
import payment.CreditCardPayment;
import payment.PayPalPayment;
import payment.PayableInterface;
import payment.enitities.*;

import javax.management.NotificationFilter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //task1();
        task2();
    }

    public static void task1(){
        CardCredentialsGettable card1 = new CreditCard(
                1,
                "Visa",
                "0000 0000 0000 0000",
                "16/27",
                "John Doe",
                777
                );
        PayableInterface payment1 = new CreditCardPayment(
                "company",
                card1
                );

        PayPalCredentialsGettable paypal1 = new PayPalCredentials(
                1,
                "user1",
                "pass1"
        );
        PayableInterface payment2 = new PayPalPayment(
                "company",
                paypal1
        );

        BankTransferCredentialsGettable transferCredentials = new BankTransferCredentials(
                1,
                "accountNumber",
                "secretKey"
        );

        PayableInterface payment3 = new BankTransferPayment(
                "company",
                transferCredentials
        );

        payment1.pay(1000.0);

        payment2.pay(2000.0);

        payment3.pay(3000.0);
    }

    public static void task2(){
        NotifiableChannel sms = new SMSNotification();
        NotifiableChannel email = new EmailNotification();
        NotifiableChannel push = new PushNotification();

        sms.sendNotification("SMS hi", 1);
        email.sendNotification("Email hi", 1);
        push.sendNotification("Push hi", 1);

        ArrayList<Integer> users = new ArrayList<>();
        users.add(2);
        users.add(3);

        sms.sendBulkNotification("Bulk SMS hi", users);
        email.sendBulkNotification("Bulk Email hi", users);
        push.sendBulkNotification("Bulk Push hi", users);

    }
}
