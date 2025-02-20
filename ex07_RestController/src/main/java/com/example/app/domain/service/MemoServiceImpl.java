package com.example.app.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.app.domain.dao.MemoDaoImpl;
import com.example.app.domain.dto.MemoDto;
import com.example.app.domain.dto.mapper.MemoMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemoServiceImpl {
	@Autowired
	private MemoMapper memoMapper;
	
	public boolean memoRegistration(MemoDto memoDto) throws Exception{
		System.out.println("Insert!!!!!!!!!!!!!!" + memoMapper.Insert(memoDto));
		return memoMapper.Insert(memoDto)> 0;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void addMemoTx(MemoDto memoDto) throws Exception {
		log.info("MemberService addMemoTx() invoke...");
		memoMapper.Insert(memoDto); //RollBack x
		memoDto.setId(memoDto.getId()-1);
		memoMapper.Insert(memoDto); //PK 중복 오류발생
	}
	@Transactional(rollbackFor = Exception.class)
	public boolean modifiedMemo(MemoDto memoDto) throws Exception{
		log.info("MemberService modifiedMemo() invoke...");
		return memoMapper.Update(memoDto) > 0;
		
	}
	@Transactional(rollbackFor = Exception.class)
	public boolean deleteMemo(int id) throws Exception{
		log.info("MemberService deleteMemo() invoke...");
		return memoMapper.Delete(id) > 0;
	}
	@Transactional(rollbackFor = Exception.class)
	public List<MemoDto> SelectAllMemo(MemoDto memoDto) throws Exception{
		
		return memoMapper.SelectAllMemo(memoDto);
	}
	
	
}	
