package com.example.app.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.dto.BoardDto;

@Mapper
public interface BoardMapper {
	int Insert(BoardDto boardDto);
	int Update(BoardDto boardDto);
	int Delete(Long id);
	BoardDto SelectOne(Long id);
	List<BoardDto> SelectAll();
}
