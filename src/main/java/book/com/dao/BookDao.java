package book.com.dao;

import java.util.List;

import book.com.domain.Book;
import book.com.exception.BookStoreAppException;

public interface BookDao extends BaseDao<Book> {
	Book save(Book domainObj) throws BookStoreAppException;

	void update(Book domainObj) throws BookStoreAppException;

	void delete(Book domainObj) throws BookStoreAppException;

	void saveOrUpdateAll(List<Book> objList) throws BookStoreAppException;

	Object findById(Class<Book> domainObj, int id) throws BookStoreAppException;

	List<Book> findByName(Class<Book> domainObj, String bookName)
			throws BookStoreAppException;

	List<Book> findAll(Class<Book> domainClass) throws BookStoreAppException;
}
