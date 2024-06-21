package springmvc.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("This is one handler");
		return "redirect:/two";
	}
	
	@RequestMapping("/third")
	public RedirectView third() {
		System.out.println("This is third handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.co.in/");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is second handler");
		return "contact";
	}
}
