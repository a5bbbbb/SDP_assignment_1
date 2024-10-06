# Software Design Patterns 
# Assignment 1
## Task 1
Implement a Java solution that satisfies the following requirements:
<ul>
<li>
There should be at least two payment
methods: CreditCardPayment and PayPalPayment.
</li>
<li>
You should be able to easily add a new payment method
(e.g., BankTransferPayment) without modifying the existing code.
</li>
<li>
The system should adhere to the Single Responsibility
Principle, Open/Closed Principle, and other relevant SOLID principles.
</li>
</ul>

### Implementation: Main::task1

<hr>
CreditCardPayment and PayPalPayment as well as BankTransferPayment were implemented.

<hr>
Every payment method class implements the PayableInterface that allows to add new payment method without changing existing code.

PayableInterface ony requires the method <code>void pay(Double amount)</code> to be implemented.

As such BankTransferPayment was easily added without modifying existing code proving adherence to the Open/Closed Principle.
<hr>
In more detail, each payment class has the only method <code>void pay(Double amount)</code> and two fields:
<ul>
<li>a target account(a string)</li>
<li>credentials needed for the payment class via Dependency Injection.</li>
</ul>
Credentials classes and interfaces perform only a single role that is to store information needed to make transactions. And payment classes have only role is to make payments. Therefore, the adherence to the Single Responsibility principle is proven.
<hr>

## Task 2

Implement the solution in Java with at least three notification types:
<ul>
<li>
SMSNotification
</li>
<li>
EmailNotification
</li>
<li>
PushNotification
</li>
</ul>

### Implementation: Main::task2
<hr>
SMSNotification, EmailNotification, PushNotification implement the NotifiableChannel interface that allows to add new notification channels without changing the existing code.
NotifiableChannel requires 2 methods to be implemented:
<ul>
<li><code>void sendNotification(String content, Integer userId)</code></li>
<li><code>void sendBulkNotification(String content, Iterable<Integer> userIdList)</code></li>
</ul>
Like this every other notification channel was added, thus proving adherence to the Open/Closed principle.
<hr>
In detail, <code>sendNotification(String content, Integer userId)</code> implemented in every notification channel is just paper ship that only displays the channel used, the recipient, and the message.<br>
And <code>void sendBulkNotification(String content, Iterable<Integer> userIdList)</code> just iterates through the list of recipients and calls for each of them the method for a single recipient.<br>
Each notification channel is only responsible for notifying the users through itself, thus satisfying the Single Responsibility Principle.
<hr>
Every instance of channels is upcast to NotifiableChannel interface following the guidance of the Dependency Inversion Principle.
<br>
<br>
<br>
<br>