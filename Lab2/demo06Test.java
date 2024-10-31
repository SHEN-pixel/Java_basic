package UM.FOP.Lab2;

import java.util.Scanner;

public class demo06Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 获取水的重量
        System.out.print("Enter the amount of water in gram: ");
        int M = sc.nextInt();

        // 获取初始和最终温度
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double t1F = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double t2F = sc.nextDouble();

        // 转换华氏度为摄氏度
        double t1C = (t1F - 32) / 1.8;
        double t2C = (t2F - 32) / 1.8;

        // 计算所需能量
        double Q = (M / 1000.0) * (t2C - t1C) * 4184;

        // 输出结果
        System.out.printf("The energy needed is ：%.6e ", Q);
    }



}
