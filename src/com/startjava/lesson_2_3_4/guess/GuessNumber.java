package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {

    private Player[] players;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void play() {
        System.out.println("У каждого игрока по " + players[0].getMaxCountAttempts() + " попыток");
        for (Player player : players) {
            player.resetAttempts();
        }
        Player activePlayer = players[0];
        int hiddenNumber = getHiddenNumber();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            if (!activePlayer.isAttempts()) {
                System.out.println("У " + activePlayer +  " закончились попытки");
                break;
            }
            System.out.print("Игрок " + activePlayer + " вводит число: ");
            while (!activePlayer.addNumber(scanner.nextInt())) {
                System.out.println("Число должно быть в интервале (0,100]");
            }
            if (activePlayer.getNumberLastAttempt() == hiddenNumber) {
                System.out.println("Игрок " + activePlayer + " угадал число " + hiddenNumber + 
                                " с " + activePlayer.getAttempt() + " попытки");
                break;
            }
            if (activePlayer.getNumberLastAttempt() < hiddenNumber) {
                System.out.println("Число " + activePlayer.getNumberLastAttempt() +
                        " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + activePlayer.getNumberLastAttempt() +
                        " больше того, что загадал компьютер");
            }
            activePlayer = selectPlayer(activePlayer);
        }
        outNumbersPlayers();
    }

    public int getHiddenNumber() {
        return (int) (Math.random() * 100.0f) + 1;
    }

    private Player selectPlayer(Player activePlayer) {
        int countPlayers = players.length;
        for (int i = 0; i < countPlayers; i++) {
            if (activePlayer == players[i]) {
                return (i == countPlayers - 1) ? players[0] : players[i + 1];
            }
        }
        return players[0];
    }

    private void outNumbersPlayers() {
        for (Player player : players) {
            System.out.println("Числа игрока " + player + ": ");
            for (int number : player.getNumbers()) {
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
}