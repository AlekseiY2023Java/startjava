package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers;
    private int attempt;
    private int wins;

    public Player(String name, int maxCountAttempts) {
        this.name = name;
        numbers = new int[maxCountAttempts];
    }

    public int getMaxCountAttempts() {
        return numbers.length;
    }

    public void resetAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public void resetWins() {
        wins = 0;
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public boolean addNumber(int number) {
        if (number > 0 && number < 101) {
            numbers[attempt] = number;
            attempt++;
            return true;
        }
        return false;
    }

    public int getAttempt() {
        return attempt;
    }

    public boolean hasAttempts() {
        return attempt < numbers.length;
    }

    public void addWin() {
        wins++;
    }

    public int getWins() {
        return wins;
    }

    public String toString() {
        return name;
    }
}