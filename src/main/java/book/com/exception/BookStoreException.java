package book.com.exception;


public class BookStoreException extends Exception {
    
    /**
     * Generated serial id.
     */
    private static final long serialVersionUID = -826430340117181983L;

    /**
     * Represents the error code for a specific error message.
     */
    private String errorCode;

    /**
     * Represents an instance of the ErrorMsgUtil class.
     */
    private ErrorMsgLoader errorMsgLoader = new ErrorMsgLoader();
    
    /**
     * Constructs a default BTRigorException object.
     */
    public BookStoreException(){
        super();
    }
    
    /**
     * Constructs a BTRigorException object with the given error code.
     * @param errCode - the error code
     */
    public BookStoreException(String errCode){
        super();
        this.errorCode = errCode;
    }
    
    /**
     * Constructs a BTRigorException object with the specified error code and cause.
     * 
     * @param errCode - The specific error code.
     * @param cause - The cause of the exception.
     */
    public BookStoreException(String errCode,Throwable cause){
        super(cause);
        this.errorCode = errCode;
    }
    
    /**
     * Constructs a BTRigorException object with the specified error message, code 
     * and cause.
     * 
     * @param cause - The cause of the exception.
     * @param strErrorMsg - the specific error message.
     * @param errCode - The specific error code
     */
    public BookStoreException(String strErrorMsg, String errCode, Throwable cause){
        super(strErrorMsg, cause);
        this.errorCode = errCode;
    }
    
    /**
     * Returns the error code provided for this object.
     * 
     * @return - The error code.
     */
    public String getErrorCode() {
    
        return errorCode;
    }
    
    /**
     * Sets the error code for this object.
     * 
     * @param errCode - The error code to be set.
     */
    public void setErrorCode(String errCode) {
        
        this.errorCode = errCode;
    }

   /**
    * This method overrides the java.lang.Throwable , getLocalizedMessage()
    * method. If an error code has been set for this object, it would return the
    * error message for the corresponding error code together with the detailed 
    * exception, else, it would only return the detailed exception.
    * 
    * @return - The exception details.
    */
    public String getLocalizedMessage(){
       
           if (this.errorCode == null || this.errorCode.isEmpty()){
               return getMessage();
           }
         
            return errorMsgLoader.getErrorMessage(errorCode) + getMessage();
            
        }

}
