package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    //createQuiz
    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.addQuiz(quiz);
    }
    //getAllQuizes
    @GetMapping
    public List<Quiz> getAllQuizes() {
        return quizService.getAllQuizes();
    }
    //getQuiz
    @GetMapping("/{id}")
    public Quiz getQuiz(@PathVariable Long id) {
        return quizService.getQuiz(id);
    }
    //deleteQuiz
    @DeleteMapping("/remove-quiz/{quizId}")
    public void removeQuiz(@PathVariable Long quizId) {
        quizService.deleteQuiz(quizId);
    }
}
