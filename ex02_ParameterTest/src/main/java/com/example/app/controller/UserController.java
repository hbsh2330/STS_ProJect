package com.example.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.domain.dto.UserDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserController {
	@GetMapping("/join")
	public void join() {
		log.info("GET / join");
	}
	@PostMapping("/join")
	public void join_post(@Valid UserDto userdto, BindingResult bindingResult, Model model) {
		log.info("POST / join" +userdto);
		if (bindingResult.hasFieldErrors()) { // 에러가 발생했다면
//			log.info("validationCheck Error : " + bindingResult.getFieldError("id").getDefaultMessage()); 
			for(FieldError error : bindingResult.getFieldErrors()) {
				log.info("ErrorField : " + error.getField() + " ErrorMsg : " + error.getDefaultMessage()); 
				model.addAttribute(error.getField(), error.getDefaultMessage());
			}
		}
	}


}


