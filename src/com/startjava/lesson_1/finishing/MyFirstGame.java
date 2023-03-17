package com.startjava.lesson_1.finishing;

public class MyFirstGame {   
    public static void main(String[] args) {
        int hiddenNum = 55;
        int playerNum = 50;
        while (playerNum != hiddenNum) {
            if (playerNum > hiddenNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
                playerNum--;
            } else {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
                playerNum++;
            }
        }
        System.out.println("Вы победили! Число " + playerNum);
    }
}