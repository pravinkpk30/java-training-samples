package com.core.java.samples.qa;

import java.time.LocalDate;

/****
 *
 * 3. Exception Handling: Custom Exception for Expired Drug Batch
 *
 * Question: Create a custom exception ExpiredBatchException that should be thrown when attempting to use a batch
 * that has already expired. Implement a method that checks whether a drug batch is expired, and if so, throws the exception.
 *
 */
// Custom exception class for expired drug batches
 class ExpiredBatchException extends Exception {
    public ExpiredBatchException(String message) {
        super(message);
    }
}

 class PharmaBatchManager {
    public void checkBatchExpiry(String batchNumber, LocalDate expiryDate) throws ExpiredBatchException {
        LocalDate currentDate = LocalDate.now();

        if (currentDate.isAfter(expiryDate)) {
            throw new ExpiredBatchException("Batch " + batchNumber + " has expired on " + expiryDate + "!");
        } else {
            System.out.println("Batch " + batchNumber + " is valid and not expired.");
        }
    }
}
public class Question3 {
    public static void main(String[] args) {
        PharmaBatchManager manager = new PharmaBatchManager();

        String batch1 = "BatchA123";
        LocalDate expiryDate1 = LocalDate.of(2023, 5, 10); // Expired batch

        String batch2 = "BatchB456";
        LocalDate expiryDate2 = LocalDate.of(2024, 11, 25); // Valid batch

        // Check expiry of batch1 (should throw exception)
        try {
            manager.checkBatchExpiry(batch1, expiryDate1);
        } catch (ExpiredBatchException e) {
            System.out.println(e.getMessage());  // Handle the exception by printing the error message
        }

        // Check expiry of batch2 (should not throw exception)
        try {
            manager.checkBatchExpiry(batch2, expiryDate2);
        } catch (ExpiredBatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
