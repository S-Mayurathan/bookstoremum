package book.com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import book.com.dao.LoginDao;
import book.com.domain.User;
import book.com.exception.BookStoreAppException;

@Service
public class LoginService implements UserDetailsService {

	@Autowired
	private LoginDao loginDao;

	@Override
	public User loadUserByUsername(String name) throws UsernameNotFoundException {
		User user=null;
		try {
			user = loginDao.loadUserByUsername(name);
		} catch (BookStoreAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public LoginService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
}
