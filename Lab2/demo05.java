package UM.FOP.Lab2;

import java.util.Random;

public class demo05 {
    public static void main(String[] args) {
        /*Write a program that generates one random number.  The range of the random
number is 0 to 10000. Display the number and the sum of all the digits in the number.*/
        Random rd = new Random();
        int i = rd.nextInt(10001);
        System.out.println("i = " + i);


        int sumOfDigits = 0;
        int temp = i;
        while (temp > 0) {
            sumOfDigits += temp % 10; //get the last digit
            temp /= 10; // Remove the last digit
        }

        System.out.println("Sum of Digits: " + sumOfDigits);
    }
}
