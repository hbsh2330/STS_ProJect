package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = "/simple")
@Slf4j
public class SimpleController {
	@RequestMapping(value= "/t1", method=RequestMethod.GET)
	public void t1() {
		log.info("GET /simple/t1");
	}
	@RequestMapping(value= "/t1", method=RequestMethod.POST)
	public void t1_post() {
		log.info("POST /simple/t1");
	}
	@RequestMapping(value= "/t2", method= {RequestMethod.GET, RequestMethod.POST})
	public void t2() {
		log.info("GET /simple/t2");
	}
}

