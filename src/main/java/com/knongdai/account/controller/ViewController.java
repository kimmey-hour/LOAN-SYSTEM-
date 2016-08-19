package com.knongdai.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
	
	@RequestMapping({"/" , "/index" , "/home" , "/login"})
	public String loginPage(@RequestParam(value="continue-site" , required=false) String continueSite ,ModelMap model){
		model.addAttribute("continueSite",continueSite);
		return "login";
	}

}
