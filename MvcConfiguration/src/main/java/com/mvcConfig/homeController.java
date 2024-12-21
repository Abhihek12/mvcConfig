package com.mvcConfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class homeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model modal) {
		modal.addAttribute("name","Abhishek");

	List<String> ar = new ArrayList<String>();
ar.add("Abhishek");
ar.add("Singh");
ar.add("is a");
ar.add("Good ");
ar.add("Java Developer");
modal.addAttribute("array",ar);

		return "about";
		
	}

}
