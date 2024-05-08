package com.example.app.mybatis;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.app.DataSource.DataSourceTests;
import com.example.app.domain.dto.MemoDto;
import com.example.app.domain.dto.mapper.MemoMapper;

import lombok.val;
import lombok.extern.slf4j.Slf4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Slf4j
public class MybatisTests {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Autowired
	private MemoMapper memoMapper;
	
	
	@Test
	public void sqlSessionFactoryTests() {
		log.info(sqlSessionFactory.toString());
	
	}
//	@Test
//	public void memoTests() {
//		/*
//		 * for(int i=1; i<=10; i++) { memoMapper.Insert(new MemoDto(i, "TEST"+i)); }
//		 */
////		List<MemoDto> list = memoMapper.SelectAll();
////		for(MemoDto memoDto : list) 
////			log.info(memoDto.toString());
////		
//		List<Map<String, Object>> result = memoMapper.SelectAllResultMap();
//		result.forEach((map)->{
//			for(String key : map.keySet()) {
//				log.info(key+" : " + map.get(key));
//			}
//		});
//	}
//	@Test
//	public void MybatisTestXml(){
//		MemoDto dto = memoMapper.SelectAtXML(3);
//		log.info(dto.toString());
//	}
	@Test
	public void SelectKeyTests() {
//		memoMapper.Insert(new MemoDto(-1, "HAHA"));
		MemoDto dto = new MemoDto(-1, "WOW");
		memoMapper.InsertXML(dto);
		log.info(dto.toString());
	}

	@Test
	public void DynamicQerys() {
		Map<String, Object> param = new HashMap();
		param.put("condition" , false)
		param.put("type", "text");
		param.put("id", "2");
		List<Map<String,Object>> result = memoMapper.SelectWhen(param);
		result.forEach(map->{
			for(String Key : map.keySet()) {
				System.out.println("key : " + Key + "VAL :" + map.get(Key));
			}
		})
	}
	
	
	
}
