package com.air.gulimail.gulimail_coupon;


import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        String[][] stateCapitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "Saint Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };

        // 显示当前的数组内容
        System.out.println("当前数组内容：");
        for (String[] stateCapital : stateCapitals) {
            System.out.println(stateCapital[0] + " - " + stateCapital[1]);
        }

        // 冒泡排序按大写对内容进行排序
        for (int i = 0; i < stateCapitals.length - 1; i++) {
            for (int j = 0; j < stateCapitals.length - i - 1; j++) {
                if (stateCapitals[j][0].compareToIgnoreCase(stateCapitals[j + 1][0]) > 0) {
                    String[] temp = stateCapitals[j];
                    stateCapitals[j] = stateCapitals[j + 1];
                    stateCapitals[j + 1] = temp;
                }
            }
        }
        // 提示用户输入所有州首府的答案，并检查答案是否正确
        Scanner scanner = new Scanner(System.in);
        int numCorrect = 0;
        for (String[] stateCapital : stateCapitals) {
            System.out.print("请问 " + stateCapital[0] + " 的首府是哪里？");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase(stateCapital[1])) {
                System.out.println("答案正确！");
                numCorrect++;
            } else {
                System.out.println("很遗憾，答案错误。正确答案是 " + stateCapital[1] + "。");
            }
        }

        // 显示正确的总数
        System.out.println("\n您总共回答了 " + stateCapitals.length + " 个问题。");
        System.out.println("您回答正确的问题数为 " + numCorrect + "，正确率为 " + ((double) numCorrect / stateCapitals.length * 100) + "%。");

        // 关闭Scanner对象
        scanner.close();
    }
}

