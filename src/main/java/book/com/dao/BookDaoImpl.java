package book.com.dao;

import java.util.List;

import org.hibernate.Query;

import book.com.domain.Book;

//@Transactional
public class BookDaoImpl extends BaseDaoImpl<Book> implements BookDao {

	@Override
	public List<Book> findByName(Class<Book> domainObj, String bookName) {

		Query query = getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select distinct b from Book b where b.bookName=:bookName");
		query.setParameter("bookName", bookName);
//		query.setMaxResults(1);
//		Book book = (Book) query.uniqueResult();

		return query.list();

	}

}
