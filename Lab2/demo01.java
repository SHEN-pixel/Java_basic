package UM.FOP.Lab2;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
       // Celsius = (Fahrenheit – 32) / 1.8
        Scanner s1 = new Scanner(System.in);
        double Fah,Cel;
        System.out.print("Fah= ");
        Fah = s1.nextFloat();


         Cel = ((Fah - 32) *9) / 5;

        System.out.printf("Cel= "+"%.2f",Cel);//保留两位小数



    }
}
