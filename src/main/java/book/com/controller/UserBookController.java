package book.com.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserBookController {
	
	@RequestMapping("/userBookList")
	public ModelAndView listUsers() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/bookstore/bookservice";
		List<LinkedHashMap> books = restTemplate.getForObject(url, List.class);
		return new ModelAndView("userBookList", "books", books);
	}
	
	@RequestMapping(value="/userBookList", params="search")
	public ModelAndView listUsersQuery(@RequestParam String search) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/bookstore/bookservice/search="+search;
		List<LinkedHashMap> books = restTemplate.getForObject(url, List.class);
		return new ModelAndView("userBookList", "books", books);
	}
}
