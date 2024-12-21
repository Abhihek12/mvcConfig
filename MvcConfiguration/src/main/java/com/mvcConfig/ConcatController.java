package com.mvcConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvcConfig.Modal.User;
import com.mvcConfig.Service.userService;

@Controller
@RequestMapping("/concat")
public class ConcatController {
	
	
	@Autowired
	private userService userServ;
	
	@ModelAttribute
	public void commanModalData(Model m) {
		m.addAttribute("about", "This is Form is For Testing Prpose");
		m.addAttribute("logo", "Regeistration Form");
	}

	@RequestMapping(value="/getForm",method=RequestMethod.GET)
	public String concatPage(Model m) {
		return "concat";
	}
	
//	
//	@RequestMapping(value="/saveConcatForm",method=RequestMethod.POST)
//	public String saveForm(HttpServletRequest req) {
//		//modal.addAttribute("name", req.getAttribute("name"));
//		String name = (String) req.getParameter("name");
//		String email = (String) req.getParameter("email");
//		String pass = (String) req.getParameter("password");
//		System.out.println(name+ " "+ pass + "  "+ email);
//		return "";
//	}
	
//	@RequestMapping(value="/saveConcatForm",method=RequestMethod.POST)
//	public String saveForm(@RequestParam("name") String name,@RequestParam("email") String email,
//			@RequestParam("password") String password,Model model) {
//		
//		    model.addAttribute("isSaveFlg", true);
//		    model.addAttribute("name", name);
//
//		    System.out.println(name);
//		    System.out.println(email);
//		    System.out.println(password);
//		
//				return "concat";
//		
//		
//		
//	}
//	
	
	
	@RequestMapping(value="/saveConcatForm",method=RequestMethod.POST)
	public String saveForm(@ModelAttribute User user,Model model) {
		
		   
		    if(user.getName().isEmpty()) {
			    System.out.println("FAil");

		    	return "redirect:/about";
		    }else {
		    	 model.addAttribute("isSaveFlg", true);
				   String msg = userServ.createUser(user);
				    System.out.println(msg);
		    	return "success";
		    	
		    }

				
		
		
		
	}
	
	@RequestMapping(value="/fail",method=RequestMethod.GET)
	public String redirectToFail(Model model) {
		
		return "redirect:/concat";
	}
	
	
	
	
	
}
