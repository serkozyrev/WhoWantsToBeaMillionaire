import Exceptions.LifelineException;
import GameMechanics.*;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args){
        int menuChoice;
        int difficulty;

        String decision;
        ArrayList<Questions> questionsList = new ArrayList<Questions>();
        Level l = new Level();
        LifelineSelection select = new LifelineSelection();
        questionsList.add(new Questions("Who used Tanos's glove in Avengers Endgame?", "A. Iron Man", "B. Hulk", "C. Black Widow", "D. Hawk Eye", 'A'));
        questionsList.add(new Questions("Choose 1 out of four heroes who can't be resurrected?", "A.Spider-Man", "B. Doctor Strange", "C. Black Panter", "D. Black Widow" , 'D'));
        questionsList.add(new Questions("Which Avenger got independent show?", "A. Captain Marvel", "B. Captain America", "C. Winter Soldier", "D. AntMan", 'C'));
        questionsList.add(new Questions("What actor was replaced by Mark Ruffalo?", "A. Edward Norton", "B. Bill Bixby", "C. Lou Ferrigno", "D. Eric Bana", 'A'));
        questionsList.add(new Questions("What specialty Doctor Strange had before?", "A. Neurosurgery", "B. Family Medicine", "C. Orthopaedics", "D. Dermatology", 'A'));
        questionsList.add(new Questions("What material is used for Captain America's Shield?", "A. Titanium", "B. Vibranium", "C. Aluminium", "D. Quartz", 'B'));
        questionsList.add(new Questions("Which MCU star played iconic detective from books first?", "A. Robert Downey Jr.", "B. Benedict Cumberbatch", "C. Chris Evans", "D. Tom Hiddleston", 'B'));
        questionsList.add(new Questions("What was the name of the project to create a super soldier?", "A. Resurrection", "B. Reincarnation", "C. Rebirth", "D. Reactivation", 'C'));
        questionsList.add(new Questions("What stone Red Skull hold on Vormir?", "A. Space", "B. Reality", "C. Power", "D. Soul", 'D'));
        questionsList.add(new Questions("Who helped Eitri to create Thor's Axe", "A. Rocket", "B. Groot", "C. Eitri", "D. Nidavellir", 'B'));
        questionsList.add(new Questions("What Tony Stark used in Avengers: Endgame to make Time Travel possible?", "A.Quantum Realm", "B. Scott's suit", "C.Mobius Strip", "D. Hank Pym's project", 'C'));
        questionsList.add(new Questions("What happened to Janet Van Dyne?", "A. Dead from car accident", "B. Trapped in Quantum Real", "C. Missing", "D. Divorced with Hank Pym", 'B'));
        questionsList.add(new Questions("Who watched the scientists work on Tessearct from afar?", "A. Iron Man", "B. Black Widow", "C. Director Fury", "D. Hawk Eye", 'D'));
        questionsList.add(new Questions("Who almost lifted Mjolnir on Stark's party?", "A. Stark and Rhodey", "B. Captain America", "C.Hulk", "D. Hawk Eye", 'B'));
        questionsList.add(new Questions("How many movies in the Marvel Universe at this moment?", "A. 23", "B 17", "C. 20", "D. 14", 'A'));
        questionsList.add(new Questions("What name Natasha used when she meets Tony for the first time?", "A. Natalie Rushman", "B. Natalia Romanoff", "C. Nicole Rohan", "D. Naya Rabe", 'A'));
        questionsList.add(new Questions("Who is Thanos's father", "A. Ziran the Tester", "B. Zuras", "C. A'Lars", "D. Valkin",'C'));
        questionsList.add(new Questions("Who created the Infinity Stones?", "A. Six singularities", "B. Roy Thomas", "C. The Celestials", "D. The Eternals",'A'));
        questionsList.add(new Questions("Which Realm has not appeared in a Thor film?", "A. Midgard", "B. Nidavellir", "C. Alfheim", "D. Muspelheim",'C'));
        questionsList.add(new Questions("Where does Dormammu reside?", "A. The Quantum Realm", "B. The Dark Dimension", "C. The Astral Plane", "D. The Mirror Dimension",'B'));
        questionsList.add(new Questions("Where do Sif and Volstagg hide the Reality Stone?", "A. Vormir", "B. A vault on Asgard", "C. Inside Sif's sword", "D. Gave to the Collector",'D'));
        questionsList.add(new Questions("Who are not on Iron Man's side in Civil War?", "A. Vision", "B. Hawkeye", "C. Black Panter", "D. Black Widow",'B'));
        questionsList.add(new Questions("When Spider-Man first appear in MCU?", "A. Captain America: First Soldier", "B. Avengers: Age of Ultron", "C. Captain Amerika: Civil War", "D. Thor", 'C'));
        questionsList.add(new Questions("Who rescued Tony and Nebula from space?", "A. Rocket", "B. Thor", "C. Silver Surfer", "D. Captain Marvel", 'D'));
        questionsList.add(new Questions("Pepper Potts is allergic to what?", "A. Strawberry", "B. Pineapple", "C. Blueberry", "D. Raspberry", 'A'));
        questionsList.add(new Questions("How many children Hawkeye has?", "A. 1", "B. 2", "C. 3", "D. 4", 'C'));
        questionsList.add(new Questions("Who scratched Nick Fury's eye?", "A. Dark Elfs", "B. Light Elfs", "C. Skrulls", "D. Flerkens", 'D'));
        questionsList.add(new Questions("Which Celestial appears in Guardian of the Galaxy 2?", "A. Eson the Searcher", "B. Ego", "C. Knowhere", "D. Arishem", 'B'));
        questionsList.add(new Questions("Who is the firstborn child of Odin?", "A. Hela", "B. Thor", "C. Loki", "D. Sif", 'A'));
        questionsList.add(new Questions("What name Tony invented to replace Jarvis?", "A. Tuesday", "B.Wednesday", "C. Thursday", "D. Friday", 'D'));

        boolean flag = true;

        while(flag) {
            boolean exit = false;
            menu();
            l.levelReset();
            int finalAmount=0;
            int i = 0;
            Scanner input = new Scanner(System.in);
            String name;

            menuChoice=input.nextInt();
            switch (menuChoice){
                case 1:
                    input.nextLine();
                    System.out.println("Please enter your name: ");
                    name = input.nextLine();
                    System.out.println(name + " Please select your difficulty option");
                    System.out.println("1.Easy");
                    System.out.println("2.Hard");
                    difficulty=input.nextInt();

                    if(difficulty==1){
                        int levels[]=l.showLevels(difficulty);
                        System.out.println("Because you chose Easy difficulty, you will have only 9 levels out of 15 to get a million dollars");
                        l.getEasyLevels();
                        System.out.println("\n");
                        Collections.shuffle(questionsList);
                        LifelineStructure lifeLine = new LifelineStructure();
                        lifeLine.newArrayAvailableLife();
                        String changedArray;
                        while(!exit) {
                            try {
                                lifeLine.showAvailableLife();
                            }catch(LifelineException e){
                                System.out.printf(e.getMessage());
                            }
                            i=l.getLevel();
                            String finalDecision;
                            char ansCorrect;
                            String walkaway;

                            int level=l.easyValue(i);
                            System.out.println("\n__________________________________________________");
                            System.out.println("Question " + (i + 1) + " with the value of $" + levels[i]);
                            l.levelInc();
                            do {
                                System.out.print("\n");
                                System.out.println(questionsList.get(i).getQuestion());
                                    System.out.println(questionsList.get(i).getAnswers());
                                System.out.println("Please enter the correct answer");
                                ansCorrect = input.next().charAt(0);
                                if(Character.isLowerCase(ansCorrect)){
                                    ansCorrect=Character.toUpperCase(ansCorrect);
                                }
                                System.out.print("\n");
                                System.out.println("Is it your final decision? yes/no");
                                System.out.println("You can also use lifelines to help you with choosing correct answer. Type 'help' to see what lifelines available.");
                                input.nextLine();

                                finalDecision = input.nextLine();
                                try {

                                    if (finalDecision.equals("yes") || finalDecision.equals("no")) {
                                        continue;
                                    } else if (finalDecision.equals("help")) {
                                        try {
                                            lifeLine.showAvailableLife();
                                        } catch (LifelineException e) {
                                            System.out.printf(e.getMessage());
                                        }
                                        if (lifeLine.lifeLineSize() == 0) {
                                            System.out.println("\nType 'exit' to enter your answer.");
                                        } else {
                                            System.out.println("\nType which lifeline you want to use or 'exit' to enter your answer.");

                                        }
                                        finalDecision = input.nextLine();
                                        if (finalDecision.equals("exit")) {
                                            continue;
                                        } else {
                                            select.selectLifeLine(finalDecision, questionsList.get(i).getQuestion(), questionsList.get(i).getAnswer1(), questionsList.get(i).getAnswer2(), questionsList.get(i).getAnswer3(), questionsList.get(i).getAnswer4(), questionsList.get(i).getCorrectAnswer());
                                            lifeLine.decreaseLifeLine(finalDecision);
                                        }
                                    }else{
                                        throw new Exception("Please enter 'yes', 'no' or 'help' to know your available lifelines");
                                    }
                                }catch(Exception e){
                                    System.out.println("Error: " + e.getMessage());
                                }

                            } while (!finalDecision.equals("yes"));

                            if ((finalDecision.equals("yes")) && (ansCorrect == questionsList.get(i).getCorrectAnswer())) {
                                System.out.println("\nYou are right it is a correct answer!!!");
                                finalAmount = levels[i];
                                System.out.println("Your final balance after completing this question is $" + finalAmount + "\n");
                                if (level == 500) {
                                    System.out.println(name + ", Do you want to walk away with " + finalAmount + "?");

                                    walkaway = input.nextLine();
                                    exit=l.walkAway(walkaway, exit, finalAmount);
                                }else if (level == 32000) {
                                    System.out.println(name + ", Do you want to walk away with " + finalAmount + "?");
                                    System.out.println("After this round you will not be able to save any money.");
                                    walkaway = input.nextLine();
                                    exit=l.walkAway(walkaway, exit, finalAmount);
                                }else if(level==1000000){
                                    System.out.println("CONGRATULATIONS!!! " + name + " You finished the game and became a MILLIONAIRE. If you want to play again, choose start the game ");
                                    System.out.println("and select harder difficulty or exit the game\n");
                                    exit=exit(exit);
                                }else{
                                    continue;
                                }
                            } else{
                                System.out.println("Sorry you answer was wrong. You couldn't secure any amount of money. Thank you for playing Who Wants to be a Millionaire!\n");
                                exit=true;
                            }
                            questionsList.remove(i);
                        }
                    }else if(difficulty==2){
                        int levels[]=l.showLevels(difficulty);
                        System.out.println("You chose Hard difficulty where you will have 15 questions to get a million dollars");
                        l.getHardLevels();
                        System.out.println("\n");
                        Collections.shuffle(questionsList);
                        LifelineStructure lifeLine = new LifelineStructure();
                        lifeLine.newArrayAvailableLife();

                        while(!exit) {
                            try {
                                lifeLine.showAvailableLife();
                            }catch(LifelineException e){
                                System.out.printf("Error: " + e.getMessage());
                            }
                            i=l.getLevel();

                            String finalDecision;
                            char ansCorrect;
                            String walkaway;
                            int level=l.hardValue(i);

                            System.out.println("\n__________________________________________________");
                            System.out.println("Question " + (i + 1) + " with the value of $" + levels[i]);
                            l.levelInc();
                            do {
                                System.out.print("\n");
                                System.out.println(questionsList.get(i).getQuestion());
                                System.out.println(questionsList.get(i).getAnswers());


                                System.out.println("Please enter the correct answer");

                                ansCorrect = input.next().charAt(0);
                                if(Character.isLowerCase(ansCorrect)){
                                    ansCorrect=Character.toUpperCase(ansCorrect);
                                }
                                System.out.println("\nIs it your final decision? 'yes'/'no'");

                                input.nextLine();
                                if(level <= 1000) {
                                    System.out.println("You will not be able to use lifelines until after your first walkway at $1000");
                                    finalDecision = input.nextLine();

                                    try {
                                        if (finalDecision.equals("yes") || finalDecision.equals("no")) {
                                            continue;
                                        } else {
                                            throw new Exception("Please enter 'yes' or 'no'.");
                                        }
                                    }catch(Exception e){
                                        System.out.printf("Error: " + e.getMessage());
                                    }
                                }else {
                                    System.out.println("If you have any difficulties with answering the question you are able to use now your lifelines by typing help");
                                    finalDecision = input.nextLine();
                                    if (finalDecision.equals("yes") || finalDecision.equals("no")) {
                                        continue;
                                    }else if (finalDecision.equals("help")) {
                                        try {
                                            lifeLine.showAvailableLife();
                                        }catch(LifelineException e){
                                            System.out.printf("Error: " + e.getMessage());
                                        }
                                        if(lifeLine.lifeLineSize()==0){
                                            System.out.println("Type 'exit' to enter your answer.");
                                        }else {
                                            System.out.println("\nType which lifeline you want to use or 'exit' to enter your answer.");

                                        }
                                        finalDecision = input.nextLine();
                                        if (finalDecision.equals("exit")) {
                                            continue;
                                        } else {
                                            select.selectLifeLine(finalDecision, questionsList.get(i).getQuestion(), questionsList.get(i).getAnswer1(), questionsList.get(i).getAnswer2(), questionsList.get(i).getAnswer3(), questionsList.get(i).getAnswer4(), questionsList.get(i).getCorrectAnswer());
                                            lifeLine.decreaseLifeLine(finalDecision);
                                        }

                                    }else{
                                        System.out.println("Please enter 'yes', 'no' or 'help' to know your available lifelines");
                                    }
                                }
                            } while (!finalDecision.equals("yes"));

                            if ((finalDecision.equals("yes")) && (ansCorrect == questionsList.get(i).getCorrectAnswer())) {
                                System.out.println("\nYou are right it is a correct answer!!!");
                                finalAmount = levels[i];
                                System.out.println("Your final balance after completing this question is $" + finalAmount+"\n");
                                if (level == 1000) {
                                    System.out.println(name + ", Do you want to walk away with " + finalAmount + "?");
                                    walkaway = input.nextLine();
                                    exit=l.walkAway(walkaway, exit, finalAmount);
                                }else if (level == 32000) {
                                    System.out.println(name + ", Do you want to walk away with " + finalAmount + "?");
                                    System.out.println("After this round you will not be able to save any money.");
                                    walkaway = input.nextLine();
                                    exit=l.walkAway(walkaway, exit, finalAmount);
                                }else if(level==1000000){
                                    System.out.println("CONGRATULATIONS!!!" + name + "You finished the game and became a MILLIONAIRE. If you want to play again, choose start the game ");
                                    System.out.println("and select harder difficulty or exit the game\n");
                                    exit=exit(exit);
                                }else{
                                    continue;
                                }
                            } else{
                                System.out.println("Sorry you answer was wrong. You couldn't secure any amount of money. Thank you for playing Who Wants to be a Millionaire!\n");
                                exit=exit(exit);
                            }
                            questionsList.remove(i);
                        }
                    }else{
                        System.out.println("Please enter the correct difficulty from the list provided!");
                    }
                    break;
                case 2:
                    instructions();
                    System.out.println("If you want to go back to the main menu, type 'menu' now or 'exit' to exit the game");
                    input.nextLine();
                    while(!exit) {
                        try {

                            decision = input.nextLine();
                            if (decision.equals("menu")) {
                                exit=exit(exit);
                            } else if (decision.equals("exit")) {
                                System.out.println("Thank you for playing our game.");
                                flag = false;
                                exit=exit(exit);
                            }else{
                                throw new Exception("type 'menu' or 'exit'");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Are you sure you want to exit the game? yes/no");
                    input.nextLine();
                    while(!exit){
                        try {

                            decision = input.nextLine();
                            if (decision.equals("yes")) {
                                System.out.println("Thank you for playing our game.");
                                flag = false;
                                exit=exit(exit);
                            } else if (decision.equals("no")) {
                                exit=exit(exit);
                            } else {
                                throw new Exception("type yes or no");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
            }
        }
    }

    public static void menu(){
        System.out.println("Welcome to the game Who Wants to be a Millionaire Avengers Edition");
        System.out.println("Select one of the 3 options");
        System.out.println("1. Start the game");
        System.out.println("2. View the rules of the game");
        System.out.println("3. Exit the game");
    }
    public static void instructions(){
        System.out.println("Welcome to the game Who Wants to be a Millionaire. Here is the rules that can be helpful to this game.");
        System.out.println("At the beginning of the game you will be asked for your name and what difficulty of the game you would like to play so we could give you the reasonable amount of " +
                "questions and reward for each question.");
        System.out.println("You will be provided with a screen where you will see " +
                "a question and four(4) answers. You need to select the correct one.");
        System.out.println("You have 3 rounds with 3 questions in each round for Easy difficulty " +
                "and 5 questions in each round for Hard difficulty. Each correct answer brings you closer to a MILLION DOLLARS.");
        System.out.println("At the end of each round you will be asked " +
                "if you want to take the reward you collected through out the game or continue.");
        System.out.println("Also, you have 3 lifelines that can be used once and help you during your game. Based on your difficulty these tips will be available " +
                "at different time.");
        System.out.println("If you chose Easy difficulty, your lifelines will be available in round 1, but if you chose Hard, your lifelines will be available " +
                " in the second part of the game.");
        System.out.println("First lifeline is 50-50 or elimination of 2 incorrect answers. Second lifeline is Ask the Audience where you will be provided with " +
                "audience's decision on correct answer in percentage, but you never know if this answer is correct.");
        System.out.println("The last lifeline gives you an ability to Call a Friend where our program randomly choose " +
                "the answer and show it to you.");
        System.out.println("Enjoy your game and try to make some fun!");
        System.out.print("\n");
    }
    public static boolean exit(boolean exit){
        return exit=!exit;
    }
}

