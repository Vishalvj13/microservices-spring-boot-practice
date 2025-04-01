package com.question.services;

import com.question.entities.Question;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface QuestionService {

    public Question createQuestion(Question question);
    public List<Question> getAllQuestions();
    public Question getQuestion(long id);
    public List<Question> getQuestionsOfQuiz(Long quizId);
    public void removeQuestionById(Long id);
}
