package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRange;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	@RequestMapping(path = "/regprocess", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, @RequestParam("username") String name,
			@RequestParam("password") String pass, Model model) {
		System.out.println(email);
		System.out.println(name);
		System.out.println(pass);

		model.addAttribute("email", email);
		model.addAttribute("name", name);
		model.addAttribute("pass", pass);
		
		return "success";
	}
}
