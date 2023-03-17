package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int hiddenNumber = (int) (Math.random() * 100 + 1);
        Player activePlayer = player1;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Игрок " + activePlayer + " вводит число: ");
            while (!activePlayer.setNumber(scanner.nextInt())) {
                System.out.println("Число должно быть в интервале (0,100]");
            }
            if (activePlayer.getNumber() == hiddenNumber) {
                System.out.println("Победил игрок " + activePlayer);
                break;
            }
            if (activePlayer.getNumber() < hiddenNumber) {
                System.out.println("Число " + activePlayer.getNumber() + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + activePlayer.getNumber() + " больше того, что загадал компьютер");
            }
            activePlayer = selectPlayer(activePlayer);
        }
    }

    private Player selectPlayer(Player activePlayer) {
        return (activePlayer == player1) ? player2 : player1;
    }
}