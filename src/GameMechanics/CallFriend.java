package GameMechanics;

import Exceptions.LifelineException;

public class CallFriend extends LifelineStructure{
    private String friendAnswer;

    public CallFriend(String question, String answer1, String answer2, String answer3, String answer4, char correctAnswer) {
        super(question, answer1, answer2, answer3, answer4, correctAnswer);
    }

    public void showFriendAnswer() {
            System.out.println("Hello, Carl. We are calling to from the show Who Wants to be a Millionaire.");
            System.out.println("Today we have here your friend and you need to answer on the question");
            System.out.println(question);
            callFriend();
            System.out.println("\nI think the correct answer will be =======>" + friendAnswer);
            System.out.println("Thank you, Carl. Let's see if you helped your friend on the way to 1 million dollars");
    }

    public String callFriend() {
        String[] ansList={answer1,answer2, answer3, answer4};
        for(String i : ansList){
            System.out.print(i + " ");
        }
        int index=randomNumber(3);
        friendAnswer=ansList[index];
        return friendAnswer;
    }
}
