package topics.exceptions.exception_chaining;

public class ExceptionChainingExample {

    public static void main(String[] args) {
        try {
            performOperation();
        } catch (Exception e) {
            System.out.println("Exception caught at a higher level: " + e.getMessage());
            System.out.println("Original cause: " + e.getMessage() + " CAUSE: " + e.getCause());
        }

    }

    private static void performOperation() throws CustomException {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException o) {
            throw new CustomException("Error performing the operation", o);
        }

    }

}

class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
