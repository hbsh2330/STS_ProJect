package com.example.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.app.domain.dto.PersonDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/test")
public class ParameterTestController {
	@GetMapping("/p01")
	public void p1(@RequestParam(required = true)String name) {
		log.info("GET/ test/ p01..." + name);
	}
	@GetMapping("/p02")
	public void p2(@RequestParam(required = false, name="username")String name) {
		log.info("GET/ test/ p02..." + name);
	}
	@PostMapping("/p03")
	public void p3(String username, int age, String addr) {
		log.info("Post/ test/ p03..." + username + addr + age);
	}
	
	//@RequestParam 	: 동기요청 방식 기본 / form 기반 요청 받기
	//@RequestBody 		: 비동기요청 방식의 기본/ form / json 등 받기
	
	@PostMapping("/p04")
	public void p4(@RequestBody String username) {
		log.info("POST/ test/ p04..." + username);
	}
	
	@GetMapping("/p05")
	public void p5(@RequestParam(required = false, defaultValue = "홍길동")String username) {
		log.info("POST/ test/ p05..." + username);
	}
	@GetMapping("/p06")
	public void p6(String username, int age, String addr) {
		log.info("Get/ test/ p06..." + username + addr + age);
	}
	
	@GetMapping("/p07")
	public void p7(PersonDto dto) {
		log.info("Get/ test/ p06..." + dto);
	}
	@GetMapping("/p08/{name}/{age}/{addr}")
	public void p8(
			@PathVariable String name,
			@PathVariable int age,
			@PathVariable String addr) {
		log.info("Post/ test/ p08..." + name + addr + age);
	}
	
	@GetMapping("/p09/{name}/{age}/{addr}")
	public void p9(PersonDto dto) {
		log.info("Post/ test/ p09..." +dto);
	}
	
	@GetMapping("/page1")
	public void page1(PersonDto dto, Model model) {
		log.info("Post/ test/ p09..."+ dto);
		model.addAttribute("TEST1", "TEST1_value");
		model.addAttribute("personDto", dto);
		
	}
	
	@GetMapping("/page2")
	public String page2(PersonDto dto, Model model) {
		log.info("Post/ test/page2..."+ dto);
		model.addAttribute("TEST1", "page2_value");
		model.addAttribute("personDto", dto);
		return "test/page1";
	}
	
	@GetMapping("/page4/{name}/{age}/{addr}")
	public ModelAndView page4(PersonDto dto) {
		log.info("GET/ test/page4 ..." + dto);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("personDto","dto");
		modelAndView.setViewName("test/page1");
		return modelAndView;
	}
	
	//redirect
	@GetMapping("/redirect1")
	public String f1(Model model) {
		log.info("GET /test/redi0rect1...");
		model.addAttribute("redirect1","redirect11value");
		return "redirect:/test/redirect2";
	}
	
	@GetMapping("/redirect2")
	public String f2(Model model) {
		log.info("GET /test/redirect2...");
		model.addAttribute("redirect1","redirect12value");
		return "redirect:/test/redirect3";
	}
	
	@GetMapping("/redirect3")
	public void f3(Model model) {
		log.info("GET /test/redirect3...");
		model.addAttribute("redirect1","redirect13value");
	}
	
	//ServletCode 적용확인
	@GetMapping("/servlet_test")
	public String Servlet_test(HttpServletRequest request, HttpServletResponse response) {
		request.getParameter("usernmae");
		request.getParameter("age");
		request.getParameter("addr");
		log.info("GET /test/servlet_test");
		return "test/servlet_test";
	}
	@GetMapping("/join")
	public void join_get() {
		log.info("GET /test/join...");
	}
	
	@PostMapping("/join")
	public void join_Post(PersonDto dto) {
		log.info("Post /test/join..." + dto);
	}
}	
