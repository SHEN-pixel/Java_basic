package UM.FOP.Lab2;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds");
        int sec = sc.nextInt();
        System.out.println("sec = " + sec);

        int hours = sec /3600;
        int minutes = (sec % 3600)/ 60;
        int second = sec%60;
        System.out.println(hours+ "hours"+ minutes + "minutes" + second + "second");
    }
}
