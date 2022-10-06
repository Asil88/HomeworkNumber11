package task1;

public class ExceptionContains extends Exception{
    public ExceptionContains() {
    }

    public ExceptionContains(String message) {
        super(message);
    }

    public ExceptionContains(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionContains(Throwable cause) {
        super(cause);
    }

    public ExceptionContains(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
