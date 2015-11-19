package book.com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import book.com.domain.Book;
import book.com.exception.BookStoreAppException;

@Service
@Transactional
public interface BookService {

	public void addBook(Book book) throws BookStoreAppException;

	public void updateBook(Book book) throws BookStoreAppException;

	public Book getBookById(int bookId) throws BookStoreAppException;

	public List<Book> getBookByName(String bookName) throws BookStoreAppException;

	public List<Book> listBooks() throws BookStoreAppException;

	public void removeBook(Book book) throws BookStoreAppException;
}
