package UM.FOP.Lab1;

import java.util.Random;

public class L1Q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(101);
        System.out.println("number = " + number);
        if(number > 50){
            System.out.println("The number is larger than 50");
        }
        else System.out.println("The number is less than 50");
    }
}
