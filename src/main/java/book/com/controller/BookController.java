package book.com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import book.com.domain.Book;
import book.com.exception.BookStoreAppException;
import book.com.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String getAll(Model model) throws BookStoreAppException {
		model.addAttribute("books", bookService.listBooks());
		return "bookList";
	}

	// This will be creating a webservice with entire book information
	@RequestMapping(value = "/bookservice", method = RequestMethod.GET)
	@ResponseBody
	public List<Book> getAllBooks() throws BookStoreAppException {
		List<Book> books = bookService.listBooks();
		return books;
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public String getAllBook(Model model) throws BookStoreAppException {
		model.addAttribute("books", bookService.listBooks());
		return "bookList";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public String addBook(@ModelAttribute("book") Book book) {
		return "addBook";
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String add(@Valid Book book, BindingResult result)
			throws BookStoreAppException {
		if (result.hasErrors()) {
			return "addBook";
		} else {
			bookService.addBook(book);
			return "redirect:/books";
		}
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public String get(@PathVariable int id, Model model)
			throws BookStoreAppException {
		model.addAttribute("book", bookService.getBookById(id));
		return "bookDetail";
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.POST)
	public String update(@Valid Book book, BindingResult result,
			@PathVariable int id) throws BookStoreAppException {
		if (result.hasErrors()) {
			return "bookDetail";
		} else {
			bookService.updateBook(book);
			return "redirect:/books";
		}
	}

	@RequestMapping(value = "/books/delete", method = RequestMethod.POST)
	public String delete(int bookId) throws BookStoreAppException {
		Book book = bookService.getBookById(bookId);
		bookService.removeBook(book);
		return "redirect:/books";
	}

	@ExceptionHandler(value = BookStoreAppException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("noSuchResource");
		return mv;
	}
}
