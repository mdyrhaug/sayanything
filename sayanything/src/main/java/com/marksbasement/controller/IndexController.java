package com.marksbasement.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marksbasement.domain.Say;
import com.marksbasement.services.SayService;

@Controller
public class IndexController {

	@RequestMapping("/home")
	public String index(ModelMap model) {
		System.out.println("in home");		
		SayService service = new SayService();
		List<Say> says = service.getSays();
		model.addAttribute("says",says);
		return "index";
	}
	
	@RequestMapping(value="/newEntry", method=RequestMethod.POST)
	public String newEntry(Model model) {
		System.out.println("in newEntry");
		Say sayEntry = new Say();
		sayEntry.setName("name");
		sayEntry.setLocation("location");
		sayEntry.setSay("say");
		model.addAttribute("say", sayEntry);
		SayService service = new SayService();
		service.insertSay(sayEntry);
		return "index";
	}
	
}
