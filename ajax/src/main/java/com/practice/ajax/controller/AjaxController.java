package com.practice.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	
	@GetMapping("/ajaxEx01")
	public String ajaxExample01() {
		
		System.out.println("AjaxController.ajaxExample01");
		return "index";
	}
	@PostMapping("/ajaxEx02")
	public @ResponseBody String ajaxExample02() {
		
		return "HelloWorld";
	}
}
