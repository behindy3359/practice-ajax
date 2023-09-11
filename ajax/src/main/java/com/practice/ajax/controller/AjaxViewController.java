package com.practice.ajax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajax")
public class AjaxViewController {

	@GetMapping("/ex01")
	public String ajaxExample01() {

		return "/example/ex01";
	}

	@GetMapping("/ex02")
	public String ajaxExample02() {

		return "/example/ex02";
	}

	@GetMapping("/ex03")
	public String ajaxExample03() {

		return "/example/ex03";
	}

	@GetMapping("/ex04")
	public String ajaxExample04() {

		return "/example/ex04";
	}

	@GetMapping("/ex05")
	public String ajaxExample05() {

		return "/example/ex05";
	}

	@GetMapping("/ex06")
	public String ajaxExample06() {

		return "/example/ex06";
	}

	@GetMapping("/ex07")
	public String ajaxExample07() {

		return "/example/ex07";
	}

	@GetMapping("/ex08")
	public String ajaxExample08() {

		return "/example/ex08";
	}

	@GetMapping("/ex09")
	public String ajaxExample09() {

		return "/example/ex09";
	}

	@GetMapping("/ex10")
	public String ajaxExample10() {

		return "/example/ex10";
	}
}
