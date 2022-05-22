package bankapp;


/**
 * @author hashfx
 */
class InvalidAmountException extends Exception {

    public InvalidAmountException() {
        super("Invalid amount for transaction.");
    }
    
}
