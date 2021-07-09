package GameMechanics;

import Exceptions.LifelineException;

import java.util.ArrayList;

public class AskAudience extends LifelineStructure{
    private ArrayList<Integer> percentageList = new ArrayList<>();
    public AskAudience(String answer1, String answer2, String answer3, String answer4, char correctAnswer) {
        super("", answer1, answer2, answer3, answer4, correctAnswer);
    }
    public ArrayList<Integer> askAudience(){
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int i = 0;
        for(int j = 0; j < 100; j++){
            int percent=randomNumber(4);
            if(percent==0){
                count1++;
            }
            if(percent==1){
                count2++;
            }
            if(percent==2){
                count3++;
            }
            if(percent==3){
                count4++;
            }
        }
        percentageList.add(count1);
        percentageList.add(count2);
        percentageList.add(count3);
        percentageList.add(count4);
        return percentageList;
    }

    public void showAudienceAnswer(){
        System.out.println("We waited couple minutes for our audience to let them decide by using their remote controllers under each sit.");
        System.out.println("Right now we will see in percentage what they think is the correct answer on the current question");
        askAudience();
        for (int i = 0; i < percentageList.size(); i++) {
            System.out.println(percentageList.get(i) + "% chose " + (i+1) + " answer");
        }
    }
}
