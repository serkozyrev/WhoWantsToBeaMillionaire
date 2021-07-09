package GameMechanics;

import java.util.ArrayList;


public class Questions {
    private String question, answer1, answer2, answer3, answer4;
    private char correctAnswer;
    private ArrayList<String> questionsList = new ArrayList<>();

    public Questions() {
    }

    public Questions(String question, String answer1, String answer2, String answer3, String answer4, char correctAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;

    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswer(char correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getAnswers() {
        return answer1 +" "+ answer2 +" "+ answer3 +" "+ answer4;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
}
