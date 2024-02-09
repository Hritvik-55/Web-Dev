package com.rivia.quizservice.service;

import com.rivia.quizservice.dao.QuizDao;
import com.rivia.quizservice.model.QuestionWrapper;
import com.rivia.quizservice.model.Quiz;
import com.rivia.quizservice.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.rivia.quizservice.feign.QuizInnterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuizInnterface quizInnterface;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Integer> questions=quizInnterface.getQuestionsForQuiz(category,numQ).getBody();
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizDao.save(quiz);
//
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Quiz quiz=quizDao.findById(id).get();
        List<Integer> questionIds=quiz.getQuestionIds();

        ResponseEntity<List<QuestionWrapper>> questions= quizInnterface.getQuestionsFromId(questionIds);


        return questions;
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
         ResponseEntity<Integer> score= quizInnterface.getScore(responses);
        return score;
    }
}
