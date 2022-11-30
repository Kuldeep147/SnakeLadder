package com.bzl.snake;
import java.util.Random;

public class SnakeLadderUC5 {
    public static int position = 0;
    public  static int dice;
    public static int nLS;

    public static void main(String[] args) {
        Random r = new Random();
        while(position < 100) {
            dice = (r.nextInt(6) + 1);
            nLS = r.nextInt(3);
            switch (nLS) {
                case 1:
                    position += 0;
                    break;
                case 2:
                    if (position < 0) {
                        position = 0;
                    }
                    if ((position + dice) <= 100) {
                        position += dice;
                    }
                    break;
                case 0:
                    position -= dice;
                    break;
            }
        }
        System.out.println("position : "+position);
    }
}