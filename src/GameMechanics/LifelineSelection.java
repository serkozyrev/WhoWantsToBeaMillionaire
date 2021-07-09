package GameMechanics;
import Exceptions.LifelineException;
import GameMechanics.*;

public class LifelineSelection {
    private boolean halfSelected=false;
    private boolean audienceSelected=false;
    private boolean callSelected=false;
    public void selectLifeLine(String decision, String question, String answer1, String answer2, String answer3, String answer4, char correctAnswer){
        switch (decision) {
            case "50-50":
                if (halfSelected == true) {
                    System.out.println("Hint 50/50 was used before, select different hint");
                } else {
                    halfSelected = true;
                    HalfHalf half = new HalfHalf(answer1, answer2, answer3, answer4, correctAnswer);
                    half.showHalfLifeline();

                }
                break;
            case "Call Friend":
                if (callSelected == true) {
                    System.out.println("Hint Call Friend was used before, select different hint");
                } else {
                    callSelected = true;
                    CallFriend call = new CallFriend(question, answer1, answer2, answer3, answer4, correctAnswer);

                    call.showFriendAnswer();

                }
                break;
            case "Ask Audience":
                if (audienceSelected == true) {
                    System.out.println("Hint Ask Audience was used before, select different hint");
                } else {
                    audienceSelected = true;
                    AskAudience ask = new AskAudience(answer1, answer2, answer3, answer4, correctAnswer);
                    ask.showAudienceAnswer();

                }
                break;
        }
    }

    public boolean isHalfSelected() {
        return halfSelected;
    }
}
