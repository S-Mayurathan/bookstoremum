package book.com.dao;

import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import book.com.domain.User;
import book.com.exception.BookStoreAppException;
import book.com.exception.BookStoreConstant;

//@Repository
public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {

	public User loadUserByUsername(final String username) throws BookStoreAppException {

		try {
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession()
					.createQuery("select distinct u from User u left join fetch u.authorities where u.username=:username");
			query.setParameter("username", username);
			query.setMaxResults(1);
			User user = (User) query.uniqueResult();
//			Query queryRole = getHibernateTemplate().getSessionFactory().getCurrentSession()
//					.createQuery("select r from Role r where r.id=:userid");
//			queryRole.setParameter("userid", user.getId());
//			user.setAuthorities(queryRole.list());
			return user;
		} catch (DataAccessException e) {
			throw new BookStoreAppException(BookStoreConstant.HIBERNATE_INVALID_ADD_OPERATION, e);
		}

	}
}
