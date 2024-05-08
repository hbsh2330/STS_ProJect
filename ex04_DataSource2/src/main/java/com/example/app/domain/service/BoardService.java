package com.example.app.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.domain.dto.BoardDto;
import com.example.app.domain.mapper.BoardMapper;

@Service
public class BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	public void Update() {
		boardMapper.Update(new BoardDto(1L, "제목1수정", "내용1수정", "작성자1수정", "1월1일수정"));
	}
}
