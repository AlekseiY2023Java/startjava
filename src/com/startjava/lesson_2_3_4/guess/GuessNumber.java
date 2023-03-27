package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

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
        int hiddenNumber = generateHiddenNumber();
        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;

        while(gameOn) {
            for (Player player : players) {
                if (!player.hasAttempts()) {
                    System.out.println("У " + player +  " закончились попытки");
                    gameOn = false;
                    break;
                }
                System.out.print("Игрок " + player + " вводит число: ");
                while (!player.addNumber(scanner.nextInt())) {
                    System.out.println("Число должно быть в интервале (0,100]");
                }
                if (player.getLastNumber() == hiddenNumber) {
                    System.out.println("Игрок " + player + " угадал число " + hiddenNumber +
                                    " с " + player.getAttempt() + " попытки");
                    gameOn = false;
                    break;
                }
                if (player.getLastNumber() < hiddenNumber) {
                    System.out.println("Число " + player.getLastNumber() +
                            " меньше того, что загадал компьютер");
                } else {
                    System.out.println("Число " + player.getLastNumber() +
                            " больше того, что загадал компьютер");
                }
            }
        }
        outNumbersPlayers();
    }

    public int generateHiddenNumber() {
        return (int) (Math.random() * 100.0f) + 1;
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