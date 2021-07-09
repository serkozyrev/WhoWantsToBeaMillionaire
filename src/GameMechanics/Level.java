package GameMechanics;

import java.util.Scanner;

public class Level{
    private int[] easyLevels ={100, 500, 1000, 8000, 16000, 32000, 125000, 500000, 1000000};
    private int[] hardLevels ={100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 250000, 500000, 1000000};
    private int level=0;

    public Level() {
    }

    public void getEasyLevels() {
        for(int i : easyLevels){
            System.out.print( "$" + i + " ");
        }
    }

    public void getHardLevels() {
        for(int i : hardLevels){
            System.out.print( "$" + i + " ");
        }
    }

    public int[] showLevels(int difficulty){

        if (difficulty == 1) {
            return easyLevels;
        }else{
            return hardLevels;
        }
    }
    public int easyValue(int level){
        return easyLevels[level];
    }

    public int hardValue(int level){
        return hardLevels[level];
    }

    public int levelInc(){
        return level++;
    }

    public int levelReset(){ return level = 0;}

    public int getLevel() {
        return level;
    }

    public boolean walkAway(String decision, boolean exit, int amount){

        if (decision.equals("yes")) {
            System.out.println("Thank you for playing our game!");
            System.out.println("Your final amount is $" + amount);
            System.out.println("\n");
            return true;
        }else{
            return false;
        }
    }
}

