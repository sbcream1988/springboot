package com.mysite.sbb.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnswerForm {

	
	@NotEmpty(message = "내용은 필수 입력사항입니다.")
	private String content;
	
}
