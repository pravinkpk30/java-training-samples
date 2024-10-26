package com.core.java.samples.spring;

/***
 *
 * Here’s why this is tightly coupled:
 *
 * PaymentService directly creates an instance of CreditCardProcessor.
 * If we want to change the payment method (e.g., from a credit card processor to a PayPal processor), we need to modify the code inside PaymentService.
 * Testing PaymentService in isolation is difficult because it always uses a CreditCardProcessor, which is created internally.
 * Mocking this for testing purposes is complicated, as we can’t replace it easily.
 *
 */
class CreditCardProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PaymentService {
    private CreditCardProcessor processor = new CreditCardProcessor(); // Direct dependency

    public void makePayment(double amount) {
        processor.processPayment(amount); // Strongly tied to CreditCardProcessor
    }
}

public class TightCouple {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.makePayment(25000);
    }
}
