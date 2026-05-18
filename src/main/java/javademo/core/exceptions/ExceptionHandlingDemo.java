package javademo.core.exceptions;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        /************************************
         *  try-catch                       *
         ************************************/

        try {
            int result = divide(10, 0);
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        /************************************
         *  try-catch-finally               *
         ************************************/

        try {
            System.out.println("parse: " + Integer.parseInt("42"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } finally {
            System.out.println("finally block always runs");
        }

        /************************************
         *  try-with-resources              *
         ************************************/

        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            resource.use();
        } catch (Exception e) {
            System.out.println("Resource error: " + e.getMessage());
        }

        /************************************
         *  throw and custom exception      *
         ************************************/

        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older: " + age);
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class AutoCloseableResource implements AutoCloseable {
    void use() {
        System.out.println("Using resource");
    }

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}
