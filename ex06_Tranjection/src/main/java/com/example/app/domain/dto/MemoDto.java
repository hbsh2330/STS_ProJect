package com.example.app.domain.dto;

import java.time.LocalDateTime;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoDto {
	@Min(value = 10, message = "최소 숫자는 10이상 이어야 합니다.") // 최소숫자 지정
	@Max(value = 1000, message = "최대숫자는 1000이하 이어야 합니다.") // 최대숫자 지정
	@NotNull(message = "id를 입력하세요") //Null 만체크
	private Integer id;
	@NotBlank(message = "Text를 입력하세요") //비어있는지 확인 ""과 null 체크 
	private String text;
//	@NotBlank(message = "Writer를 입력하세요") //비어있는지 확인 ""과 null 체크
//	@Email(message = "이메일을 입력하세요")
//	private String writer;
//	@Future(message = "현재 날짜 기준 이후 날짜를 선택해야합니다.")
//	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
//	private LocalDateTime regdate;
}
