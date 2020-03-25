package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.modal.Alien;
import com.assignment.service.AlienService;

@Controller
public class HomeController {
	
	@Autowired
	AlienService service;
	@RequestMapping("home")
	public String home() {
		System.out.println("in home");
		return "home";
	}

	@RequestMapping(value="addAlien" , method = RequestMethod.POST)
	public ModelAndView addAlien(ModelMap modal,Alien alien ,BindingResult result) {
		ModelAndView mv =  new ModelAndView();
		System.out.println("inserting alien");
		service.addAlien(alien.getAid(),alien.getApass());
		mv.addObject("alien",alien);
		mv.setViewName("success");
		return mv;
	}
}
