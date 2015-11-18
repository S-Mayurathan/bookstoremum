package book.com.dao;

import javax.transaction.Transactional;

import book.com.domain.User;
@Transactional
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
