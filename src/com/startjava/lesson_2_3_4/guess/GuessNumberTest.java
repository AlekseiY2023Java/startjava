package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    private static final int COUNT_PLAYERS = 3;
    private static final int COUNT_ATTEMPTS = 10;
    private static final int COUNT_ROUNDS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player[] players = createPlayers();
        GuessNumber game = new GuessNumber(COUNT_ROUNDS, players);

        String playerResponse = "yes";
        do {
            if (playerResponse.equals("yes")) {
                game.play();
            }
            System.out.print("\nХотите продолжить игру? [yes/no] ");
            playerResponse = scanner.nextLine();
        } while (!playerResponse.equals("no"));
    }

    private static Player[] createPlayers() {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[COUNT_PLAYERS];
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока ");
            players[i] = new Player(scanner.nextLine(), COUNT_ATTEMPTS);
        }
        return players;
    }
}