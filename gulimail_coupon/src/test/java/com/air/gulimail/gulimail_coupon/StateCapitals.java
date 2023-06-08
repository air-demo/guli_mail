package com.air.gulimail.gulimail_coupon;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author air
 * @create 2023-03-29-12:11
 */
public class StateCapitals {
    public static void main(String[] args) {
        // 使用HashMap存储50个州及其首府的信息
        HashMap<String, String> stateCapitals = new HashMap<>();
        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Connecticut", "Hartford");
        stateCapitals.put("Colorado", "Denver");
        stateCapitals.put("Delaware", "Dover");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("Georgia", "Atlanta");
        stateCapitals.put("Hawaii", "Honolulu");
        stateCapitals.put("Idaho", "Boise");
        stateCapitals.put("Illinois", "Springfield");
        stateCapitals.put("Indiana", "Indianapolis");
        stateCapitals.put("Iowa", "Des Moines");
        stateCapitals.put("Kansas", "Topeka");
        stateCapitals.put("Kentucky", "Frankfort");
        stateCapitals.put("Louisiana", "Baton Rouge");
        stateCapitals.put("Maine", "Augusta");
        stateCapitals.put("Maryland", "Annapolis");
        stateCapitals.put("Massachusetts", "Boston");
        stateCapitals.put("Michigan", "Lansing");
        stateCapitals.put("Minnesota", "Saint Paul");
        stateCapitals.put("Mississippi", "Jackson");
        stateCapitals.put("Missouri", "Jefferson City");
        stateCapitals.put("Montana", "Helena");
        stateCapitals.put("Nebraska", "Lincoln");
        stateCapitals.put("Nevada", "Carson City");
        stateCapitals.put("New Hampshire", "Concord");
        stateCapitals.put("New Jersey", "Trenton");
        stateCapitals.put("New Mexico", "Santa Fe");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("North Carolina", "Raleigh");
        stateCapitals.put("North Dakota", "Bismarck");
        stateCapitals.put("Ohio", "Columbus");
        stateCapitals.put("Oklahoma", "Oklahoma City");
        stateCapitals.put("Oregon", "Salem");
        stateCapitals.put("Pennsylvania", "Harrisburg");
        stateCapitals.put("Rhode Island", "Providence");
        stateCapitals.put("South Carolina", "Columbia");
        stateCapitals.put("South Dakota", "Pierre");
        stateCapitals.put("Tennessee", "Nashville");
        stateCapitals.put("Texas", "Austin");
        stateCapitals.put("Utah", "Salt Lake City");
        stateCapitals.put("Vermont", "Montpelier");
        stateCapitals.put("Virginia", "Richmond");
        stateCapitals.put("Washington", "Olympia");
        stateCapitals.put("West Virginia", "Charleston");
        stateCapitals.put("Wisconsin", "Madison");
        stateCapitals.put("Wyoming", "Cheyenne");
        //...省略了其余47个州的信息

        // 显示HashMap的内容
        System.out.println("HashMap中的内容：");
        for (String state : stateCapitals.keySet()) {
            System.out.println(state + " - " + stateCapitals.get(state));
        }

        // 使用TreeMap对HashMap进行排序，并使用二叉搜索树进行存储
        TreeMap<String, String> sortedStateCapitals = new TreeMap<>(stateCapitals);

        // 提示用户输入一个州，然后显示该州的首府
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个州名：");
        String inputState = scanner.nextLine();
        if (sortedStateCapitals.containsKey(inputState)) {
            System.out.println(inputState + " 的首府是 " + sortedStateCapitals.get(inputState));
        } else {
            System.out.println("抱歉，找不到 " + inputState + " 对应的首府。");
        }

        // 关闭Scanner对象
        scanner.close();
    }
}
