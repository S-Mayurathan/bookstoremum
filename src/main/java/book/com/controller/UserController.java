package book.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import book.com.domain.User;
import book.com.exception.BookStoreAppException;
import book.com.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/signup")
	public String redirectRoot() {
		return "redirect:/login";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String add(User user) throws BookStoreAppException {
		userService.addUser(user);
		return "redirect:/";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String addCar(@ModelAttribute("user") User user) {
		return "signup";
	}

	@ExceptionHandler(value = BookStoreAppException.class)
	public ModelAndView handle(Exception e) {
		ModelAndView mv = new ModelAndView();
		mv.getModel().put("e", e);
		mv.setViewName("noSuchResource");
		return mv;
	}
}
