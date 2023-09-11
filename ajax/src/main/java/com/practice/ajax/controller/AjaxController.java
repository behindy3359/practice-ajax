package com.practice.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.ajax.dto.AjaxDTO;

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
	@GetMapping("/ajaxEx03")
	public @ResponseBody  String ajaxExample03( @RequestParam("param1") String param1, @RequestParam("param2") String param2) {
		
		System.out.println("Param1 = "+param1 + ", Param2 = "+ param2);
		
		return "Called ajaxExanple03 method";
	}
	@PostMapping("/ajaxEx04")
	public @ResponseBody  String ajaxExample04( @RequestParam("param1") String param1, @RequestParam("param2") String param2) {
		
		System.out.println("Param1 = "+param1 + ", Param2 = "+ param2);

		return "Called ajaxExanple04 method";
	}
	@GetMapping("/ajaxEx05")
	public @ResponseBody AjaxDTO ajaxExample05( @ModelAttribute AjaxDTO ajaxDTO ) {
		
		System.out.println( "ajaxExample05, ajaxDTO = "+ ajaxDTO );

		return ajaxDTO;
	}	
	@PostMapping("/ajaxEx06")
	public @ResponseBody AjaxDTO ajaxExample06( @ModelAttribute AjaxDTO ajaxDTO ) {
		
		System.out.println( "ajaxExample06, ajaxDTO = "+ ajaxDTO );

		return ajaxDTO;
	}
}
