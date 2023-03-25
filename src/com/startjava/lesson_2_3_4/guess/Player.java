package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers;
    private int attempt;

    public Player(String name, int maxCountAttempts) {
        this.name = name;
        numbers = new int[maxCountAttempts];
        attempt = 0;
    }

    public int getMaxCountAttempts() {
        return numbers.length;
    }

    public void resetAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public int getNumberLastAttempt() {
        return numbers[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public boolean isAttempts() {
        return attempt < numbers.length;
    }

    public boolean addNumber(int number) {
        if (number > 0 && number < 101) {
            numbers[attempt] = number;
            attempt++;
            return true;
        } 
        return false;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public String toString() {
        return name;
    }
}