package book.com.dao;



import book.com.domain.User;
import book.com.exception.BookStoreAppException;

public interface UserDao extends BaseDao<User> {

	User save(User domainObj) throws BookStoreAppException;
}
