package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) 
	{
		System.out.println("This is home url");
		
		model.addAttribute("name", "Ravindra Kadam");
		model.addAttribute("id", 101);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Ravindra");
		friends.add("Rajendra");
		friends.add("Ranjana");
		
		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
}
