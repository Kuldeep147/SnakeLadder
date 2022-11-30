package com.bzl.snake;
import java.util.Random;

public class SnakeLadderUC7 {
    public static int position = 0;
    public static int positionOne = 0;
    public  static int dice;
    public static int nLS;
    public static void main(String[] args) {
        Random r = new Random();
        int dPlayed = 0;
        int dicePlayed = 0;
        while(position < 100 && positionOne < 100) {
            dice = (r.nextInt(6) + 1);
            nLS = r.nextInt(3);
            dPlayed++;
            dicePlayed++;
            switch (nLS) {
                case 1:
                    if(dPlayed%2 == 1) {
                        position += 0;
                    }else if(dPlayed%2 == 0){
                        positionOne += 0;
                    }
                    break;
                case 2:
                    if (dPlayed%2 == 1) {
                        if (position < 0) {
                            position = 0;
                        }
                        if ((position + dice) <= 100) {
                            position += dice;
                            dPlayed++;
                        }
                    }else if (dPlayed%2 == 0) {
                        if (positionOne < 0) {
                            positionOne = 0;
                        }
                        if ((positionOne + dice) <= 100) {
                            positionOne += dice;
                            dPlayed++;
                        }
                    }
                    break;
                case 0:
                    if (dPlayed%2 == 1) {
                        position -= dice;
                    }else if (dPlayed%2 == 0){
                        positionOne -= dice;
                    }
                    break;
            }
        }
        System.out.println("position player 2 : "+position);
        System.out.println("position player 1 : "+positionOne);
        System.out.println("Dice played : "+dicePlayed);
        System.out.println("Dice played if ladder then plays again : "+dPlayed);
        if (positionOne == 100){
            System.out.println("Player 1 is Winner");
        }else if (position == 100) {
            System.out.println("Player 2 is Winner ");
        }
    }
}