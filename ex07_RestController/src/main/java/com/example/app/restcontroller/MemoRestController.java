package com.example.app.restcontroller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.domain.dto.MemoDto;
import com.example.app.domain.service.MemoServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/memo")
public class MemoRestController {
	
	@Autowired
	private MemoServiceImpl memoServiceImpl;
	
	@GetMapping(value = "/add_get")
	public boolean add_get(MemoDto memoDto) {
		log.info("GET /memo/..." + memoDto);
		boolean isadded = false;
		try {
			isadded = memoServiceImpl.memoRegistration(memoDto);
		}catch (Exception e) {
			e.printStackTrace();
			 //data 값
		}
		return isadded;
	}
	@PostMapping(value = "/add_post")
	public ResponseEntity add_post(@RequestBody MemoDto memoDto) throws UnsupportedEncodingException {
		log.info("POST /memo/..." + memoDto);
		boolean isadded = false;
		try {
			isadded = memoServiceImpl.memoRegistration(memoDto);
			if(isadded) {
				return new ResponseEntity("Post ADD 성공".getBytes("UTF-8"), HttpStatus.OK); // 이 이 "Post ADD 성공"값이 data로 자바스크립트에 전달이됨
			}
		}catch (Exception e) {
			e.printStackTrace();
			 //data 값
		}
		return new ResponseEntity("Post ADD 실패".getBytes("UTF-8"), HttpStatus.BAD_GATEWAY); // 이 "Post ADD 실패"값이 data로 자바스크립트에 전달이됨
	}
	@PutMapping(value = "/add_put")
	public ResponseEntity<String> add_put(@RequestBody MemoDto memoDto) {
		
		log.info("PUT / memo/put ..." + memoDto);
		boolean isUpdate = false;
		try {
		isUpdate = memoServiceImpl.modifiedMemo(memoDto);
		if(isUpdate == true)
			return new ResponseEntity("SUCCESS", HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity("FAIL", HttpStatus.BAD_GATEWAY);
	}
	@PatchMapping(value = "/add_patch")
	public ResponseEntity<String> add_patch(@RequestBody MemoDto memoDto) {
		log.info("PATCH / memo / patch..." + memoDto );
		boolean isUpdate = false;
		try {
		isUpdate = memoServiceImpl.modifiedMemo(memoDto);
		if(isUpdate == true)
			return new ResponseEntity("SUCCESS", HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity("FAIL", HttpStatus.BAD_GATEWAY);
	}
	
	@DeleteMapping(value = "add_delete")
	public ResponseEntity<String> add_delete(int id) {
		log.info("DELETE / memo / delete..." + id );
		boolean isDelete = false;
		try {
		 isDelete = memoServiceImpl.deleteMemo(id);
		 if(isDelete == true)
			 return new ResponseEntity<String>("SUCESS", HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<String>("FAIL", HttpStatus.BAD_GATEWAY);
	}
	@GetMapping(value = "add_select")
	public ResponseEntity<String> add_Select_one(int id){
		
		return null;
	}
	@GetMapping(value = "all")
	public ResponseEntity<List<MemoDto>> getAllMemo(MemoDto memoDto) throws Exception{
		log.info("GET /memo/all..." + memoDto);
		List<MemoDto> list = memoServiceImpl.SelectAllMemo(memoDto);
		return new ResponseEntity<List<MemoDto>>(list, HttpStatus.OK);
	}
}
