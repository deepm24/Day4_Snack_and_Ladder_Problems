package org.example;

import java.util.Random;
public class SnackLadder {
    public static void main(String[] args)
    {
        System.out.println("** WELCOME TO SNACK AND LADDER GAME **");
        int playerPosition=0;
        System.out.println("player start position :"+playerPosition);
        int randomCh=(int)Math.floor(Math.random()*10)%6+1;
        System.out.println("player rolls the die and get a number :"+randomCh);
    }
}