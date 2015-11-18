package book.com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.com.dao.BookDao;
import book.com.domain.Book;
import book.com.exception.BookStoreAppException;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;

	public BookServiceImpl() {
		super();
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void addBook(Book book) throws BookStoreAppException {
		bookDao.save(book);
	}

	@Override
	public void updateBook(Book book) throws BookStoreAppException {
		bookDao.update(book);

	}

	@Override
	public Book getBookById(int bookId) throws BookStoreAppException {
		Book bookData = (Book) bookDao.findById(Book.class, bookId);
		return bookData;
	}

	@Override
	public List<Book> listBooks() throws BookStoreAppException {
		List<Book> bookList = bookDao.findAll(Book.class);
		return bookList;
	}

	@Override
	public void removeBook(Book book) throws BookStoreAppException {
		bookDao.delete(book);

	}

}
