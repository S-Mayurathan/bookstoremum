package book.com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import book.com.domain.Book;

@Controller
public class UserBookController {

	@RequestMapping("/userBookList")
	public ModelAndView listUsers() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/bookstore/bookservice";
		List<LinkedHashMap> books = restTemplate.getForObject(url, List.class);
		return new ModelAndView("userBookList", "books", books);
	}

	@RequestMapping(value = "/userBookList", params = "search", method = RequestMethod.POST)
	public ModelAndView listUsersQuery(@RequestParam String search) {
		String url = "http://localhost:8080/bookstore/test/{search}";
		Map<String, String> params = new HashMap<String, String>();
		params.put("search", search);
		RestTemplate restTemplate = new RestTemplate();

		List<Book> books = restTemplate.getForObject(url, List.class, params);
		
	
		List<Book> outBook = new ArrayList<>();
		outBook.addAll(books);
		
		return new ModelAndView("userBookList", "books", books);
	}

	@RequestMapping(value = "/userBookList", params = "search", method = RequestMethod.GET)
	public ModelAndView listUsersQueryGet(@RequestParam String search) {
		String url = "http://localhost:8080/bookstore/test/{search}";
		Map<String, String> params = new HashMap<String, String>();
		params.put("search", search);
		RestTemplate restTemplate = new RestTemplate();

		List<Book> books = restTemplate.getForObject(url, List.class, params);
	
		
		List<Book> outBook = new ArrayList<>();
		outBook.addAll(books);
		return new ModelAndView("userBookList", "books", outBook);
	}
	
	
}
