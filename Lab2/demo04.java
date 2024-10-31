package UM.FOP.Lab2;

import java.io.PrintStream;
import java.util.Random;

public class demo04 {
    /*Write a program that generates three random numbers.
     The range of the random number is 10 to 50.
     Display the three numbers, sum of the numbers and the average in two decimal places.*/

    public static void main(String[] args) {
        Random n1 = new Random();
        Random n2 = new Random();
        Random n3 = new Random();



        double i1 = n1.nextDouble() + 10;
        double i2 = n2.nextDouble() + 10;
        double i3 = n3.nextDouble() + 10;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

        double sum = i1 + i2 + i3;
        System.out.println("sum = " + sum);

        double average = (i1 + i2 + i3) / 3;
        System.out.printf("average="+"%.2f ",average);


    }
}
