package bankapp;


/**
 * @author hashfx
 */
class InsufficientFundsException extends Exception {

    public InsufficientFundsException() {
        super("You have insufficient funds to complete the transaction.");
    }
    
}
