/*
 * Copyright 2012 Virtusa(Pvt)Ltd. All rights reserved. CONFIDENTIAL AND

 * PROPRIETARY INFORMATION The information contained herein (the

 * 'Proprietary Information') is highly confidential and proprietary to and

 * constitutes trade secrets of Virtusa(Pvt)Ltd. The Proprietary Information

 * for Virtusa(Pvt)Ltd internal use only and shall not be published,

 * communicated, disclosed or divulged to any person, firm, corporation or

 * other legal entity, directly or indirectly, without the prior written

 * consent of Virtusa(Pvt)Ltd Information Management.
 */
package book.com.exception;


/**
 * This represents the Constant file which defines application wide error
 * message keys.
 *
 * @author Virtusa Corporation
 *
 */

public final class BookStoreConstant {

  /**
   * Private constructor to prevent instantiation of this class.
   */
  private BookStoreConstant(){

  }

  /**
   * Key representing a DB Connection error.
   */
  public static final String DB_CONNECTION_ERROR = "GEN.DB.CONN.ERROR";

  /**
   * Key representing invalid hibernate operation - add new record.
   */
  public static final String HIBERNATE_INVALID_ADD_OPERATION =
            "GEN.DB.INVALID.OPERATION.ADD";

  /**
   * Key representing error while converting a string into date format.
   */
  public static final String DATE_CONVERSION_ERROR =
            "GEN.DB.INVALID.DATE.CONVERSION";


  /** The mandatory field error code is to display when mandatory fields not filled, interpretable as message key. */
  public static final String MANDATORY_FIELD_ERROR_CODE = "REF.UI.MANDATORY.FIELD.REQUIRED";

  
}
