package com.quiz.services;

import com.quiz.entities.Quiz;

import java.util.List;

public interface QuizService {

    Quiz addQuiz(Quiz quiz);
    List<Quiz> getAllQuizes();
    Quiz getQuiz(Long id);
    void deleteQuiz(Long id);
}