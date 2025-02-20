package com.example.app.mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.app.DataSource.DataSourceTests;
import com.example.app.domain.dto.BoardDto;
import com.example.app.domain.mapper.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class mybatisTest {

	@Autowired
	private BoardMapper boardMapper;

	@Test
	public void InsertTest() {
		boardMapper.Insert(new BoardDto(1L, "제목1", "내용1", "작성자1", "1월1일"));
	}

	@Test
	public void UpdateTest() {
		boardMapper.Update(new BoardDto(1L, "제목1수정", "내용1수정", "작성자1수정", "1월1일수정"));
	}

	@Test
	public void DeleteTest() {
		boardMapper.Delete(1L);
	}

	@Test
	public void SelectOneTest() {
		BoardDto boardDto = boardMapper.SelectOne(1L);
		System.out.println("boardDto : " + boardDto.toString());
	}
	@Test
	public void SelectAll() {
		List<BoardDto> list = boardMapper.SelectAll();
		for(BoardDto dto : list) {
			System.out.println(dto);
		}
	}
}
