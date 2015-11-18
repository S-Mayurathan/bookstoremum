package book.com.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * This represents that base entity for all POJOs and DTO objects. It contains common attributes and get/set
 * methods that can be reused across all objects. All DTOs and POJOs in the application should extend this
 * class.
 * 
 * @author Virtusa Corporation
 */

public class BaseDomain implements Serializable {
    
    /**
     * Generated serial id.
     */
    private static final long serialVersionUID = -4010386932111881082L;
    
    /**
     * The latest time that the object was modified.
     */
    private Date modifiedTime;
    
    /**
     * Returns the last modified time for this object.
     * 
     * @return - The last updated time.
     */
    public Date getModifiedTime() {

        if (modifiedTime != null) {
            
            return (Date) this.modifiedTime.clone();
        }
        return null;
    }
    
    /**
     * Sets the latest time at which the object was updated.
     * 
     * @param modTime - the latest time that the object was modified (systime).
     */
    public void setModifiedTime(Date modTime) {

        if (modTime != null) {
            this.modifiedTime = (Date) modTime.clone();
        }
    }
    
}
