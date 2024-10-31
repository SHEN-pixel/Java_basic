package UM.FOP.Lab1;

import java.util.Random;

public class L1exercise {
    public static void main(String[] args) {
        int age = 33;
        int female = 1;
        int Monday = 1;
        int Tuesday = 2;
        int wednesday = 3;
        int Thursday = 4;
        int Friday = 5;
        int Saturday = 6;
        int Sunday = 7;
        if (age >= 30 && Tuesday == 2 && female == 1){
            System.out.println("she cannot get the discount");
        }
        else System.out.println("you are not");




        String s1,s2;
        s1 = "hello";
        s2 = "Hello";
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("They are the same");
        }
        else System.out.println("They are different");



        int number = 1;
        switch (number){
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            default:
                System.out.println("The program only accepts number from 1 to 3");
        }


        Random p1 = new Random();
        Random p2 = new Random();
        int max = 7;
        int i1 = p1.nextInt(max);
        int i2 = p2.nextInt(max);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        if (i1>i2){
            System.out.println("play one wins");
        } else if (i1<i2) {
            System.out.println("play two wins");

        }else System.out.println("tie");


    }
}
