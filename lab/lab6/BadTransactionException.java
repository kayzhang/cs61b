/* BadTransactionException.java */

/**
*  Implements an exception that should be thrown for invalid transactions.
**/
public class BadTransactionException extends Exception {

    public int amount;  // The invalid amount of money.

    /**
    *  Creates an exception object for invalid amount of money "amount".
    **/
    public BadTransactionException(int badAmount) {
        super("Invalid amount of money: " + badAmount);

        amount = badAmount;
    }
}
