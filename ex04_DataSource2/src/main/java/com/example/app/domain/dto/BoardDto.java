package com.example.app.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardDto {
	private Long id;
	private String title;
	private String contents;
	private String writer;
	private String regDate;
}
