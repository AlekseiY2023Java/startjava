package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int COUNT_PLAYERS = 2;
    private static final int COUNT_ATTEMPTS = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = getNewPlayers(COUNT_PLAYERS, COUNT_ATTEMPTS);
        GuessNumber game = new GuessNumber(players);

        String playerResponse = "yes";
        do {
            if (playerResponse.equals("yes")) {
                game.play();
            }
            System.out.print("\nХотите продолжить игру? [yes/no] ");
            playerResponse = scanner.nextLine();
        } while (!playerResponse.equals("no"));
    }

    private static Player[] getNewPlayers(int countPlayers, int countAttempts) {
        Player[] players = new Player[countPlayers];
        for (int i = 0; i < countPlayers; i++) {
            players[i] = getNewPlayer(i + 1, countAttempts);
        }
        return players;
    }

    private static Player getNewPlayer(int numberPlayer, int countAttempts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите имя " + numberPlayer + "-го игрока ");
        return new Player(scanner.nextLine(), countAttempts);
    }
}