package com.example.app.domain.dto.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.domain.dto.MemoDto;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;

@Mapper
public interface MemoMapper {
	@SelectKey(statement = "select max(id)+1 from tblmemo", keyProperty = "id", before = false, resultType = int.class)
	@Insert("insert into tblmemo values(null,#{text})"-
	public int Insert(MemoDto memoDto);
	
//	@Update("update tblmemo set text=#{text} where id=#{id}")
//	public int Update(MemoDto memoDto);
//	
//	@Delete("delete from tblmemo where id=#{id}")
//	public int Delete(int id);
//
//	@Select("select * from tblmemo where id=#{id}")
//	public MemoDto SelectAt(@Param("id") int ass);
//	
//	@Select("select * from tblmemo")
//	public List<MemoDto> SelectAll();
//	
//	@Results(id="MemoResultMap", value = {
//		@Result(property = "id", column = "id"),
//		@Result(property = "id", column = "id")
//	})
//	@Select("select * from tblmemo")
//	public List<Map<String, Object>> SelectAllResultMap();

	public int InsertXML(MemoDto memoDto);
	public int UpdateXML(MemoDto memoDto);
	public int DeleteXML(int id);
	public MemoDto SelectAtXML(@Param("id") int ass); // @Param을 붙이면 파라미터 값의 이름이 db 테이블 명이랑 달라도 된다. 
	public List<MemoDto> SelectAllXML();
	public List <Map<String,Object>> SelectAllResultMap();
	
	//동적쿼리 적용함수
	public List <Map<String,Object>> SelectIf(Map<String, Object> map);
	public List <Map<String,Object>> SelectWhen(Map<String, Object> map);

}
