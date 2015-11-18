package book.com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import book.com.domain.BaseDomain;
import book.com.exception.BookStoreAppException;
import book.com.exception.BookStoreConstant;

@Transactional
public class BaseDaoImpl<T extends BaseDomain> extends HibernateDaoSupport implements BaseDao<T> {

	/**
	 * Logger to log the exceptions.
	 */
	private static final Log LOG = LogFactory.getLog(BaseDaoImpl.class);

	/**
	 * Saves the given object to the database.
	 * 
	 * @param domainObj
	 *            - The domain object to save.
	 * @throws BookStoreAppException
	 *             - the exception.
	 * @return - The newly saved object.
	 */
	public T save(T domainObj) throws BookStoreAppException {

		try {
			LOG.debug(" BaseDaoImpl->save-> object details" + domainObj.toString());
			getHibernateTemplate().save(domainObj);
			// getSession().saveOrUpdate(domainObj);
			return domainObj;

		} catch (DataAccessException ex) {
			LOG.error("BaseDaoImpl - error occured while saving object " + domainObj + "-->" + ex.toString());
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, ex);
		}
	}

	/**
	 * Method to update a record for the given domain object.
	 * 
	 * @param domainObj
	 *            - The domain object to update.
	 * @throws BookStoreAppException
	 *             - The exception.
	 */
	public void update(T domainObj) throws BookStoreAppException {

		try {
			getHibernateTemplate().update(domainObj);
		} catch (DataAccessException ex) {
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, ex);
		}
	}

	/**
	 * Method to delete the given domain object from the database.
	 * 
	 * @param domainObj
	 *            - the domain object to be deleted from the db.
	 * @throws BookStoreAppException
	 *             - the detailed exception.
	 */
	public void delete(T domainObj) throws BookStoreAppException {

		try {
			getHibernateTemplate().delete(domainObj);
		} catch (DataAccessException ex) {
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, ex);
		}
	}

	/**
	 * This method will create a collection of objects (if not already available
	 * in the db); else it will update the existing records in the db for the
	 * given collection.
	 * 
	 * @param objList
	 *            - The list of objects to be saved/updated.
	 * @throws BookStoreAppException
	 *             - The detailed exception.
	 */
	public void saveOrUpdateAll(List<T> objList) throws BookStoreAppException {

		try {
			getHibernateTemplate().saveOrUpdate(objList);
		} catch (DataAccessException ex) {
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, ex);
		}
	}

	/**
	 * Finds a db record for a specific domain object and its id.
	 * 
	 * @param domainObj
	 *            - The domain object to be retrieved.
	 * @param id
	 *            - the specific id/key of the domain object to be retrieved.
	 * @return Object - The specific domain object.
	 * @throws BookStoreAppException
	 *             - The detailed exception.
	 */
	public Object findById(Class<T> domainObj, int id) throws BookStoreAppException {

		try {
			return getHibernateTemplate().get(domainObj, id);

		} catch (DataAccessException e) {
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, e);
		}
	}

	/**
	 * Retrieves the entire list of records for a given domain object.
	 * 
	 * @param domainClass
	 *            - the entity/domain object class.
	 * @return List - The list of records for the given domain class.
	 * @throws BookStoreAppException
	 *             - The detailed exception.
	 */
	public List<T> findAll(Class<T> domainClass) throws BookStoreAppException {

		try {
			return getHibernateTemplate().loadAll(domainClass);
		} catch (DataAccessException e) {
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, e);
		}
	}

}
