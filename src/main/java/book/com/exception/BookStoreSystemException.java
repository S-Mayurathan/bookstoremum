package book.com.exception;


public class BookStoreSystemException extends BookStoreException {
    
    /**
     * Generated id.
     */
    private static final long serialVersionUID = 5676178642880101505L;
    
    /**
     * Overrides the java.lang.exception getLocalizedMessage method.
     * 
     * @return - The detail error message.
     */
    public String getLocalizedMessage() {

        return super.getMessage();
    }
    
}
