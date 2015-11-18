package book.com.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.com.dao.UserDao;
import book.com.domain.Role;
import book.com.domain.User;
import book.com.exception.BookStoreAppException;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public UserServiceImpl() {
		super();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User addUser(User user) throws BookStoreAppException {
		List<Role> role=new ArrayList<>();
		role.add(new Role("ROLE_USER"));
		user.setAuthorities(role);
		User userData = userDao.save(user);
		
		
		return userData;
	}

	@Override
	public User getUser(int userId) throws BookStoreAppException {
		User userData = (User) userDao.findById(User.class, userId);
		return userData;
	}

}
