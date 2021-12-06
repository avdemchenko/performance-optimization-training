package software.sigma.training.po.survey.services.transform;

public class TransformerException extends Exception {

    public TransformerException() {
    }

    public TransformerException(String message) {
        super(message);
    }

    public TransformerException(Throwable cause) {
        super(cause);
    }

    public TransformerException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransformerException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
