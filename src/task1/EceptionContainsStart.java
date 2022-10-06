package task1;

public class EceptionContainsStart extends Exception{
    public EceptionContainsStart() {
    }

    public EceptionContainsStart(String message) {
        super(message);
    }

    public EceptionContainsStart(String message, Throwable cause) {
        super(message, cause);
    }

    public EceptionContainsStart(Throwable cause) {
        super(cause);
    }

    public EceptionContainsStart(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
