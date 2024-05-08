package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.app.domain.dto.MemoDto;
import com.example.app.domain.service.MemoServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class RestTestController {
	
	@Autowired
	private MemoServiceImpl memoServiceImpl;
	
	@GetMapping("/rest")
	public void rest() {
		log.info("Get /rest ...");
	}
	@GetMapping("/add_get")
	public void add_Get_sync(MemoDto memoDto) throws Exception {
		log.info("Get /add_get" + memoDto);
		memoServiceImpl.memoRegistration(memoDto);
	}
}
