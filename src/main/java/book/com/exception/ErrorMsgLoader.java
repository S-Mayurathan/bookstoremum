package book.com.exception;

import java.util.ResourceBundle;


public class ErrorMsgLoader {
    
    /**
     * Constant representing the error property file name.
     */
    private static final String PROP_FILE_NAME = "com.bt.bttr.api.exception" + ".BTErrorMsg";
    
    /**
     * The resource bundle for the error properties.
     */
    private ResourceBundle propertyBundle;
    
    /**
     * Returns the error message for the given error key.
     * 
     * @param errorKey - The error key for a specific error message.
     * @return - The error message for the given error key.
     */
    public String getErrorMessage(String errorKey) {

        getPropertiesBundle();
        if (this.propertyBundle.containsKey(errorKey)) {
            return this.propertyBundle.getString(errorKey);
        }
        return null;
    }
    
    /**
     * Returns the ResourceBundle containing the error properties for the application.
     * 
     * @return - The resource bundle containing the error properties.
     */
    private ResourceBundle getPropertiesBundle() {

        this.propertyBundle = ResourceBundle.getBundle(PROP_FILE_NAME);
        return propertyBundle;
    }
}
