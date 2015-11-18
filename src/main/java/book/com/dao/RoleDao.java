package book.com.dao;

import javax.transaction.Transactional;

import book.com.domain.Role;
import book.com.exception.BookStoreAppException;

@Transactional
public interface RoleDao {
	 Role save(Role domainObj) throws BookStoreAppException;
}
