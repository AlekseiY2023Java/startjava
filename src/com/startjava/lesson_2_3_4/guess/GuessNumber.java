package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private int countRounds;
    private Player[] players;

    public GuessNumber(int countRounds, Player... players) {
        this.countRounds = countRounds;
        this.players = players;
    }

    public void play() {
        for (Player player : players) {
            player.resetScores();
        }
        shufflePlayers();

        System.out.println("У каждого игрока по " + players[0].getMaxCountAttempts() + " попыток");
        for (int i = 0; i < countRounds; i++) {
            System.out.println("\nРаунд " + (i + 1));
            playRound();
        }
        outWinner();
    }

    private void shufflePlayers() {
        int countPlayers = players.length;
        for (int i = 0; i < countPlayers; i++) {
            int indexPlayer = (int) (Math.random() * countPlayers);
            if (i != indexPlayer) {
                Player copyPlayer = players[indexPlayer];
                players[indexPlayer] = players[i];
                players[i] = copyPlayer;
            }
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.resetAttempts();
        }
        int hiddenNumber = generateHiddenNumber();

        boolean active = true;
        while(active) {
            for (Player player : players) {
                if (!player.hasAttempts()) {
                    System.out.println("У " + player +  " закончились попытки");
                    active = false;
                    break;
                }
                inputNumber(player);
                if (isGuessed(player, hiddenNumber)) {
                    active = false;
                    break;
                }
            }
        }
        outNumbersPlayers();
    }

    private int generateHiddenNumber() {
        return (int) (Math.random() * 100.0f) + 1;
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Игрок " + player + " вводит число: ");
        while (!player.addNumber(scanner.nextInt())) {
            System.out.println("Число должно быть в интервале (0,100]");
        }
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int lastNumber = player.getLastNumber();
        if (lastNumber == hiddenNumber) {
            System.out.println("Игрок " + player + " угадал число " + hiddenNumber +
                    " с " + player.getAttempt() + " попытки");
            player.increaseScores();
            return true;
        }
        System.out.println("Число " + lastNumber + (lastNumber < hiddenNumber ? " меньше " : " больше ") +
                "того, что загадал компьютер");
        return false;
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

    private void outWinner() {
        int countPlayers = players.length;
        int maxScores = 0;
        int countWinners = 0;

        for (int i = 0; i < countPlayers - 1; i++) {
                if (players[i].getScores() > maxScores) {
                    maxScores = players[i].getScores();
                    countWinners = 1;
                } else if (maxScores > 0 && players[i].getScores() == maxScores) {
                    countWinners++;
                }
        }
        if (countWinners == 0) {
            System.out.println("\nНет победителя");
            return;
        }
        if (countWinners == countPlayers) {
            System.out.println("\nНичья");
            return;
        }
        System.out.printf((countWinners == 1 ? "\nПобедитель: " : "\nПобедители: "));
        for (int i = 0; i < countPlayers - 1; i++) {
            if (players[i].getScores() == maxScores) {
                System.out.print(players[i] + " ");
                if (countWinners == 1) {
                    break;
                }
            }
        }
    }
}