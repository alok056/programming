package exceptions;

public class DuplicateReviewException extends Exception {
    public DuplicateReviewException() {
        super();
    }

    public DuplicateReviewException(String message) {
        super(message);
    }
}
