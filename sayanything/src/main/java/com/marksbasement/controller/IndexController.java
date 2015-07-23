package com.marksbasement.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marksbasement.domain.Say;
import com.marksbasement.services.SayService;

@Controller
public class IndexController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String index(Model model) {
		System.out.println("in home");		
		SayService service = new SayService();
		List<Say> says = service.getSays();
		model.addAttribute("says",says);
		model.addAttribute("newSay",new Say());
		return "index";
	}
	
	@RequestMapping(value="/newEntry", method=RequestMethod.POST)
	public String newEntry(@ModelAttribute("say")Say say, BindingResult result) {
		System.out.println("in newEntry");
		System.out.println("say: "+say.getSay());
		SayService service = new SayService();
		service.insertSay(say);
		return "redirect:/home.mb";
	}
	
}
