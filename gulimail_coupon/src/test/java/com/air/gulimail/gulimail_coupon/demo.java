package com.air.gulimail.gulimail_coupon;

import java.util.Scanner;

/**
 * @author air
 * @create 2023-03-29-13:05
 */
public class demo {
    public static void main(String[] args) {
        printProgrammingSpecs();
        System.out.print("\n输入第一个分数（-1 退出）： ");
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();


        int count = 0;
        double[] scores = new double[10];
        double total = 0;
        while (score != -1 && count < 10) {
            scores[count] = score;
            total += score;
            count++;
            if (count < 10) {
                System.out.print("\n输入下一个分数（-1 退出）： ");
                score = input.nextDouble();
            }
        }


        System.out.println("\n输入的所有分数：");
        for (int i = 0; i < count; i++) {
            System.out.println(scores[i]);
        }


        double average = total / count;
        System.out.printf("\n平均分是：%.2f\n", average);


        String letterGrade = "";
        if (average >= 90 && average <= 100) {
            letterGrade = "A";
        } else if (average >= 80 && average <= 89) {
            letterGrade = "B";
        } else if (average >= 70 && average <= 79) {
            letterGrade = "C";
        } else if (average >= 60 && average <= 69) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        System.out.println("字母等级为： " + letterGrade);
    }

    public static void printProgrammingSpecs() {
        System.out.println("该程序允许用户输入最多 10 个测验分数，计算平均分数，并显示字母等级。");
        System.out.println("使用键盘输入分数，程序使用决策逻辑根据以下评分等级分配字母等级：");
        System.out.println("A = 90-100");
        System.out.println("B = 80-89");
        System.out.println("C = 70-79");
        System.out.println("D = 60-69");
        System.out.println("F = 0-59");
    }
}
