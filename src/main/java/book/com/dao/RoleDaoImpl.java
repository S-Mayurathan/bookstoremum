package book.com.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import book.com.domain.Role;
import book.com.exception.BookStoreAppException;
import book.com.exception.BookStoreConstant;

public class RoleDaoImpl extends HibernateDaoSupport implements RoleDao {
	private static final Log LOG = LogFactory.getLog(BaseDaoImpl.class);

	@Override
	public Role save(Role domainObj) throws BookStoreAppException {
		try {
			LOG.debug(" RoleDaoImpl->save-> object details" + domainObj.toString());
			getHibernateTemplate().save(domainObj);
			return domainObj;

		} catch (DataAccessException ex) {
			LOG.error("RoleDaoImpl - error occurred while saving object " + domainObj + "-->" + ex.toString());
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, ex);
		}
	}

}
