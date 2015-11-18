package book.com.dao;

import javax.transaction.Transactional;

import book.com.domain.User;
import book.com.exception.BookStoreAppException;

@Transactional
public interface LoginDao {

	public User loadUserByUsername(final String username)throws BookStoreAppException;
}
