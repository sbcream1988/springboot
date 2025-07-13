package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class BoardWebApplicationTests {
	
	@Autowired
	QuestionService questionService;
	
	@Test
	void contextLoads() {
//		
//		for(int i = 1; i <=300; i++) {
//			Question question = new Question();
//			String subject = String.format("테스트입니다[%03d]", i);
//			String content = "내용없음";
//			questionService.createQuestion(subject, content);
//		}
	}

}
