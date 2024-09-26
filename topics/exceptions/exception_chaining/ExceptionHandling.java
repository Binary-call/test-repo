package topics.exceptions.exception_chaining;

public class ExceptionHandling {

    public static class CustomException extends Exception {
        public CustomException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionClass = new ExceptionHandling();
        exceptionClass.methodA();
    }

    public void methodA() {
        try {
            methodB();
        } catch (CustomException e) {
            // TODO: handle exception
            logError(e);
            respondToClient("An error ocurred, please try again later.");
        }
    }

    public void methodB() throws CustomException {
        try {
            methodC();
        } catch (CustomException ex) {
            // TODO: handle exception
            throw ex;
        }
    }

    public void methodC() throws CustomException {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            throw new CustomException("Division by zero error occured in methodC", e);
        }
    }

    // For logging
    private void logError(Exception ex) {
        System.out.println("Error: " + ex.getMessage());
        // ex.printStackTrace();
    }

    private void respondToClient(String message) {
        System.out.println(message);
    }
}
