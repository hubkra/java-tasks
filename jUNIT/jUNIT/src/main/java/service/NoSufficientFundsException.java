package service;

public class NoSufficientFundsException extends RuntimeException {
    public NoSufficientFundsException(String message) {
        super(message);
    }
}