package de.tqg.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("UserClickHome", true);
		
		return mv;
	}
	
	// add the request mapping in the PageController 
	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("UserClickAbout", true);
		
		return mv;
	}

	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		ModelAndView mvContact = new ModelAndView("page");
		mvContact.addObject("title", "Contact");
		mvContact.addObject("UserClickContact", true);
		
		return mvContact;
	}

}
