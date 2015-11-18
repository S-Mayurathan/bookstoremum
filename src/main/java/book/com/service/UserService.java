package book.com.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import book.com.domain.User;
import book.com.exception.BookStoreAppException;

@Service
@Transactional
public interface UserService {
	
	User addUser(User user) throws BookStoreAppException;
	
	User getUser(int userId) throws BookStoreAppException;
}
