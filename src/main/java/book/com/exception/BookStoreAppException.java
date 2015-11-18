package book.com.exception;

public class BookStoreAppException extends BookStoreException {
    
    /**
     * Generated id.
     */
    private static final long serialVersionUID = 8124487983532542964L;
    
    /**
     * Constructs a default BTRigorAppException object.
     */
    public BookStoreAppException() {

        super();
    }
    
    /**
     * Constructs a BTRigorAppException object with the given error code.
     * 
     * @param strErrorCode - The error code.
     */
    public BookStoreAppException(String strErrorCode) {

        super(strErrorCode);
    }
    
    /**
     * Constructs a BTRigorAppException object with the given error code and detailed cause.
     * 
     * @param strErrorCode - the error code.
     * @param cause - the cause of the error.
     */
    public BookStoreAppException(String strErrorCode, Throwable cause) {

        super(strErrorCode, cause);
    }
    
    /**
     * Constructs a BTRigorAppException object with the given error message, error code and detailed cause.
     * 
     * @param strErrorMsg - The error message.
     * @param strErrorCode - the error code.
     * @param cause - the cause of the error.
     */
    public BookStoreAppException(String strErrorMsg, String strErrorCode, Throwable cause) {

        super(strErrorMsg, strErrorCode, cause);
    }    
}
