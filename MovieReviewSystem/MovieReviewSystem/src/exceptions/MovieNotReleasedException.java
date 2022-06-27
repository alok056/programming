package exceptions;

public class MovieNotReleasedException extends Exception {
    public MovieNotReleasedException() {
        super();
    }

    public MovieNotReleasedException(String message) {
        super(message);
    }
}
