package com.mysite.sbb.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {

	private final AnswerService answerService;
	private final QuestionService questionService;
	
	
	@PostMapping("/create/{id}")
	public String create(Model model, @PathVariable("id") Integer id, @Valid AnswerForm answerForm, BindingResult bidingResult) {
		Question question = this.questionService.getQuestion(id);
		if(bidingResult.hasErrors()) {
			model.addAttribute("question",question);
			return "question_detail";
		}
		this.answerService.createAnswer(answerForm.getContent(), question);
		return String.format("redirect:/question/detail/%s", id);
	}
	
}
