package GameMechanics;

import Exceptions.LifelineException;

import java.util.ArrayList;

public class LifelineStructure {
    protected String answer1, answer2, answer3, answer4, question;
    protected char correctAnswer;

    private String[] lifeLine = {"50-50","Ask Audience","Call Friend"};
    private ArrayList<String> availableLife = new ArrayList<>();
    protected ArrayList<String> finalArray = new ArrayList<>();

    public LifelineStructure() {

    }

    public LifelineStructure(String question, String answer1, String answer2, String answer3, String answer4, char correctAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }
    public int randomNumber(int max){
        return (int)(Math.random()* max);
    }



    public void decreaseLifeLine(String decision) {

        availableLife.remove(decision);
    }
    public void newArrayAvailableLife(){//selecting original or custom array of available lifelines

        int i =0;
        while(i < lifeLine.length){
            availableLife.add(lifeLine[i]);
            i++;
        }

    }
    public void showAvailableLife() throws LifelineException{
        if(availableLife.size()==0){
            throw new LifelineException("You already used all your hints");
        }else {
            System.out.println("Here is available lifelines that you can use in your game.");
            System.out.print("\n");
            for (String j : availableLife) {
                System.out.print(j + " / ");
            }
        }
    }



    public int lifeLineSize(){
        return availableLife.size();
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

    public char getCorrectAnswer() {
        return correctAnswer;
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

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswer(char correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}

