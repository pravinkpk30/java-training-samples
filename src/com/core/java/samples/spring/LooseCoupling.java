package com.core.java.samples.spring;

interface PaymentProcessor {
    void processPayment(double amount);
}

class CreditCardProcessor1 implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPalProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class PaymentService1 {
    private PaymentProcessor processor;

    // Dependency Injection (DI): processor is injected through the constructor
    public PaymentService1(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void makePayment(double amount) {
        processor.processPayment(amount);
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        PaymentService1 service1 = new PaymentService1(new PayPalProcessor());
        PaymentService1 service2 = new PaymentService1(new CreditCardProcessor1());

        service1.makePayment(15000); // Paypal processing
        service2.makePayment(25000); // Credit card processing
    }

}
