package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("first")
public class HomeController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Ravindra");
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(99);
		list.add(85);
		list.add(87);
		modelAndView.addObject("marks", list);
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}
