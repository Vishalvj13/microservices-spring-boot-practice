package com.question.controller;

import com.question.entities.Question;
import com.question.repositories.QuestionRepository;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }

    @GetMapping
    public List<Question> getQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{questionId}")
    public Question getQuestion(@PathVariable long questionId) {
        return questionService.getQuestion(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId) {
        return questionService.getQuestionsOfQuiz(quizId);
    }

    @DeleteMapping("/remove-question/{questionId}")
    public void removeQuestionById(@PathVariable Long questionId) {
        questionService.removeQuestionById(questionId);
    }
}
