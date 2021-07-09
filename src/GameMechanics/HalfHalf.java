package GameMechanics;

import Exceptions.LifelineException;

import java.util.ArrayList;

public class HalfHalf extends LifelineStructure{

    private ArrayList<String> finalArray = new ArrayList<>();
    public HalfHalf(String answer1, String answer2, String answer3, String answer4, char correctAnswer) {
        super("", answer1, answer2, answer3, answer4, correctAnswer);
    }

    public void showFinal(){
        for(String i : finalArray){
            System.out.println(i);
        }
    }
    public ArrayList<String> halfHalf(){

        String ansList[]={super.answer1,super.answer2,super.answer3,super.answer4};
        int rand1=this.randomNumber(3);
        int rand2=this.randomNumber(3);

        while(ansList[rand1].charAt(0)==super.getCorrectAnswer() || rand1==rand2){
            rand1=this.randomNumber(3);
        }
        while(ansList[rand2].charAt(0)==super.getCorrectAnswer()){
            rand2=this.randomNumber(3);
            while(rand2==rand1){
                rand2=this.randomNumber(3);
            }
        }
        int i=0;
        while(i< ansList.length){
            if(i==rand1){
                i++;
                continue;
            }
            else if(i == rand2){
                i++;
                continue;
            }else{
                finalArray.add(ansList[i]);
                i++;
            }
        }
        return finalArray;
    }

    public void showHalfLifeline(){
        halfHalf();
        System.out.print("We remove 2 incorrect answers for you. Choose the correct answer from what left.");
        for (String i : finalArray) {
            System.out.print(" " + i + " ");
        }
        System.out.print(" ");
        System.out.print("\n");
    }
}
