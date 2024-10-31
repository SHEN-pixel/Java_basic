package UM.FOP.Lab2;


import java.util.Scanner;

/*Write a program to calculate the monthly payment for car loan.
 The following are the inputs of the program.
 Output the monthly payment in two decimal places. */
public class demo02 {
    public static void main(String[] args) {

        //M = (P – D) * (1 + R*Y/100) / (Y *12)


        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the price of the car:  ");
        double price = sc.nextDouble();


        System.out.print("Please enter the downPayment of the car:  ");
        double downPayment = sc.nextDouble();

        System.out.print("Please enter the interestRate:  ");
        double interestRate = sc.nextDouble();

        System.out.print("Please enter the loan duration in year：");
        int loanDurationYears = sc.nextInt();

        double monthlyPayment = (price - downPayment) * (1 + (interestRate * loanDurationYears / 100)) / (loanDurationYears * 12);
        System.out.println("Monthly Payment=" + monthlyPayment);


    }
}
