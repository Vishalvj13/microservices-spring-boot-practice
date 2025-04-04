package com.quiz.entities;

public class Question {

    private Long questionId;
    private String question;
    private Long quizId;

    public Question() {
    }

    public Question(Long questionId, String question, Long quizId) {
        this.questionId = questionId;
        this.question = question;
        this.quizId = quizId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", quizId=" + quizId +
                '}';
    }
}
