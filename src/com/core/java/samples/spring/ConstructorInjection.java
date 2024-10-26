package com.core.java.samples.spring;

interface TransactionProcessor {
    void processTransaction(double amount);
}

class OnlineTransactionProcessor implements TransactionProcessor {
    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing online transaction of $" + amount);
    }
}

class ATMTransactionProcessor implements TransactionProcessor {
    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing ATM transaction of $" + amount);
    }
}

class BankService {
    private final TransactionProcessor transactionProcessor;

    // Constructor Injection
    public BankService(TransactionProcessor transactionProcessor) {
        this.transactionProcessor = transactionProcessor;
    }

    public void makeTransaction(double amount) {
        transactionProcessor.processTransaction(amount);
    }
}

public class ConstructorInjection {
    public static void main(String[] args) {

        // Using OnlineTransactionProcessor as a dependency
        TransactionProcessor processor = new OnlineTransactionProcessor();
        BankService bankService = new BankService(processor);

        bankService.makeTransaction(1000.0);

        // Changing the processor to ATMTransactionProcessor if needed
        TransactionProcessor atmProcessor = new ATMTransactionProcessor();
        BankService atmBankService = new BankService(atmProcessor);

        atmBankService.makeTransaction(500.0);
    }
}
