package com.bzl.snake;
import java.util.Random;

public class SnakeLadderUC2 {
   public static int position = 0;
    public  static int dice;

    public static void main(String[] args) {
        Random r = new Random();
        dice = (r.nextInt(6) + 1);
        position += dice;
        System.out.println("position : "+position);
    }
}