package com.example.app.lombok;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.app.domain.dto.PersonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class lombokTests {

	@Test
	public void PersonDtoTests() {
		PersonDto ob = new PersonDto();
		ob.setName("홍길동");
		ob.setAddr("대구");
		ob.setAge(55);
		log.info(ob.toString());
		assertNotNull(ob);
	}
	@Test
	public void personDtoTests_2() {
		// @Builder 패턴 사용해보기
		PersonDto ob = PersonDto.builder()
				.age(11)
				.name("홍길동")
				.addr("울산")
				.build();
		log.info(ob.toString());
		assertNotNull(ob);
	}
}
