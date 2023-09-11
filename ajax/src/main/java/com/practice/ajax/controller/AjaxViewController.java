package com.practice.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ajax")
public class AjaxViewController {
	
	@GetMapping("/ex01")
	public String ajaxExample01(){
		
		return "/example/ex01";
	}	
	@GetMapping("/ex02")
	public String ajaxExample02(){
		
		return "/example/ex02";
	}	
	@GetMapping("/ex03")
	public String ajaxExample03(){
		
		return "/example/ex03";
	}
}
