package com.practice.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	
	@GetMapping("/ajaxEx01")
	public String ajaxExample01() {
		
		System.out.println("AjaxController.ajaxExample01");
		return "index";
	}
}
