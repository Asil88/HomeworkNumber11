package task1;

public class ExceptionContainsEnds extends Exception{
    public ExceptionContainsEnds() {
    }

    public ExceptionContainsEnds(String message) {
        super(message);
    }

    public ExceptionContainsEnds(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionContainsEnds(Throwable cause) {
        super(cause);
    }

    public ExceptionContainsEnds(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
