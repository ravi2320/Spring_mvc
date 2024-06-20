package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRange;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Registration Form");
		model.addAttribute("Desc", "Registration of User");
	}

	@RequestMapping("/contact")
	public String showForm(Model model) {

		/*
		 * model.addAttribute("Header", "Registration Form"); model.addAttribute("Desc",
		 * "Registration of User");
		 */
		return "contact";
	}

	@RequestMapping(path = "/regprocess", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		/*
		 * model.addAttribute("Header", "Success Message"); model.addAttribute("Desc",
		 * "Form Submitted Data");
		 */
		model.addAttribute("msg", "User created Successfully...!");
		this.userService.createUser(user);
		return "success";
	}
	/*
	 * @RequestMapping(path = "/regprocess", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String
	 * email, @RequestParam("username") String name,
	 * 
	 * @RequestParam("password") String pass, Model model) {
	 * 
	 * User user = new User(email, name, pass);
	 * 
	 * System.out.println(user);
	 * 
	 * 
	 * model.addAttribute("email", email); model.addAttribute("name", name);
	 * model.addAttribute("pass", pass);
	 * 
	 * 
	 * model.addAttribute("user", user); return "success"; }
	 */
}
